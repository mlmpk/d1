public class StrategiesTest
{

    public static void main( String[] args )
    {
        testStrategy();
    }

    public static void testStrategy()
    {
        System.out.println("IntegerSummationStrategy");
        DoublyLinkedList ints = new DoublyLinkedList();
        ints.add( 5 );
        ints.add( 6 );
        ints.add( 11 );
        ints.add( 2 );
        ints.add( 9 );
        System.out.print("in: ");
        ints.showAll();
        IntegerSummationStrategy sumUp = new IntegerSummationStrategy();
        System.out.print("sum: ");
        ints.inspectAll( sumUp );
        System.out.println( sumUp.getSum() );
        System.out.println();
        System.out.println("DoubleIntegersStrategy");
        DoubleIntegersStrategy manip = new DoubleIntegersStrategy();
        System.out.print("in: ");
        ints.showAll();
        ints.substituteAll( manip );
        System.out.print("substituted: ");
        ints.showAll();
        System.out.println();
        System.out.println("AddNStrategy");
        AddNStrategy add5 = new AddNStrategy( 5 );
        System.out.print("in: ");
        ints.showAll();
        ints.substituteAll( add5 );
        System.out.print("substituted: ");
        ints.showAll();
        System.out.println();
        System.out.println("RemoveEvenIntegersStrategy 1");
        RemoveEvenIntegersStrategy filter = new RemoveEvenIntegersStrategy();
        System.out.print("in: ");
        ints.showAll();
        ints.checkAll( filter );
        System.out.print("substituted: ");
        ints.showAll();
        System.out.println();
        System.out.println("RemoveEvenIntegersStrategy 2");
        ints.add( 4 );
        ints.add( 5 );
        ints.add( 12 );
        ints.add( 17 );
        ints.add( 8 );
        System.out.print("in: ");
        ints.showAll();
        ints.checkAll( filter );
        System.out.print("substituted: ");
        ints.showAll();
        System.out.println();
        System.out.println("RemoveEvenIntegersStrategy 3"); 
        ints.substituteAll( add5 );
        System.out.print("in: ");
        ints.showAll();
        ints.checkAll( filter );
        System.out.print("substituted: ");
        ints.showAll();
        System.out.println();
        System.out.println("CountStudentGt100Strategy");
        DoublyLinkedList students = new DoublyLinkedList();
        students.add( new Student( "A", "Inf", 45 ) );
        students.add( new Student( "B", "Inf", 167 ) );
        students.add( new Student( "C", "Inf", 22 ) );
        students.add( new Student( "D", "Inf", 124 ) );
        students.add( new Student( "E", "Inf", 123 ) );
        students.add( new Student( "F", "Inf", 12 ) );
        System.out.print("in: ");
        students.showAll();
        CountStudentGt100Strategy counter = new CountStudentGt100Strategy();
        students.inspectAll( counter );
        System.out.print("quantity: ");
        System.out.println( counter.getQuantity() );
        System.out.println();
    }
}
