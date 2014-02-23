public class Student extends Person
{
    private String subject;
    private int registrationNo;
    
    public Student( String fi, String fa, String c, int y, String sub, int no ) 
    {
        super( fi, fa, c, y );
        subject = sub;
        registrationNo = no;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public int getRegistrationNo() {
        return registrationNo;
    }
    
    public boolean isGreaterByNumber( Student s )
    {
        return getRegistrationNo() > s.getRegistrationNo();
    }
    
    public boolean isEqualByNumber( Student s )
    {
        return getRegistrationNo() == s.getRegistrationNo();
    }
    
    public boolean isGreaterByName( Student s )
    {
        return compareTo( s ) > 0;
    }
    
    public boolean isEqualByName( Student s )
    {
        return compareTo( s ) == 0;
    }
    
    public boolean isEqualTo( Student s )
    {
        return super.isEqualTo( s ) && getRegistrationNo() == s.getRegistrationNo();
    }
    
    public String toString() {
        return super.toString() + ", registration number: " + getRegistrationNo() + 
               "(" + getSubject() + ")";
    }
    
    // only for experiments
    
    public void whichMethodIsCalled( Student p )
    {
        System.out.println( "Student" );
    }
    
    @Override
    public void whichMethodIsCalled( Person p )
    {
        System.out.println( "overridden in Student" );
    }
    
   public String txString() {
        return "family name: " + getFamilyName() + ", first name: " + getFirstName() + 
               ", born in " + getYearOfBirth() + ", living in: " + getCity() + 
               ", registration number: " + getRegistrationNo() + 
               "(" + getSubject() + ")";
    }
}
