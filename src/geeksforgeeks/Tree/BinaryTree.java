package geeksforgeeks.Tree;

/**
 * Created by jaydatta on 9/8/16.
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*

http://www.geeksforgeeks.org/level-order-traversal-in-spiral-form/
 * Using the above data structure that represents a binary tree, write a method to return a list of nodes with a modified Breadth-First-Search (BFS) ordering. This special Breadth-First-Search orders the nodes from left-to-right and right-to-left alternatively at each level.
 *
 * E.g.:
 *              (5)       ---->  left-to-right
 *             /   \
 *           (4)   (1)    <----  right-to-left
 *          / \     /
 *       (6) (3)  (7)     ---->  left-to-right
 *       /          \
 *     (2)          (9)   <----  right-to-left
 *
 * Result:
 *     Alternating BFS ordering = [ 5, 1, 4, 6, 3, 7, 9, 2 ]
       5, 4, 1, 6, 3, 7, 2, 9
 */


class Node {
    // TODO - Data structure goes here

    Node left;
    Node right;
    int data;

    public Node(int item) {
        data = item;
        right = left = null;
    }

}

class BinaryTree {

    static Node root;


    int count(Node node){

        return count(node.left) + count(node.right)+1;
    }






    void printCorner(Node root){
        //  star node is for keeping track of levels
        Queue<Node> q = new LinkedList<Node>();

        // pushing root node and star node
        q.add(root);
        q.add(null);

        // if isFirst = true then left most node of that level
        // will be printed
        boolean isFirst = false;

        // if isOne = true then that level has only one node
        boolean isOne = false;

        // last will store right most node of that level
        int last = 0;

        // Do level order traversal of Binary Tree
        while (!q.isEmpty())
        {
            // dequeue the front node from the queue
            Node temp = q.peek();
            q.poll();

            // if isFirst is true, then temp is leftmost node
            if (isFirst)
            {
                System.out.print(temp.data + " \n  ");

                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);

                // make isFirst as false and one = 1
                isFirst = false;
                isOne = true;
            }

            // Else if temp is a separator between two levels
            else if (temp == null)
            {
                // Insert new separator if there are items in queue
                if (q.size() >= 1)
                    q.add(null);
         //           System.out.println("current size:"+q.size());


                // making isFirst as true because next node will be
                // leftmost node of that level
                isFirst = true;

                // printing last node, only if that level
                // doesn't contain single node otherwise
                // that single node will be printed twice

                if (!isOne) {
                    System.out.print(last + "  \n");
                }
            }
            else
            {
                // Store current key as last
                last = temp.data;

                // Here we are making isOne = false to signify
                // that level has more than one node
                isOne = false;
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);

            }
            for(Node element: q){
                if(element!=null) {
                    System.out.print(element.data + "<-");
                }
            else
                    System.out.print(element+"<-");
            }
            System.out.println("\n");

        }
    }



    int checkRecursively(Node root,int size,Result resultObject){
if(root==null)
    return 0;



return 1;
    }



    boolean check(Node root){

        // size of current tree
        int size = count(root);

        Result resultObject = new Result();
        checkRecursively(root,size,resultObject);
        return  resultObject.result;
    }


    class Result{
        boolean result =false;
    }


    public static void main(String[] args) {

/*
        BinaryTree btree = new BinaryTree();
        btree.root = new Node(1);
        btree.root.left = new Node(2);
        btree.root.right = new Node(3);

        btree.root.left.left = new Node(4);
        btree.root.left.right = new Node(5);
*/



        BinaryTree tree = new BinaryTree();
        tree.root = new Node(15);
        tree.root.left = new Node(10);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(12);
        tree.root.right.left = new Node(16);
        tree.root.right.right = new Node(25);
        tree.printCorner(tree.root);

/*

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(5);
        tree.root.left = new Node(1);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(3);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(4);
        if (tree.check(tree.root) == true)
            System.out.println("YES");
        else
            System.out.println("NO");
*/



        /*btree.root.left.left = new Node(7);
        btree.root.left.right = new Node(6);
        btree.root.right.left = new Node(5);
        btree.root.right.right = new Node(4);*/
/*
        btree.printSpiral(root);

        System.out.println("Printing DFS traversals");

        System.out.println("Inorder ");
        btree.printInOrder(root);

        System.out.println(" \n Preorder ");
        btree.printPreOrder(root);

        System.out.println("\n Postorder ");
        btree.printPostOrder(root);


        System.out.println(" BFS Traversal using Queue");
        btree.traverseTreeBFS(root);
*/


    }

    public List<Node> traverseTreeBFS(final Node rootNode) {

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        if (rootNode == null) {
            return null;
        }
        while (!queue.isEmpty()) {

            // Poll removes the head from the node
            Node tempNode = queue.poll();

            System.out.print(tempNode.data + "\t ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
                // Added new Head
            }

            if (tempNode.right != null) {
                queue.add(tempNode.right);
                // Right is the new Head now
            }

        }

        return null;
    }


    public List<Node> printSpiral(final Node rootNode) {
        // TODO - Algorithm goes here

        if (rootNode == null)
            return null;


        Stack<Node> rightToLeft = new Stack<Node>();
        Stack<Node> leftToRight = new Stack<Node>();


        rightToLeft.push(rootNode);

        while (!rightToLeft.empty() || !leftToRight.empty()) {


            while (!rightToLeft.empty()) {
                Node temp = rightToLeft.peek();
                rightToLeft.pop();
                System.out.println(temp.data);


                if (temp.right != null) {
                    leftToRight.push(temp.right);
                }
                if (temp.left != null) {
                    leftToRight.push(temp.left);
                }

            }

            while (!leftToRight.empty()) {
                Node temp = leftToRight.peek();
                leftToRight.pop();
                System.out.println(temp.data);

                if (temp.left != null) {
                    rightToLeft.push(temp.left);
                }

                if (temp.right != null) {
                    rightToLeft.push(temp.right);
                }


            }
        }
        return null;
    }

    public void printPostOrder(Node node) {


        if (node == null) {
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data);
    }

    public void printPreOrder(Node node) {


        if (node == null) {
            return;

        }
        System.out.print(node.data);

        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public void printInOrder(Node node) {


        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data);
        printInOrder(node.right);
    }

}



