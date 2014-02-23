public class QuickSortTest
{
    public static void main( String[] args )
    {
        LectureWithSortAlgorithms dap1 = new LectureWithSortAlgorithms( "DAP 1", 10 );
//         dap1.add( new Student( "A", "Inf", 22 ) );
//         dap1.add( new Student( "C", "M", 17 ) );
//         dap1.add( new Student( "B", "Inf", 23 ) );
//         dap1.add( new Student( "E", "M", 11 ) );
//         dap1.add( new Student( "B", "Inf", 14 ) );
//         dap1.add( new Student( "D", "Ph", 19 ) );
//         dap1.add( new Student( "F", "Inf", 12 ) );
//         dap1.add( new Student( "B", "Inf", 8 ) );
        dap1.add( new Student( "A", "Inf", 11 ) );
        dap1.add( new Student( "C", "M", 3 ) );
        dap1.add( new Student( "B", "Inf", 14 ) );
        dap1.add( new Student( "B", "M", 8 ) );
        dap1.add( new Student( "B", "Inf", 22 ) );
        dap1.add( new Student( "D", "Ph", 19 ) );
        dap1.add( new Student( "F", "Inf", 4 ) );
        dap1.add( new Student( "E", "Inf", 7 ) );
        dap1.show();
        System.out.println();
        System.out.println("sorted by number:");
        dap1.quickSortByNumber();
        dap1.show();
        System.out.println();
        System.out.println("sorted by name:");
        dap1.quickSortByName();
        dap1.show();
        System.out.println();
    }
}