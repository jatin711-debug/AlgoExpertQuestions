import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    public BinaryTreeNode root;
    public void insert(int value){
        BinaryTreeNode node = new BinaryTreeNode(value);
        if(root == null){
            root = node;
            return;
        }else{
            BinaryTreeNode currentNode = root;
            while(true){
                // left
                if(value < currentNode.value){
                    if(currentNode.left == null){
                        currentNode.left = node;
                        return;
                    }
                    currentNode = currentNode.left;
                }else{
                    //right node
                    if(currentNode.right == null){
                        currentNode.right = node;
                        return;
                    }
                    currentNode = currentNode.right;
                }
            }
        }
    }

    public void lookup(int value,BinaryTreeNode _root){
        BinaryTreeNode tempNode = _root;
        if(tempNode != null && tempNode.value == value){
            System.out.println("Finally Found " + value);
            return;
        }
        if(tempNode != null && value < tempNode.value){
            lookup(value, tempNode.left);
        }
        if(tempNode != null && value > tempNode.value){
            lookup(value, tempNode.right);
        }
    }

    public void BFS(){
        var currentNode = this.root;
        List<Integer> list = new ArrayList<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(currentNode);
        while(queue.size() > 0){
            currentNode = queue.poll();
            System.out.println(currentNode.value);
            list.add(currentNode.value);

            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
    }

    public List<Integer> BFSR(Queue<BinaryTreeNode> queue,List<Integer> list){
        if(queue.isEmpty()){
            return list;
        }
        var currentNode = queue.poll();
        System.out.println(currentNode.value);
        list.add(currentNode.value);
        if(currentNode.left != null){
            queue.add(currentNode.left);
        }
        if(currentNode.right != null){
            queue.add(currentNode.right);
        }
        return this.BFSR(queue,list);
    }

    //      9
    //  4       20
    //1   6  15    170

    //InOrder [1,4,6,9,15,20,170]

    //PreOrder [9,4,1,6,20,15,170]

    //PostOrder [1,6,4,15,170,20,91]

    public List<Integer> DFSInOrder(){
        List<Integer> list = new ArrayList<>();
        return TraverseInOrder(this.root,list);
    }

    public List<Integer> TraverseInOrder(BinaryTreeNode node,List<Integer> list){
        if(node.left != null){
            TraverseInOrder(node.left,list);
        }
        list.add(node.value);
        if(node.right != null){
            TraverseInOrder(node.right,list);
        }
        return list;
    }



    public List<Integer> DFSPostOrder(){
        List<Integer> list = new ArrayList<>();
        return TraversePostOrder(this.root,list);
    }

    private List<Integer> TraversePostOrder(BinaryTreeNode node, List<Integer> list) {
        if(node.left != null){
            TraversePostOrder(node.left,list);
        }
        if(node.right != null){
            TraversePostOrder(node.right,list);
        }
        list.add(node.value);
		return list;
	}

	public List<Integer> DFSPreOrder(){
        List<Integer> list = new ArrayList<>();
        return TraversePreOrder(this.root,list);
    }

    public List<Integer> TraversePreOrder(BinaryTreeNode node,List<Integer> list){
        list.add(node.value);
        if(node.left != null){
            TraversePreOrder(node.left,list);
        }
        if(node.right != null){
            TraversePreOrder(node.right,list);
        }
        return list;
    }

    public Boolean lookup2(int value){
        if(this.root == null){
            return false;
        }
        Boolean flag = false;
        BinaryTreeNode tempNode = this.root;
        while(!flag){
            if(tempNode == null){
                System.out.println("No Val Was Found");
                flag = !flag;
            }
            else if(tempNode != null && value < tempNode.value){
                tempNode = tempNode.left;
            }
            else if(tempNode != null && value > tempNode.value){
                tempNode = tempNode.right;
            }else if(tempNode != null && value == tempNode.value){
                flag = !flag;
                System.out.println("Found"+ value);
            }
        }
        return false;
    }

    public void printTree(BinaryTreeNode _root){
        if(_root == null){
            return;
        }
        System.out.println("Value of Element: " + _root.value);
        if(_root.left != null){
            printTree(_root.left);
        }
        if(_root.right != null){
            printTree(_root.right);
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // Queue<BinaryTreeNode> queue = new LinkedList<>();
        // List<Integer> list = new ArrayList<>();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);
        // queue.add(tree.root);
        // tree.BFSR(queue,list);
        var l1 = tree.DFSPostOrder();
        for(int i:l1){
            System.out.println(i);
        }
    }
}
