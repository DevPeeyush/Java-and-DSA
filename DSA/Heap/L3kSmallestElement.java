package DSA.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class L3kSmallestElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int[] num = {10,25,36,2,5,8,55,30};
        int k = 1;
        int n = num.length;
        for(int ele : num){
            pq.add(ele);
            if(pq.size() > k )
                pq.remove();
        }
        System.out.print(k+" Smallest element is : "+pq.peek());
    }
}
