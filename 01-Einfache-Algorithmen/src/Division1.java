public class Division1
{
    public static int sumsDivisibleBy( int d ) 
    {
        int value = 1;
        int sum = 0;
        int count = 0;
        while ( value < 1000 ) 
        {
            sum += value * value;
            if ( sum % d == 0 )
            {
                count++;
            }
            value++;
        }
        return count;
    }
}
