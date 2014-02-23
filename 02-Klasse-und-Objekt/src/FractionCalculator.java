public class FractionCalculator
{    
    public static void main( String[] args )
    {
        Fraction f1 = new Fraction ( 4, 5 );
        Fraction f2 = new Fraction ( 6, -9 );
        Fraction f3 = f1.add( f2 );
        Fraction f4 = new Fraction(7);
        Fraction f5 = f4.add( f2.multiply( f3.subtract( f1 ) ) );
        System.out.println( f5.toString() );
    }
}