public class Person
{
    private String firstName;
    private String familyName;
    private String cityOfResidence;
    private int yearOfBirth;
    
    public Person( String fi, String fa, String c, int y )
    {
        firstName = fi;
        familyName = fa;
        cityOfResidence = c;
        yearOfBirth = y;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    

    public String getFamilyName()
    {
        return familyName;
    }
    
    public String getCity() 
    {
        return cityOfResidence;
    }
    
    public void setCity( String c )
    {
        cityOfResidence = c;
    }
    
    public int getYearOfBirth()
    {
        return yearOfBirth;
    }
    
    public String toString()
    {
        return "family name: " + familyName + ", first name: " + firstName + 
               ", born in " + yearOfBirth + ", living in: " + cityOfResidence;
    }
    
    public boolean isEqualTo( Person p )
    {
        return ( familyName.compareTo( p.familyName ) == 0 )
               && (firstName.compareTo( p.firstName ) == 0 )
               && yearOfBirth == p.yearOfBirth;
    }
    
    public int compareTo( Person p )
    {
        int compFamilyName = familyName.compareTo( p.familyName );
        if ( compFamilyName != 0 )
        {
            return compFamilyName;
        } 
        else 
        {
            return firstName.compareTo( p.firstName );
        }
    }
    
    // only for experiments
    
    public void whichMethodIsCalled( Person p )
    {
        System.out.println( "Person" );
    }
}
