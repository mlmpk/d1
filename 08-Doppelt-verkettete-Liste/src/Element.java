public class Element
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
        Element e = next;
        next = null;
        e.previous = null;
        return e;
    }

}
