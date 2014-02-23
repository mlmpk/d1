public class Fraction
{
    private int numerator;      // Zaehler
    private int denominator;    // Nenner

    public Fraction ( int num, int denom ) 
    {
        if ( denom != 0 ) 
        {
            if ( denom < 0 ) 
            {
                numerator = -num;
                denominator = -denom;
            }
            else 
            {
                numerator = num;
                denominator = denom;
            }
            reduce();
        } 
        else 
        {
            // error: division by zero
            throw new RuntimeException();
        }
    } 

    public Fraction() 
    {
        numerator = 0;
        denominator = 1;
    } 

    public Fraction( int num )
    {
        numerator = num;
        denominator = 1;
    }

    public String toString() 
    {
        return numerator + " / " + denominator;
    }

    public Fraction changeSign()
    {
        return new Fraction( -numerator, denominator );
    }

    public Fraction reverse()
    {
        return new Fraction( denominator, numerator );
    }

    public Fraction add( Fraction other )
    {
        int num = numerator * other.denominator + other.numerator * denominator;
        int denom = denominator * other.denominator;
        return new Fraction ( num, denom );
    }

    public Fraction subtract( Fraction other )
    {
        int num = numerator * other.denominator - other.numerator * denominator;
        int denom = denominator * other.denominator;
        return new Fraction ( num, denom );
    }

    public Fraction multiply( Fraction other )
    {
        int num = numerator * other.numerator;
        int denom = denominator * other.denominator;
        return new Fraction ( num, denom );
    }

    public Fraction divideBy( Fraction other )
    {
        return multiply ( other.reverse() );
    }

    public double toDouble()
    {
        return (double)numerator / (double)denominator;
    }

    public Fraction clone() {
        return new Fraction( numerator, denominator );
    }    

    public boolean equals( Fraction other ) 
    {
        return numerator == other.numerator & denominator == other.denominator;
    }

    private void reduce() 
    {
        if ( numerator != 0 )
        {
            int gcd = Utilities.calculateGcd( numerator, denominator );
            numerator /= gcd;
            denominator /= gcd;
        }
        else 
        {
            denominator = 1;
        }
    }
}