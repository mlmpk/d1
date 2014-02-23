public class LectureWithSortAlgorithms
{
    private String title;
    private Student[] students;
    private int firstUnused;

    public LectureWithSortAlgorithms( String t, int cap ) 
    {
        title = t;
        students = new Student[cap];
        firstUnused = 0;
    }

    public void add( Student s ) 
    {
        if ( firstUnused < students.length ) 
        {
            students[firstUnused] = s;
            firstUnused++;
        }
    }

    public void show() 
    {
        System.out.println( "lecture: " + title );
        System.out.println( "participants:");
        for ( Student s : students )
        {
            if ( s != null )
            {
                System.out.println( s.toString() );
            }
        }
    }

    private void swapStudents( int i, int j )
    {
        if ( i != j) 
        {
            Student temp = students[i];
            students[i] = students[j];
            students[j] = temp;
        }
    }

    public void insertionSortByNumber() 
    {
        for ( int i = 1; i < firstUnused; i++ ) 
        {
            shiftStudentsByNumber( i );
        }
    }

    private void shiftStudentsByNumber( int start )
    {
        Student toInsert = students[start];
        int i = start;
        while ( i > 0 && students[i - 1].hasGreaterNumber( toInsert ) )
        {
            students[i] = students[i - 1];
            i--;
        } 
        students[i] = toInsert;
    }

    public void insertionSortByName() 
    {
        for ( int i = 1; i < firstUnused; i++ ) 
            shiftStudentsByName( i );
    }

    private void shiftStudentsByName( int start )
    {
        Student toInsert = students[start];
        int i = start;
        while ( i > 0 && students[i - 1].hasGreaterName( toInsert ) )
        {
            students[i] = students[i - 1];
            i--;
        } 
        students[i] = toInsert;
    }

    public void selectionSortByName() 
    {
        for ( int i = 0; i < firstUnused - 1; i++ ) 
        {
            int position = searchForMinimalName( i );
            swapStudents( i, position );
        }
    }

    private int searchForMinimalName( int start )
    {
        int selected = start;
        for ( int i = start + 1; i < firstUnused; i++ ) 
        {
            if ( students[selected].hasGreaterName( students[i] ) )
            {
                selected = i;
            } 
        }
        return selected;
    }

    public void selectionSortByNumber() 
    {
        for ( int i = 0; i < firstUnused - 1; i++ ) 
        {
            int position = searchForMinimalNumber( i );
            swapStudents( i, position );
        }
    }

    private int searchForMinimalNumber( int start )
    {
        int selected = start;
        for ( int i = start + 1; i < firstUnused; i++ ) 
        {
            if ( students[selected].hasGreaterNumber( students[i] ) )
            {
                selected = i;
            } 
        }
        return selected;
    }

    public void quickSortByNumber() 
    {
        groupByNumber( 0, firstUnused-1 );
    }

    private void groupByNumber( int leftBound, int rightBound )
    {
        if ( leftBound < rightBound )
        {
            int pivotIndex = leftBound + (rightBound - leftBound) / 2;
            Student pivotObject = students[pivotIndex];
            int left = leftBound; 
            int right = rightBound;

            while ( left < right )
            {
                left = findGreaterNumberFromLeft( left, rightBound, pivotObject );
                right = findSmallerOrEqualNumberFromRight( right, leftBound, pivotObject );
                if ( left < right )
                {
                    swapStudents( left, right );
                }
            }
            if ( pivotObject.hasGreaterNumber( students[left] ) )
            {
                swapStudents( left, pivotIndex );
            }
            groupByNumber( leftBound, left - 1 );
            groupByNumber( left , rightBound );
        }
    }

    private int findGreaterNumberFromLeft( int left, int rightBound, Student pivotObject )
    {
        while ( left < rightBound && ! students[left].hasGreaterNumber( pivotObject ) )
        {
            left++;
        } 
        return left;
    }

    private int findSmallerOrEqualNumberFromRight( int right, int leftBound, Student pivotObject )
    {
        while ( right > leftBound && students[right].hasGreaterNumber( pivotObject ) )
        {
            right--;
        }
        return right;
    }

    public void quickSortByName() 
    {
        groupByName( 0, firstUnused - 1 );
    }

    private void groupByName( int leftBound, int rightBound )
    {
        if ( leftBound < rightBound )
        {
            int pivotIndex = leftBound + (rightBound - leftBound) / 2;
            Student pivotObject = students[pivotIndex];
            int left = leftBound; 
            int right = rightBound;

            while ( left < right )
            {
                left = findGreaterNameFromLeft( left, rightBound, pivotObject );
                right = findSmallerOrEqualNameFromRight( right, leftBound, pivotObject );
                if ( left < right )
                {
                    swapStudents( left, right );
                }
            }
            if ( pivotObject.hasGreaterName( students[left] ) )
            {
                swapStudents( left, pivotIndex );
            }
            groupByName( leftBound, left - 1 );
            groupByName( left , rightBound );
        }
    }

    private int findGreaterNameFromLeft( int left, int rightBound, Student pivotObject )
    {
        while ( left < rightBound && ! students[left].hasGreaterName( pivotObject ) )
        {
            left++;
        } 
        return left;
    }

    private int findSmallerOrEqualNameFromRight( int right, int leftBound, Student pivotObject )
    {
        while ( right > leftBound && students[right].hasGreaterName( pivotObject ) )
        {
            right--;
        }
        return right;
    }

    private void show( String explain, int low, int high )
    {
        System.out.println( explain + "( " + low + ", " + high + " )" );
        for (int i = low; i <= high; i++ )
        {
            System.out.println( "  " + students[i].toString() );
        }
        System.out.println();
    }

}