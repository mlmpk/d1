import java.io.*;

public class PatternMatcherTest
{
    public static void main( String[] args )
    {
        test();
    }
    
    public static void test()
    {
        try
        {
            System.out.println( PatternMatcher.contains( "aba", "testtext.txt" ) );
            System.out.println( PatternMatcher.containsAt( "aba", "testtext.txt" ) );
            System.out.println( PatternMatcher.count( "aba", "testtext.txt" ) );
        }
        catch ( IOException e ) { System.out.println( "Datei nicht lesbar " ); }
    }
}
