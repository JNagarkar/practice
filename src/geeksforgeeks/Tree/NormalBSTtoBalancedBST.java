package src.geeksforgeeks.Tree;

import java.util.LinkedHashSet;

/**
 * Created by jaydatta on 9/8/16.
 */
public class NormalBSTtoBalancedBST {

    public static void main(String[] args) {

        BinaryTree btree = new BinaryTree();
        btree.root = new Node(10);
        btree.root.left = new Node(8);
        btree.root.left.left = new Node(7);
        btree.root.left.left.left = new Node(6);
        btree.root.left.left.left.left = new Node(5);


        LinkedHashSet hashSet = new LinkedHashSet();
        NormalBSTtoBalancedBST object = new NormalBSTtoBalancedBST();
        object.printInOrderTraversal(btree.root, hashSet);


        System.out.println(hashSet);

        int[] myArray = new int[hashSet.size()];
        int i = 0;
        for (Object o : hashSet) {
            myArray[i++] = (int) o;
        }

        Node returnedNode = object.convertSortedArrayToBST(myArray, 0, myArray.length - 1);
        btree.printPreOrder(returnedNode);

    }

    public Node convertSortedArrayToBST(int[] array, int start, int end) {

        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node node = new Node(array[mid]);
        node.left = convertSortedArrayToBST(array, start, mid - 1);
        node.right = convertSortedArrayToBST(array, mid + 1, end);
        return node;
    }

    public void printInOrderTraversal(Node node, LinkedHashSet hashSet) {


        if (node == null) {
            return;
        }
        printInOrderTraversal(node.left, hashSet);
        //       System.out.print(node.data);
        hashSet.add(node.data);
        printInOrderTraversal(node.right, hashSet);


    }
}
