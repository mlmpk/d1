public class StairsOfOH14 
{
    public static long routesToTop( long stairs ) 
    {
        if ( stairs <= 2 ) 
        {
            return stairs;
        } 
        else 
        {
            return routesToTop( stairs - 1 ) + routesToTop( stairs - 2 );
        }
    }
    
    public static long iterativRoutesToTop( long stairs ) 
    {
        if ( stairs <= 2 ) 
        {
            return stairs;
        }  
        else
        {
            long next = 0, old1 = 1, old2 = 2;
            for (int i = 3; i <= stairs; i++) 
            {
                next = old1 + old2;
                old1 = old2;
                old2 = next;
            }           
            return next;
        }
    }
}