public class IterableTest
{
    public static void main( String[] args )
    {
        test();
    }

    public static <F> void printData( Iterable<F> toIter )
    {
        Iterator<F> it = toIter.iterator();
        while ( it.hasNext() )
        {
            System.out.println( it.next() );
        }
    }
    
    public static void test()
    {
        BinarySearchTree<Student> studentsTree = new BinarySearchTree<>();
        studentsTree.add( new Student( "B", "Inf", 18 ) );
        studentsTree.add( new Student( "C", "M", 14 ) );
        studentsTree.add( new Student( "A", "Inf", 22 ) );
        studentsTree.add( new Student( "E", "M", 7 ) );
        studentsTree.add( new Student( "F", "Inf", 17 ) );
        studentsTree.add( new Student( "G", "M", 20 ) );
        printData( studentsTree );
        System.out.println();
        DoublyLinkedList<Integer> intsList = new DoublyLinkedList<>();
        intsList.add( 18 );
        intsList.add( 14 );
        intsList.add( 22 );
        intsList.add( 7 );
        intsList.add( 17 );
        intsList.add( 20 );
        printData( intsList );
    }
}
