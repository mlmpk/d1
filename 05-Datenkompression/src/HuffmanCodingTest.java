public class HuffmanCodingTest
{
    public static void main(String[] args)
    {
        HuffmanTriple[] tokens1 = { new HuffmanTriple( 'a', 30 ), 
                new HuffmanTriple( 'b', 20 ), 
                new HuffmanTriple( 'c', 10 ), 
                new HuffmanTriple( 'd', 15 ), 
                new HuffmanTriple( 'e', 80 )
            };
        HuffmanCoding hc = new HuffmanCoding( tokens1 );
        hc.showCodeTable();  
        System.out.println();         
        HuffmanTriple[] tokens2 = { new HuffmanTriple( 'a', 2130 ), 
                new HuffmanTriple( 'b', 4020 ), 
                new HuffmanTriple( 'c', 11510 ), 
                new HuffmanTriple( 'd', 5715 ), 
                new HuffmanTriple( 'e', 8418 ),
                new HuffmanTriple( 'f', 9731 ), 
                new HuffmanTriple( 'g', 6439 ), 
                new HuffmanTriple( 'h', 10455 )
            };
        hc = new HuffmanCoding( tokens2 );
        hc.showCodeTable();  
        System.out.println();   
    }
}
