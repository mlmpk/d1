public class LoadInBalance
{
    public static boolean existsBalance( int[] containers, int limit )
    {
        return existsBalanceUpTo( containers, limit, 0, 0 );
    }

    private static boolean existsBalanceUpTo( int[] containers, int limit, int divergence, int unitsLoaded )
    {
        if ( unitsLoaded >= containers.length )
        {
            return true;
        }
        int nextDivergence = divergence + containers[unitsLoaded];
        if ( Math.abs( nextDivergence ) <= limit )
        {
            boolean loadedOnPortside = existsBalanceUpTo( containers, limit, nextDivergence, unitsLoaded + 1 );
            if ( loadedOnPortside )
            {
                return true;
            }
        }
        nextDivergence = divergence - containers[unitsLoaded];
        if ( Math.abs( nextDivergence ) <= limit )
        {
            return existsBalanceUpTo( containers, limit, nextDivergence, unitsLoaded + 1 );
        } 
        else
        {
            return false;
        }
    }

    public static void main( String[] args )
    {
        int[] containers = { 5, 2, 22, 8, 4, 13 };
        int[] containers2 = { 1, 1, 1, 1, 1, 1 };
        System.out.println( existsBalance( containers, 30 ) );
        System.out.println( existsBalance( containers, 2 ) );
        System.out.println( existsBalance( containers2, 1 ) );
    }
}
