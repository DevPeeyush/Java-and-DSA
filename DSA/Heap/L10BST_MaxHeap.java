package DSA.Heap;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

public class L10BST_MaxHeap {
    // Function for the inorder traversal of the tree
    // so as to store the node values in 'arr' in
    // sorted order
    public static void inorderTraversal(Node root, ArrayList<Integer> arr) {
        if (root == null)
            return;
        // first recur on left subtree
        inorderTraversal(root.left, arr);
        // then copy the data of the node
        arr.add(root.data);
        // now recur for right subtree
        inorderTraversal(root.right, arr);
    }

    public static void BSTToMaxHeap(Node root, ArrayList<Integer> arr, int[] i) {
        if (root == null)
            return;

        // recur on left subtree
        BSTToMaxHeap(root.left, arr, i);

        // recur on right subtree
        BSTToMaxHeap(root.right, arr, i);

        // copy data at index 'i' of 'arr' to
        // the node
        root.data = arr.get(++i[0]);
    }

    // Utility function to convert the given BST to
    // MAX HEAP
    public static void convertToMaxHeap(Node root) {
        // vector to store the data of all the
        // nodes of the BST
        ArrayList<Integer> arr = new ArrayList<>();
        int[] i = {-1};

        // inorder traversal to populate 'arr'
        inorderTraversal(root, arr);

        // BST to MAX HEAP conversion
        BSTToMaxHeap(root, arr, i);
    }

    // Function to Print Postorder Traversal of the tree
    public static void postorderTraversal(Node root) {
        if (root == null)
            return;
        // recur on left subtree
        postorderTraversal(root.left);
        // then recur on right subtree
        postorderTraversal(root.right);
        // print the root's data
        System.out.print(root.data + " ");
    }

    // Driver Code
    public static void main(String[] args) {
        // BST formation
        Node root = new Node(4);

        root.left = new Node(2);
        root.right = new Node(6);

        root.left.left = new Node(1);
        root.left.right = new Node(3);

        root.right.left = new Node(5);
        root.right.right = new Node(7);

        convertToMaxHeap(root);

        System.out.println("Postorder Traversal of Tree:");
        postorderTraversal(root);
    }
}

