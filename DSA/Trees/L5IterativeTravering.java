package DSA.Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class L5IterativeTravering {
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

        // Preorder Traversing Iteratively (without recursion)
        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if (a != null) stack.push(a);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            ans.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        System.out.println("PreOrder : " + ans);

        // PosOrder Traversing Iteratively (without recursion)
        Stack<Node> stack2 = new Stack<>();
        ArrayList<Integer> ans2 = new ArrayList<>();
        if (a != null) stack2.push(a);
        while (!stack2.isEmpty()) {
            Node node = stack2.pop();
            ans2.add(node.val);
            if (node.left != null) stack2.push(node.left);
            if (node.right != null) stack2.push(node.right);
        }
        Collections.reverse(ans2);
        System.out.println("PostOrder : " + ans2);

        // InOrder Traversing Iteratively (without recursion)
        Stack<Node> stack3 = new Stack<>();
        ArrayList<Integer> ans3 = new ArrayList<>();
        Node temp = a;
        while(true){
            if(temp!=null){
                stack3.push(temp);
                temp=temp.left;
            }else{
                if(stack3.isEmpty()) break;
                Node top = stack3.pop();
                ans3.add(top.val);
                temp=top.right;
            }
        }
        System.out.println("inOrder : " + ans3);
    }
}
