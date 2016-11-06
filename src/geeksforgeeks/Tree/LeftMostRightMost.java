package src.geeksforgeeks.Tree;

/**
 * Created by jaydatta on 9/23/16.
 */
public class LeftMostRightMost {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(15);
        tree.root.left = new Node(10);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(12);
        tree.root.right.left = new Node(16);
        tree.root.right.right = new Node(25);




    }


    public static void printCorner(Node root){

    }

}
