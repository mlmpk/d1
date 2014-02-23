public class IntegerSummationStrategy 
extends DoublyLinkedList.TraversingStrategy
{
    private int sum;
    
    public IntegerSummationStrategy()
    {
        sum = 0;
    }
    
    public void inspect( Object ref )
    {
        sum += (int)ref;
    }
    
    public int getSum()
    {
        return sum;
    }
}