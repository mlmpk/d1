public class HashtableTest
{
    public static void main( String[] args )
    {
        test();
    }
    
    public static void test()
    {
        Hashtable<Double> set = new Hashtable<>(9);
        set.put( 5.1 ); set.put( 7.3 ); set.put( 5.1 ); set.put( 8.2 ); set.put( 11.0 ); set.put( 5.1 ); set.put( 15.7 ); 
        set.showAll();
        System.out.println( set.contains( 5.1 ) );
        System.out.println( set.contains( 7.3 ) );
        System.out.println( set.contains( 8.2 ) );
        System.out.println( set.contains( 11.0 ) );
        System.out.println( set.contains( 15.7 ) );
        System.out.println( set.contains( 50.0 ) );
        set.remove( 7.3 );
        set.showAll();
        System.out.println( set.contains( 7.3 ) );
        set.put( 25.0 ); set.put( 27.3 ); set.put( 28.6 ); set.put( 29.8 ); 
        set.showAll();
    }
}
