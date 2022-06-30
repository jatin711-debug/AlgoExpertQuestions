public class BinaryTreeNode {
    public BinaryTreeNode left;
    public BinaryTreeNode right;
    public int value;

    public BinaryTreeNode(int value){
        this.left = null;
        this.right = null;
        this.value = value;
    }
    @Override
    public String toString() {
        return "Value:->"+this.value;
    }
}
