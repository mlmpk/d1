public class DoubleValueStrategy extends DoublyLinkedList.ContentStrategy
{
    public Object handle( Object ref )
    {
        return 2 * (int)ref;
    }
}