package DSA.Heap;

import java.util.PriorityQueue;

public class L1SasicsHeapCF {
    // CF means collection Frame work
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
        System.out.println(pq);
        pq.add(0);
        System.out.println(pq);
    }
}
