import netscape.javascript.JSObject;

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
        tree.insert(10);
        tree.insert(6);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        tree.insert(14);
    }
}
