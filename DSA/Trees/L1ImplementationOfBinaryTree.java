package DSA.Trees;
class Node{
    int val;
    Node left;
    Node right;
    Node (int val){
        this.val = val;
    }
}
public class L1ImplementationOfBinaryTree {
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val);
        display(root.left); // Left subtree
        display(root.right);  //  right subtree
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        b.left = d; b.right = e;
        a.left = c; a.right = b;
        c.right = f;
        System.out.println(e.val);
        System.out.println(a.left.right.val);
        System.out.println("Value of nodes in tree : ");
        display(a);
    }
}
