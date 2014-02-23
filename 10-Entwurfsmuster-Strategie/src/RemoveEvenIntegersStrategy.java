public class RemoveEvenIntegersStrategy
extends DoublyLinkedList.FilteringStrategy
{
    public boolean select( Object ref )
    {
        return (int)ref % 2 == 0;
    }
}