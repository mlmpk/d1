import java.util.*;

public class KruskalAlgorithmTest
{

    public static void main( String[] args )
    {
//         List<Edge<String>> edges = new LinkedList<Edge<String>>();  
//         edges.add( new Edge<String>( "B", "F", 428) );
//         edges.add( new Edge<String>( "F", "G", 388) );
//         edges.add( new Edge<String>( "B", "D", 315) );
//         edges.add( new Edge<String>( "B", "C", 200) );
//         edges.add( new Edge<String>( "C", "F", 150) );
//         edges.add( new Edge<String>( "A", "G", 145) );
//         edges.add( new Edge<String>( "E", "G", 96) );
//         edges.add( new Edge<String>( "C", "D", 80) );
//         edges.add( new Edge<String>( "B", "E", 49) );
//         edges.add( new Edge<String>( "B", "G", 50) );
//         edges.add( new Edge<String>( "A", "E", 63) );
//         edges.add( new Edge<String>( "A", "B", 42) );
//         edges.add( new Edge<String>( "D", "F", 37) );
//         edges.add( new Edge<String>( "D", "G", 215) );
//         System.out.println( KruskalAlgorithm.apply( edges ) );
//       
        
        List<Edge<Integer>> edges = new LinkedList<>();  
        edges.add( new Edge<Integer>( 2, 6, 428) );
        edges.add( new Edge<Integer>( 6, 7, 388) );
        edges.add( new Edge<Integer>( 2, 4, 315) );
        edges.add( new Edge<Integer>( 2, 3, 200) );
        edges.add( new Edge<Integer>( 3, 6, 150) );
        edges.add( new Edge<Integer>( 1, 7, 145) );
        edges.add( new Edge<Integer>( 5, 7, 96) );
        edges.add( new Edge<Integer>( 3, 4, 80) );
        edges.add( new Edge<Integer>( 2, 5, 63) );
        edges.add( new Edge<Integer>( 2, 7, 50) );
        edges.add( new Edge<Integer>( 1, 5, 49) );
        edges.add( new Edge<Integer>( 1, 2, 42) );
        edges.add( new Edge<Integer>( 4, 6, 37) );
        System.out.println( KruskalAlgorithm.apply( edges ) );
        
    }
    
}
