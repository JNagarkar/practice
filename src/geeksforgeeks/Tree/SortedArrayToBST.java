package src.geeksforgeeks.Tree;
import src.geeksforgeeks.Tree.Node;
import src.geeksforgeeks.Tree.BinaryTree;

/**
 * Created by jaydatta on 9/8/16.
 */
public class SortedArrayToBST {



    public static void main(String[] args){

        SortedArrayToBST object = new SortedArrayToBST();
        int[] arr  = {1,2,3,4,5,6,7,8,9};
        Node returnedNode = object.convertArrayToBST(arr,0,arr.length-1);

        BinaryTree btree = new BinaryTree();
        btree.printPreOrder(returnedNode);

    }


    public Node convertArrayToBST(int[] arr,int start,int end){

        if(start > end)
            return null;

        int mid = (start+end)/2;

        Node node = new Node(arr[mid]);
        node.left = convertArrayToBST(arr,start,mid-1);
        node.right = convertArrayToBST(arr,mid+1,end);

        return node;
    }
}
