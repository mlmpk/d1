public class GGCoding
{
    public static void main( String[] args )
    {
        firstTreeTest();
        secondTreeTest();
    }

    public static void firstTreeTest()
    {
        String s = "halloween" ;

        CharacterSearchTree hal = new CharacterSearchTree();
        for ( int i = 0; i < s.length() ; i++ )
        {
            hal.add( s.charAt( i ) );
        }
        System.out.println( "binary tree: " );
        System.out.println( "--------------------------" );
        hal.show();
        System.out.println();
        HuffmanCoding coding = new HuffmanCoding( hal.toArray() );
        System.out.println( "code table: " );
        System.out.println( "--------------------------" );
        coding.showCodeTable();
        System.out.println();
        System.out.println( "binary tree with codes: " );
        System.out.println( "--------------------------" );
        hal.show();
        String codeOfHal = "";
        for ( int i = 0; i < s.length() ; i++ )
        {
            codeOfHal += hal.getCode( s.charAt( i ) );
        }
        System.out.println( "bit code: " );
        System.out.println( "--------------------------" );
        for ( int i = 0; i < codeOfHal.length() ; i++ )
        {
            System.out.print( codeOfHal.charAt( i ) );
        }
    }

    public static void secondTreeTest()
    {
        String s = "Die Würde des Menschen ist unantastbar. " +
            "Sie zu achten und zu schützen ist Verpflichtung aller staatlichen Gewalt. " +
            "Das Deutsche Volk bekennt sich darum zu unverletzlichen und unveräußerlichen " +
            "Menschenrechten als Grundlage jeder menschlichen Gemeinschaft, des Friedens und " +
            "der Gerechtigkeit in der Welt. ";

        CharacterSearchTree gg = new CharacterSearchTree();
        for ( int i = 0; i < s.length() ; i++ )
        {
            gg.add( s.charAt( i ) );
        }
        System.out.println( "binary tree: " );
        System.out.println( "--------------------------" );
        gg.show();
        System.out.println();
        HuffmanCoding coding = new HuffmanCoding( gg.toArray() );
        System.out.println( "code table: " );
        System.out.println( "--------------------------" );
        coding.showCodeTable();
        System.out.println();
        System.out.println( "binary tree with codes: " );
        System.out.println( "--------------------------" );
        gg.show();
        String codeOfGG = "";
        for ( int i = 0; i < s.length() ; i++ )
        {
            codeOfGG += gg.getCode( s.charAt( i ) );
        }
        System.out.println( "bit code: " );
        System.out.println( "--------------------------" );
        for ( int i = 0; i < codeOfGG.length() ; i++ )
        {
            System.out.print( codeOfGG.charAt( i ) );
            if ( (i+1) % 80 == 0 )
            {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println( "input chars: " + s.length() );
        System.out.println( "input bits: " + s.length() * 8 );
        System.out.println( "output bits: " + codeOfGG.length() );
    }
}

