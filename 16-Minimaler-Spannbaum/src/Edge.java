public class Edge<T> implements Comparable<Edge<T>>
{
    private T start, end;
    private int cost;
    
    public Edge( T s, T e, int c )
    {
        start = s;
        end = e;
        cost = c;
    }
    
    public String toString()
    {
        return " " + start + "--" + cost + "->" + end + " ";
    }
    
    public int compareTo( Edge<T> e )
    {
        return cost - e.cost;
    }
    
    public T getStart()
    {
        return start;
    }
    
    public T getEnd()
    {
        return end;
    }
    
    public int getCost()
    {
        return cost;
    }
    
}
