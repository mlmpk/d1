import java.util.*;

public class KruskalAlgorithm
{   
    public static <T> Set<Edge<T>> apply( List<Edge<T>> edges )
    { 
        Partition<T> partition = new Partition<>( extractNodes( edges ) );

        Set<Edge<T>> result = new HashSet<>();          

        Collections.sort( edges ); 

        for ( Edge<T> candidate : edges )
        {
            if ( partition.hasMultipleSubsets() )
            {
                if ( partition.inDifferentSubsets( candidate.getStart(), candidate.getEnd() ) ) 
                {  
                    partition.joinSubsets( candidate.getStart(), candidate.getEnd() );
                    result.add( candidate );
                }
            }
            else
            {
                return result;
            }
        }
        return result;
    }

    private static <T> Set<T> extractNodes( List<Edge<T>> edges )
    { 
        Set<T> nodes = new HashSet<T>();          
        for ( Edge<T> e : edges )
        {
            nodes.add( e.getStart() );
            nodes.add( e.getEnd() );
        }
        return nodes;
    }
}
