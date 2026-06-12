package DSA.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class L1QueueUsingSTl {
    public static void main(String[] args) {
//        In c++ we use STl(Standard Template library) and java it name as Collection Framework
        Queue<Integer> q = new LinkedList<Integer>();
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.add(5);
        System.out.println("Sixe of Queue is : " + q.size() );
         // q.add use add element in the queue (same as push in stack)
        System.out.println(q);
        q.remove();
        // q.remove use to remove the element (same as pop in stack)
        System.out.println(q);
        System.out.println(q.element());
        // q. element is use for view element but we can also use peek in queue but we didn't use pop and push in queue
        q.poll(); // same work as remove
        System.out.println(q.peek());
    }
}
