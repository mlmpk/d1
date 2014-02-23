public class ForwardIterator extends ListIterator
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
