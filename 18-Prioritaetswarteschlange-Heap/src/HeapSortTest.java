public class HeapSortTest
{
    public static void main( String[] args ) 
    {
        test();
    }
    
    public static void test() 
    {
        Integer[] list = new Integer[10];
        list[0] = 53;
        list[1] = 90;
        list[2] = 76;
        list[3] = 30;
        list[4] = 41;
        list[5] = 123;       
        list[6] = 22;
        list[7] = 132;
        list[8] = 54;
        list[9] = 245;
        Integer[] sorted = HeapSort.heapSort( list );
        for ( int i : sorted ) {
            System.out.println( i + " "  );
        }
    }
}
