package DSA.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class L8ReverseKElements {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        int k = 3;

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Original Queue : " + q);

        // Push first k elements into stack
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        // Add back to queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Move remaining elements to rear
        int remaining = q.size() - k;

        for (int i = 0; i < remaining; i++) {
            q.add(q.remove());
        }

        System.out.println("Queue after reversing first " + k + " elements : " + q);
    }
}