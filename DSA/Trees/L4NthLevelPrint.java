package DSA.Trees;

import java.util.Scanner;

public class L4NthLevelPrint {
    static int n;
    public static void nThLevelPrint(Node root, int level){
        if(root == null) return;
        if(level == n )System.out.print(root.val+" ");
//        else System.out.println("Level is out of the tree !!");
        nThLevelPrint(root.left,level+1); // Left subtree
        nThLevelPrint(root.right, level+1);  //  right subtree
    }
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the level to print : ");
        n = sc.nextInt();
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
        nThLevelPrint(a,1);

    }
}
