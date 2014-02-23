public class HuffmanCoding
{
    HuffmanTree[] trees;

    public HuffmanCoding( HuffmanTriple[] input )
    {
        // compression only if different tokens appear
        if ( input.length > 1 )
        {
            initializeTrees( input );
            buildTree();
            trees[trees.length-1].generateCodes();
        }
        else
        {
            throw new RuntimeException();
        }
    }

    private void initializeTrees( HuffmanTriple[] input )
    {
        trees = new HuffmanTree[input.length];
        for ( int i = 0; i < input.length; i++ )
        {
            trees[i] = new HuffmanTree( input[i] );
        }
    }

    private void insertionSort( int start ) 
    {
        for ( int i = start + 1; i < trees.length; i++ ) 
        {
            shiftTrees( i );
        }
    }

    private void shiftTrees( int start )
    {
        if (  start < trees.length )
        {
            HuffmanTree toInsert = trees[start];
            int i = start;
            while ( i > 0 && trees[i - 1].getContent().getQuantity() > toInsert.getContent().getQuantity() )
            {
                trees[i] = trees[i - 1];
                i--;
            } 
            trees[i] = toInsert;
        }
    }

    private void buildTree()
    {
        for ( int i = 0; i+1 < trees.length; i++ )
        {
            insertionSort( i );
            trees[i+1] = new HuffmanTree( trees[i], trees[i+1] );
        }
    }

    public void showCodeTable()
    {
        trees[trees.length-1].showCodes();
    }

}
