public class BinarySearchTree<T extends Comparable<T>>
{
    private T content;
    private BinarySearchTree<T> leftChild, rightChild;

    public BinarySearchTree() 
    {
        content = null;
        leftChild = null;
        rightChild = null;
    }

    public T getContent()
    {
        return content;
    }

    public boolean isEmpty() 
    {
        return content == null;
    }

    public boolean isLeaf() 
    {
        return leftChild.isEmpty() && rightChild.isEmpty();
    }

    public void add( T t )
    {
        if ( isEmpty() ) 
        {
            content = t;
            leftChild = new BinarySearchTree<T>();
            rightChild = new BinarySearchTree<T>();
        }
        else
        {
            if ( content.compareTo( t ) > 0 )
            {
                leftChild.add( t );
            }
            else if ( content.compareTo( t ) < 0 )
            {
                rightChild.add( t );
            }
        }
    }

    public int size() 
    {
        if ( isEmpty() ) 
        {
            return 0;
        }
        else
        {
            return 1 + leftChild.size() + rightChild.size();
        }       
    }

    public void show()
    {
        if ( !isEmpty() ) 
        {
            leftChild.show();
            System.out.println( content );
            rightChild.show();
        }
    } 

    public Iterator<T> listBasedIterator()
    {
        DoublyLinkedList<T> list = new DoublyLinkedList<T>();
        toList( list );
        return list.iterator();
    }

    private void toList( DoublyLinkedList<T> list )
    {
        if ( !isEmpty() ) 
        {
            leftChild.toList( list );
            list.add( content );
            rightChild.toList( list );
        }
    }

    public Iterator<T> stackBasedIterator()
    {
        return new StackBasedIterator<T>( this );
    }

    private static class StackBasedIterator<E extends Comparable<E>> extends Iterator<E>
    {
        private Stack<BinarySearchTree<E>> nodes;

        public StackBasedIterator( BinarySearchTree<E> root )
        {
            nodes = new Stack<BinarySearchTree<E>>();
            descendLeftAndPush( root );
        }

        public E next() 
        {
            if ( hasNext() ) {
                E content = nodes.peek().getContent();
                descendLeftAndPush( nodes.pop().rightChild ); 
                return content;
            } else {
                throw new RuntimeException();
            }
        }

        public boolean hasNext()
        {
            return !nodes.isEmpty();
        } 

        private void descendLeftAndPush( BinarySearchTree<E> root )
        {
            BinarySearchTree<E> current = root;
            while ( !current.isEmpty() )
            {
                nodes.push( current );
                current = current.leftChild;
            }
        }

    }
    
    public Iterator<T> iterator()
    {
        return new StackBasedIterator<T>( this );
    }
}