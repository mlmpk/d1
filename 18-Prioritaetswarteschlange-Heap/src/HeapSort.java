public class HeapSort
{
    public static <T extends Comparable<T>> T[] heapSort( T[] elements ) {
       PriorityQueue<T> pq = new PriorityQueue<>( elements.length );
       for ( T content : elements ) {
           pq.add( content );
       }
       for ( int i = elements.length-1; i >= 0; i-- ) {
           elements[i] = pq.poll();
       }
       return elements;
    }
}