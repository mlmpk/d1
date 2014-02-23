public class DoublyLinkedList
{
    private Element first, last;
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

    public void add( Object content ) 
    {
        Element e = new Element( content );
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

    public void addFirst( Object content ) 
    {
        Element e = new Element( content );
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

    public Object getFirst() 
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

    public Object get( int index ) 
    {
        if ( index >= 0 && index < size )
        {
            Element current = first;
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

    public Object removeFirst()
    {
        if ( !isEmpty() ) 
        {
            Object result = first.getContent();
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
        Element current = first;
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
        
    public Iterator iterator()
    {
        return new ForwardIterator( first );
    }

    private static abstract class ListIterator extends Iterator
    {
        protected Element next;

        protected ListIterator( Element elem )
        {
            next = elem;
        }

        public boolean hasNext()
        {
            return next != null;
        }

        public abstract Object next();
    }

    private static class ForwardIterator extends ListIterator
    {
        public ForwardIterator( Element elem )
        {
            super( elem );
        }

        public Object next()
        {
            if ( hasNext() )
            {
                Object content = next.getContent();
                next = next.getNext();
                return content;
            }
            else
            {
                throw new RuntimeException();
            }
        }
    }

    private class ReverseIterator extends ListIterator
    {
        public ReverseIterator( Element elem )
        {
            super( elem );
        }

        public Object next()
        {
            if ( hasNext() )
            {
                Object content = next.getContent();
                next = next.getPrevious();
                return content;
            }
            else
            {
                throw new RuntimeException();
            }
        }
    }

    private static class Element
    {
        private Object content;
        private Element previous, next;

        public Element( Object c )
        {
            content = c;
            previous = next = null;
        }

        public Object getContent()
        {
            return content;
        }

        public void setContent( Object c )
        {
            content = c;
        }

        public boolean hasNext()
        {
            return next != null;
        }

        public Element getNext()
        {
            return next;
        }

        public void addNext( Element e)
        {
            next = e;
            e.previous = this;
        }

        public Element cutNext()
        {
            Element e = next;
            next = null;
            e.previous = null;
            return e;
        }

        public boolean hasPrevious()
        {
            return previous != null;
        }

        public Element getPrevious()
        {
            return previous;
        }

        public void addPrevious( Element e )
        {
            previous = e;
            e.next = this;
        }

        public Element cutPrevious()
        {
            Element e = previous;
            previous = null;
            e.next = null;
            return e;
        }

    }

}
