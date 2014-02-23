public class ThirdProgram 
{
    public static void main( String[] args ) 
    {
        System.out.println( "average of 15 and 5: " + average( 15, five() ) );
    }
    
    public static int average( int value1, int value2 ) 
    {
        return (value1 + value2) / 2;
    }
    
    public static int five() 
    {
        return 5;
    }
}