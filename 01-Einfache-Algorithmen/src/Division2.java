public class Division2
{
    public static int sumsDivisibleBy( int d ) 
    {
        int sum = 0;
        int count = 0;
        for ( int value = 1; value < 1000; value++ ) 
        {
            sum += value * value;
            if ( sum % d == 0 )
            {
                count++;
            }
        }
        return count;
    }
}
