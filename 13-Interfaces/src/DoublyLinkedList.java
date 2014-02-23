public class DoublyLinkedList<T>
implements Iterable<T>
{
    private Element<T> first, last;
    private int size;

    public DoublyLinkedList()
    {
        first = last = null;
        size = 0;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public void add( T content ) 
    {
        Element<T> e = new Element<T>( content );
        if ( isEmpty() ) 
        {
            first = last = e;
        }
        else 
        {
            last.addNext( e );
            last = e;
        }
        size++;
    }

    public void addFirst( T content ) 
    {
        Element<T> e = new Element<T>( content );
        if ( isEmpty() ) 
        {
            first = last = e;
        }
        else 
        {
            first.addPrevious( e );
            first = e;
        }
        size++;
    }

    public T getFirst() 
    {
        if ( !isEmpty() )
        {
            return first.getContent();
        }
        else
        {
            throw new RuntimeException();
        }
    }

    public T get( int index ) 
    {
        if ( index >= 0 && index < size )
        {
            Element<T> current = first;
            for ( int i = 0; i < index; i++ )
            {
                current = current.getNext();
            }
            return current.getContent();
        }
        else
        {
            throw new RuntimeException();
        }
    }

    public T removeFirst()
    {
        if ( !isEmpty() ) 
        {
            T result = first.getContent();
            if ( first.hasNext() )
            {
                first = first.cutNext();
            }
            else
            {
                first = last = null;
            }
            size--;
            return result;
        }
        else
        {
            throw new RuntimeException();
        }
    }

    public void showAll()
    {
        Element<T> current = first;
        while ( current != null )
        {
            System.out.print( current.getContent().toString() );
            if ( current != last )
            {
                System.out.print(", ");
            }
            current = current.getNext();
        }
        System.out.println();
    }

    // Iterator

    public Iterator<T> iterator()
    {
        return new ForwardIterator<T>( first );
    }

    private static abstract class ListIterator<I> implements Iterator<I>
    {
        protected Element<I> next;

        protected ListIterator( Element<I> elem )
        {
            next = elem;
        }

        public boolean hasNext()
        {
            return next != null;
        }
    }

    private static class ForwardIterator<F> extends ListIterator<F>
    {
        public ForwardIterator( Element<F> elem )
        {
            super( elem );
        }

        public F next()
        {
            if ( hasNext() )
            {
                F content = next.getContent();
                next = next.getNext();
                return content;
            }
            else
            {
                throw new RuntimeException();
            }
        }
    }
    
    // Element

    private static class Element<E>
    {
        private E content;
        private Element<E> previous, next;

        public Element( E c )
        {
            content = c;
            previous = next = null;
        }

        public E getContent()
        {
            return content;
        }

        public void setContent( E c )
        {
            content = c;
        }

        public boolean hasNext()
        {
            return next != null;
        }

        public Element<E> getNext()
        {
            return next;
        }

        public void addNext( Element<E> e)
        {
            next = e;
            e.previous = this;
        }

        public Element<E> cutNext()
        {
            Element<E> e = next;
            next = null;
            e.previous = null;
            return e;
        }

        public boolean hasPrevious()
        {
            return previous != null;
        }

        public Element<E> getPrevious()
        {
            return previous;
        }

        public void addPrevious( Element<E> e )
        {
            previous = e;
            e.next = this;
        }

        public Element<E> cutPrevious()
        {
            Element<E> e = previous;
            previous = null;
            e.next = null;
            return e;
        }

    }

}
