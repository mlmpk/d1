public class HuffmanTree
{
    private HuffmanTriple content;
    private HuffmanTree leftChild, rightChild;

    // single node tree 
    public HuffmanTree( HuffmanTriple t ) 
    {
        content = t;
        leftChild = null;
        rightChild = null;
    }

    // new root for multiple nodes tree 
    public HuffmanTree( HuffmanTree lc, HuffmanTree rc ) 
    {
        content = new HuffmanTriple ( ' ', lc.content.getQuantity() + rc.content.getQuantity() );
        leftChild = lc;
        rightChild = rc;
    }

    public boolean isLeaf()
    {
        return leftChild == null && rightChild == null;
    }

    public HuffmanTriple getContent() 
    {
        return content;
    }

    public void generateCodes()
    {

        if ( !isLeaf() ) 
        {
            leftChild.content.setCode( content.getCode() + "0" );
            leftChild.generateCodes();
            rightChild.content.setCode( content.getCode() + "1" );
            rightChild.generateCodes();
        }

    }

    public void showCodes()
    {
        if ( isLeaf() )
        {
            System.out.println( content.toString() );
        }
        else
        {
            leftChild.showCodes();
            rightChild.showCodes();
        }
    }

}
