public class DoubleIntegersStrategy 
extends DoublyLinkedList.SubstitutingStrategy
{
    public Object substitute( Object ref )
    {
        return 2 * (int)ref;
    }
}