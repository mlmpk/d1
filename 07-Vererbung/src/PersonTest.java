public class PersonTest
{
    private static void display( String opt, String ort, String pdt, String prt ) 
    {
        System.out.print( opt + "\t\t" + ort + "\t\t" + pdt + "\t\t" + prt + "\t\t" );
    }
        
    public static void testTypeCombinations()
    {       
         Person pWithP = new Person( "P", "P", "C", 1 );
         Student sWithS = new Student( "S", "S", "C", 1, "S", 1 );
         Person pWithS = sWithS;
         System.out.println( "calling reference\t\targument" );
         System.out.println( "declared type\truntime type\tdeclared type\truntime type\tmethod from" );
         System.out.println( "-----------------------------------------------------------------------------" );
         display( "Person", "Person", "Person", "Person" ); pWithP.whichMethodIsCalled( pWithP );
         display( "Person", "Person", "Person", "Student" ); pWithP.whichMethodIsCalled( pWithS );
         display( "Person", "Person", "Student", "Student" ); pWithP.whichMethodIsCalled( sWithS );
         display( "Person", "Student", "Person", "Person" ); pWithS.whichMethodIsCalled( pWithP );
         display( "Person", "Student", "Person", "Student" ); pWithS.whichMethodIsCalled( pWithS );
         display( "Person", "Student", "Student", "Student" ); pWithS.whichMethodIsCalled(sWithS );
         display( "Student", "Student", "Person", "Person" ); sWithS.whichMethodIsCalled( pWithP );
         display( "Student", "Student", "Person", "Student" ); sWithS.whichMethodIsCalled( pWithS );
         display( "Student", "Student", "Student", "Student" ); sWithS.whichMethodIsCalled( sWithS );
    }
    
    public static void main( String[] args )
    {
        testTypeCombinations();
    }

}
