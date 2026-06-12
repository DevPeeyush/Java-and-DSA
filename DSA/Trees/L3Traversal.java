package DSA.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class L3Traversal {
    private static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left); // Left subtree
        preOrder(root.right);  //  right subtree
    }
    private static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left); // Left subtree
        System.out.print(root.val+" ");
        inOrder(root.right);  //  right subtree
    }
    private static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left); // Left subtree
        postOrder(root.right);  //  right subtree
        System.out.print(root.val+" ");
    }
    private static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root == null) return;
        if(root!=null){
            q.add(root);
            while(q.size()>0){
                Node front = q.remove();
                System.out.print(front.val+" ");
                if(front.left != null)q.add(front.left);
                if(front.right != null)q.add(front.right);
            }
        }
    }
    public static void main(String[] args) {
        int sum = 0;
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.left = h;
        f.right = i;
        System.out.print("Preorder : ");
        preOrder(a);
        System.out.println();
        System.out.print("Inorder : ");
        inOrder(a);
        System.out.println();
        System.out.print("Postorder : ");
        postOrder(a);
        System.out.println();
        System.out.print("Level order (BFS) : ");
        levelOrder(a);
    }
}
