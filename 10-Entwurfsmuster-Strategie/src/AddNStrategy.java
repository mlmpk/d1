public class AddNStrategy
extends DoublyLinkedList.SubstitutingStrategy
{
    private int n;

    public AddNStrategy( int increment )
    {
        n = increment;
    }

    public Object substitute( Object ref )
    {
        return (int)ref + n;
    }
}