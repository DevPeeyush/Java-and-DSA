package DSA.Queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class L2DisplayQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // we can simple display queue using sout(q) but take more memory and space
        Queue<Integer> helper = new ArrayDeque<>();
        // rear --> 5,4,3,2,1  <-- Front
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            helper.add(q.remove());
        }
        while(helper.size()>0){
             q.add(helper.remove());
        }
    }
}
