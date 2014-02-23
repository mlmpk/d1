import java.util.*;

public class Partition<T>
{
    private Set<Set<T>> partition = new HashSet<>();
    private Map<T, Set<T>> nodeToSubset = new HashMap<>();

    public Partition( Set<T> nodes )
    {                           
        for ( T t : nodes )
        {
            Set<T> singleNodeSet = new HashSet<T>();
            singleNodeSet.add( t );           
            partition.add( singleNodeSet );
            nodeToSubset.put( t, singleNodeSet );
        }
    }

    public boolean hasMultipleSubsets()
    {
        return partition.size() > 1;
    }

    public boolean inDifferentSubsets( T t1, T t2 )
    {
        return ! ( nodeToSubset.get( t1 ).equals( nodeToSubset.get( t2 ) ) );
    }

    public void joinSubsets( T t1, T t2 )
    {
        Set<T> subset1 = nodeToSubset.get( t1 );
        Set<T> subset2 = nodeToSubset.get( t2 );
        partition.remove( subset1 );
        partition.remove( subset2 );
        Set<T> united = new HashSet<>( subset1 );
        united.addAll( subset2 );
        partition.add( united );
        for ( T node : united )
        {
            nodeToSubset.put( node, united );
        }
    }
}
