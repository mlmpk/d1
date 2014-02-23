public class Lecture
{
    private String title;
    private Student[] studs;
    private int firstUnused;

    public Lecture( String t, int cap ) 
    {
        title = t;
        studs = new Student[cap];
        firstUnused = 0;
    }

    public boolean add( Student s ) 
    {
        if ( firstUnused < studs.length ) 
        {
            studs[firstUnused] = s;
            firstUnused++;
            return true;
        }
        return false;
    }

    public void show() 
    {
        System.out.println( "lecture: " + title );
        System.out.println( "participants:");
        for ( Student s : studs )
        {
            if ( s != null )
            {
                System.out.println( s.toString() );
            }
        }
    }
}