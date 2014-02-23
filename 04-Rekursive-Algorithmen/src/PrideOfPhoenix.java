public class PrideOfPhoenix
{
    private static void rearrangePots( int quantity, int start, int target ) 
    {
        String[] locations = { "stove", "sink", "cupboard" };
        if (quantity > 0) 
        {
            rearrangePots( quantity - 1, start, computeInterimPosition( start, target ) );
            System.out.println( "pot " + quantity + ": " + locations[start] + " -> " + locations[target] );
            rearrangePots( quantity - 1, computeInterimPosition( start, target ), target );
        }
    }

    private static int computeInterimPosition( int start, int target )
    {
        return 3 - start - target;
    }

    public static void rearrangeAllPots( int quantity )
    {
        rearrangePots( quantity, 0, 2 );
    }
}
