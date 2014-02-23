public class TestOfSummation
{
  public static void main(String[] args)
  {
      int sum1 = 0, sum2 = 0; int value = 1;
      while ( value <=100000 & sum1 == sum2 ) 
      {
          sum1 = SummationWithLoop.sumOfSquares( value );
          sum2 = SummationWithFormula.sumOfSquares( value );
          value++;
      }
      System.out.println( "value is: " + value );
      System.out.println( "sum (computed by loop) is: " + sum1 );
      System.out.println( "sum (computed by formula) is: " + sum2 );
  }
}
