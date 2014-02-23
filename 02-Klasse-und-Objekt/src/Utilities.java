public class Utilities
{
    public static int calculateGcd( int v1, int v2 ) {
        int i1 = Math.abs(v1);
        int i2 = Math.abs(v2);
        while (i1 != 0 & i2 != 0)
        {
            if ( i1 > i2 )
            {
                i1 = i1 % i2;
            } 
            else 
            {
                i2 = i2 % i1;
            }
        }
        return i1 + i2;
    }
}