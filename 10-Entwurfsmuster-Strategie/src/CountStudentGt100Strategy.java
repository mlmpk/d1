public class CountStudentGt100Strategy 
extends DoublyLinkedList.TraversingStrategy
{
    private int quantity;
    
    public CountStudentGt100Strategy() { quantity = 0; }
    
    public void inspect( Object ref )
    {
        if ( ((Student)ref).getRegistrationNo() >100 )
        {
            quantity++;
        }
    }
    
    public int getQuantity() { return quantity; }
}