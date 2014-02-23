public class SieveOfEratosthenes
{
    public static boolean[] initializeNumbers( int n ) 
    {
        boolean[] numbers = new boolean[n+1];
        for ( int i = 2; i < numbers.length; i++ )
        {
            numbers[i] = true;
        }
        return numbers;
    }

    public static void inspectNumbers( boolean[] numbers ) 
    {
        double limit = Math.sqrt( numbers.length );
        for ( int i = 2; i <= limit; i++ )
        {
            if ( numbers[i] ) 
            {
                discardMultiples( numbers, i );
            }
        }
    }

    public static void discardMultiples( boolean[] numbers, int i ) 
    {
        for ( int j = i*i; j < numbers.length; j+=i ) 
        {
            numbers[j] = false;
        }
    }

    public static void show( boolean[] numbers ) 
    {
        for ( int i = 0; i < numbers.length; i++ ) 
        {
            if ( numbers[i] )
            {
                System.out.print( i + "  " );
            }
        }
        System.out.println();
    }

    public static int countPrimeNumbers( boolean[] numbers )
    {
        int count = 0;
        for ( boolean b : numbers )
        {
            if ( b ) {
                count++;
            }
        }
        return count;
    }

    public static int[] primeNumbersToArray( boolean[] numbers ) 
    {
        int[] primes = new int[countPrimeNumbers( numbers )];
        int nextPosition = 0;
        for (int i = 0; i < numbers.length; i++) 
        {
            if ( numbers[i] )
            {
                primes[nextPosition] = i;
                nextPosition++;
            }
        }
        return primes;
    }
    
    public static void show( int[] primes ) 
    {
        for ( int p : primes ) 
        {
            System.out.print( p + "  " );
        }
        System.out.println();
    }
    
    public static void computePrimes( int n )
    {
        boolean[] numbers = initializeNumbers( n );
        inspectNumbers( numbers );
        int[] primes = primeNumbersToArray( numbers );
        show( primes );
    }
}
