public class ReverseIterator extends ListIterator
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
