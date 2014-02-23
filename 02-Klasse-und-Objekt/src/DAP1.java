public class DAP1
{

    public static void main( String[] args )
    {
			Lecture dap1 = new Lecture( "DAP 1", 5 );
			dap1.add( new Student( "C", "M", 17 ) );
			dap1.add( new Student( "A", "Inf", 22 ) );
			dap1.add( new Student( "E", "M", 11 ) );
			dap1.show();
    }
}
