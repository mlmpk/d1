public class ForwardIteratorV1
{
    private Element next;

    public ForwardIteratorV1( Element elem )
    {
        next = elem;
    }

    public boolean hasNext()
    {
        return next != null;
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