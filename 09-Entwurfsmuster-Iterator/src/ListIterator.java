public abstract class ListIterator
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
