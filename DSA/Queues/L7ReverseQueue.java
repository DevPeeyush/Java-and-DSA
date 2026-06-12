package DSA.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class L7ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        Stack<Integer> st = new Stack<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("Queue is : " +q);
        while(q.size() !=0){
            st.push(q.remove());
        }
        System.out.println("Stack is : "+st);
        while(st.size() !=0){
            q.add(st.pop());
        }
        System.out.println("Reverse queue is : " +q);
    }
}