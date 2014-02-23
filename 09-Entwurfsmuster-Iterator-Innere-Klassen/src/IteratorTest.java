public class IteratorTest
{

    public static void main( String[] args )
    {
        testIterator();
    }
    
    public static void testIterator()
    {
        DoublyLinkedList studs = new DoublyLinkedList();
        studs.add( new Student( "A", "Inf", 123456 ) );
        studs.add( new Student( "B", "Inf", 123457 ) );
        studs.add( new Student( "C", "Inf", 123458 ) );
        studs.add( new Student( "D", "Inf", 123459 ) );
        studs.add( new Student( "E", "Inf", 123460 ) );
        studs.showAll();

        Iterator studsIterator = studs.iterator();
        while ( studsIterator.hasNext() )
        {
            System.out.println( studsIterator.next().toString() );
        }
        System.out.println();
        
        DoublyLinkedList fractions = new DoublyLinkedList();
        fractions.add( new Fraction( 2, 3 ) );
        fractions.add( new Fraction( 1, 7 ) );
        fractions.add( new Fraction( 8 ) );
        fractions.showAll();

        Iterator fractionsIterator = fractions.iterator();
        while ( fractionsIterator.hasNext() )
        {
            System.out.println( fractionsIterator.next().toString() );
        }
        System.out.println();
       
        DoublyLinkedList ints = new DoublyLinkedList();
        ints.add( 5 );
        ints.add( 6 );
        ints.add( 9 );
        ints.showAll();
        
        Iterator intsIterator = ints.iterator();
        while ( intsIterator.hasNext() )
        {
            System.out.println( intsIterator.next().toString() );
        }

     }
}
