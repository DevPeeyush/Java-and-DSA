package DSA.Heap;

import java.util.Collections;
import java.util.PriorityQueue;
/**-----------Max Heap------------**/
public class L2MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(1);
        System.out.println(pq);
        pq.add(4);
        System.out.println(pq);
        pq.add(2);
        System.out.println(pq+" \n"+ "Element at top is : "+ pq.peek());
        pq.add(3);
        System.out.println(pq);
        pq.remove();
        //pq.poll() work same as qp.remove()
        System.out.println(pq);
        pq.add(0);
        System.out.println(pq);
    }
}

