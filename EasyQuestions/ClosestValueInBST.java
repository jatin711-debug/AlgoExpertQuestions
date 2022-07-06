public class ClosestValueInBST {
    int helperMethod(BinaryTreeNode tree,int target,int closest){
        if(tree == null){
            return closest;
        }
        if(Math.abs(target - closest) > Math.abs(target - tree.value)){
            closest = tree.value;
        }
        if(target < tree.value){
            return helperMethod(tree.left,target,closest);
        }
        else if(target > tree.value){
            return helperMethod(tree.right,target,closest);
        }
        else 
            return closest;
    }

    int findClosestValue(BinaryTreeNode _tree, int _target){
        return helperMethod(_tree,_target,Integer.MAX_VALUE);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        tree.insert(1);
        tree.insert(13);
        tree.insert(22);
        tree.insert(14);
        tree.printTree(tree.root);

        ClosestValueInBST obj = new ClosestValueInBST();
        System.out.print(obj.findClosestValue(tree.root, 12));

    }
}
