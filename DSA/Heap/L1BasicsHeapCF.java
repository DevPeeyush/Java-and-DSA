package DSA.Heap;

import java.util.PriorityQueue;

public class L1BasicsHeapCF {
    // CF means collection Frame work
    /**-----------Min Heap------------**/
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        System.out.println(pq);
        pq.add(4);
        System.out.println(pq);
        pq.add(2);
        System.out.println(pq);
        pq.add(3);
        System.out.println(pq);
        pq.remove();
        //pq.poll() work same as qp.remove()
        System.out.println(pq);
        pq.add(0);
        System.out.println(pq);
    }
}
