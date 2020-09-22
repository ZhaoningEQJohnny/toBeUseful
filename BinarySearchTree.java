class Node {
    public int value;
    public Node leftChild;
    public Node rightChild;
    public Node parent;
    public  Node(int value){
        this.value = value;
    }
    public Node (){

    }
}

public class BinarySearchTree {
    public Node root;

    public void insert(Node node) {
        if (root == null) {
            root = node;
        } else {
            Node curNode = root;
            Node tmpNode = curNode;
            boolean goLeft = false;
            while (tmpNode != null) {
                curNode = tmpNode;
                if (node.value < curNode.value) {
                    tmpNode = curNode.leftChild;
                    goLeft = true;
                } else {
                    tmpNode = curNode.rightChild;
                    goLeft = false;
                }
            }
            if (goLeft) {
                curNode.leftChild = node;
            } else {
                curNode.rightChild = node;
            }
        }

    }

    public int getHeight(Node node) {

        return 0;
    }

    public Node getNode(int value) {

        return null;
    }

    public void inorderPrintHelper(Node node) {
        if (node.leftChild != null) {
            inorderPrintHelper(node.leftChild);
        }
        System.out.print(node.value + ", ");
        if (node.rightChild != null) {
            inorderPrintHelper(node.rightChild);
        }
    }

    public void inorderPrint() {
        inorderPrintHelper(root);
        System.out.println();
    }

    public void preorderPrintHelper(Node node) {
        System.out.print(node.value + ", ");
        if (node.leftChild != null) {
            preorderPrintHelper(node.leftChild);
        }
        if (node.rightChild != null) {
            preorderPrintHelper(node.rightChild);
        }
    }

    public void preorderPrint() {
        preorderPrintHelper(root);
        System.out.println();
    }

    public void postorderPrintHelper(Node node) {
        if (node.leftChild != null) {
            postorderPrintHelper(node.leftChild);
        }
        if (node.rightChild != null) {
            postorderPrintHelper(node.rightChild);
        }
        System.out.print(node.value + ", ");
    }

    public void postorderPrint() {
        postorderPrintHelper(root);
        System.out.println();
    }

    public Node postArrayToBSTreeHelper(int[] postArray, int start, int end) {
        Node node = new Node(postArray[end]);
        int index;
        for (index = end; index >= start; index--) {
            if (postArray[index] < node.value) {
                break;
            }
        }
        if (start <= index)
            node.leftChild = postArrayToBSTreeHelper(postArray, start, index);

        if (index + 1 <= end - 1)
            node.rightChild = postArrayToBSTreeHelper(postArray, index + 1, end - 1);
        return node;
    }

    public void postorderArrayToBSTree(int[] postArray) {
        root = postArrayToBSTreeHelper(postArray, 0, postArray.length - 1);
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
//        bst.insert(new Node(6));
//        bst.insert(new Node(4));
//        bst.insert(new Node(5));
//        bst.insert(new Node(2));
//        bst.insert(new Node(3));
//        bst.insert(new Node(1));
//        bst.insert(new Node(8));
//        bst.insert(new Node(7));
//        bst.insert(new Node(11));
//        bst.insert(new Node(9));
//        bst.insert(new Node(10));

//        int[] postArray = {1, 3, 2, 5, 4, 7, 10, 9, 11, 8, 6};
        int[] postArray = {1, 3, 4,6};
        bst.postorderArrayToBSTree(postArray);
        bst.inorderPrint();
        bst.preorderPrint();
        bst.postorderPrint();
    }

}
