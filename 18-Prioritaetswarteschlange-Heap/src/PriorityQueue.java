public class PriorityQueue<T extends Comparable<T>>
{
    private Object[] nodes;
    private int size;

    public PriorityQueue( int capacity ) 
    {
        if ( capacity >= 0 ) 
        {
            nodes = new Object[capacity+1];
        } else { 
            throw new RuntimeException();
        }
        size = 0;
    }

    @SuppressWarnings({"unchecked"})
    public void add( T content ) 
    {
        if ( size < nodes.length-1) {
            size++;
            nodes[size] = content;
            int current = size;
            boolean stop = (current == 1);
            while ( !stop ) 
            {
                int parent = current/2;
                if ( parent > 0 && ( (T)nodes[current] ).compareTo( (T)nodes[parent] ) > 0 ) 
                {
                    swap ( current, parent );
                    current = parent;
                } else {
                    stop = true;
                }
            }
        }
    }

    @SuppressWarnings({"unchecked"})
    public T poll() 
    {
        if ( size >= 1 ) {
            T first = (T)nodes[1];
            nodes[1] = nodes[size];
            nodes[size] = null;
            size--;
            heapify();
            return first;
        } else {
            throw new RuntimeException();
        }
    }

    @SuppressWarnings({"unchecked"})
    private void heapify() 
    {
        int current = 1;
        int leftChild, rightChild, largerChild;
        boolean stop = false;
        while ( !stop ) {
            leftChild = 2*current;
            rightChild = leftChild+1;
            if ( leftChild <= size ) 
            {
                if ( rightChild <= size ) 
                {
                    if ( ((T)nodes[rightChild]).compareTo( (T)nodes[leftChild] ) > 0 ) 
                    {
                        largerChild = rightChild;
                    } else {
                        largerChild = leftChild;
                    }
                } else {
                    largerChild = leftChild;
                }
                if ( ( (T)nodes[largerChild] ).compareTo( (T)nodes[current] ) > 0 ) 
                {
                    swap( current, largerChild );
                    current = largerChild;
                } else {
                    stop = true;
                } 
            } else {
                stop = true;
            }
        }                
    }

    private void swap( int i, int j ) 
    {
        Object help = nodes[i];
        nodes[i] = nodes[j];
        nodes[j] = help;
    }

    public int size() 
    {
        return size;
    }

}
