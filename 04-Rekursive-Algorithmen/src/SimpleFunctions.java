public class SimpleFunctions
{
    public static int recursiveSumOfSquares( int n )
    {
        if ( n > 1 ) {
            return n * n + recursiveSumOfSquares( n - 1 );
        }
        else
        {
            return n;
        }
    }
    
    public static int recursiveCalculateGcd( int v1, int v2 ) {
        int i1 = Math.abs(v1);
        int i2 = Math.abs(v2);
        if (i1 != 0 & i2 != 0)
        {
            if ( i1 > i2 )
            {
                return recursiveCalculateGcd( i1 % i2, i2);
            } 
            else 
            {
                return recursiveCalculateGcd( i1, i2 % i1);
            }
        }
        return i1 + i2;
    }
}
