public class SummationWithLoop
{
    public static int sumOfSquares( int n ) 
    {
        int v = 1;
        int subtotal = 0;
        while ( v <= n ) 
        {
            subtotal = subtotal + v * v;
            v = v + 1;
        }
        return subtotal;
    }
}