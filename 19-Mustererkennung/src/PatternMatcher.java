import java.util.*;
import java.io.*;

public class PatternMatcher
{
    private static Set<String> generatePrefixes( String s )
    {
        Set<String> result = new HashSet<String>();
        for( int i = 0; i <= s.length(); i++ )
        {
            result.add( s.substring( 0, i ) );
        }
        return result;
    }

    private static List<String> generateSuffixes( String s )
    {
        List<String> result = new LinkedList<String>();
        for( int i = 0; i < s.length(); i++ )
        {
            result.add( s.substring( i, s.length() ) );
        }
        return result;
    }

    public static Set<Character> generateTokens( String s )
    {
        Set<Character> result = new HashSet<>();
        for ( int i = 0; i < s.length(); i++ )
        {
            result.add( s.charAt( i ) );
        }
        return result;
    }

    private static Map<StateAndInput,Integer> generateTransitiontable( String pattern )
    {
        Map<StateAndInput,Integer> transitiontable = new HashMap<>();
        Set<Character> tokens = generateTokens( pattern );
        Set<String> prefixes = generatePrefixes( pattern );
        for ( String prefix : prefixes )
        {
            for ( char c : tokens )
            {
                String continuation = prefix + c;
                List<String> suffixes = generateSuffixes( continuation );
                for ( String suffix : suffixes )
                {
                    if ( prefixes.contains( suffix ) )
                    {
                        transitiontable.put( new StateAndInput( prefix.length(), c ), suffix.length() );
                        break;
                    }
                }
            }
        }
        return transitiontable;
    }

    public static int containsAt( String pattern, String file )
    throws IOException
    {
        Map<StateAndInput,Integer> transitiontable = generateTransitiontable( pattern );
        int state = 0;
        final int FINALSTATE = pattern.length();
        int position = 0;
        FileReader f = new FileReader( file );
        int c = f.read();
        while ( c != -1  )
        {
            position++;
            StateAndInput s = new StateAndInput( state, (char)c );
            if ( transitiontable.containsKey( s ) )
            {
                state = transitiontable.get( s );
            }
            else 
            {
                state = 0;
            }
            if ( state == FINALSTATE )
            {
                return position - pattern.length() + 1;
            }
            c = f.read();
        }
        return -1;
    }   

    public static boolean contains( String pattern, String file )
    throws IOException
    {
        return containsAt( pattern, file ) != -1;
    }   
    
    public static int count( String pattern, String file )
    throws IOException
    {
        Map<StateAndInput,Integer> transitiontable = generateTransitiontable( pattern );
        int count = 0;
        int state = 0;
        final int FINALSTATE = pattern.length();
        FileReader f = new FileReader( file );
        int c = f.read();
        while ( c != -1  )
        {
            StateAndInput s = new StateAndInput( state, (char)c );
            if ( transitiontable.containsKey( s ) )
            {
                state = transitiontable.get( s );
            }
            else 
            {
                state = 0;
            }
            if ( state == FINALSTATE )
            {
                count++;
            }
            c = f.read();
        }
        return count;
    }   

    public static class StateAndInput 
    {
        final private int STATE;
        final private char INPUT;
        final private int HASHCODE;

        public StateAndInput( int s, char i )
        {
            STATE = s;
            INPUT = i;
            HASHCODE = s * 1000 + i;
        }

        public int getState()
        {
            return STATE;
        }

        public char getInput()
        {
            return INPUT;
        }

        public boolean equals( Object o )
        {
            return ( o instanceof StateAndInput )
            && ( STATE == ((StateAndInput)o).STATE ) 
            && ( INPUT == ((StateAndInput)o).INPUT );
        }

        public int hashCode()
        {
            return HASHCODE;
        }

        public String toString()
        {
            return "(" + STATE + ", " + INPUT + ")";
        }
    }
}
