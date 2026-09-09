package DSA.Heap;

import java.util.PriorityQueue;

/*--------Min Cost to connect all Ropes ---------*/
public class L8MinCostToRope {
    public static int minCostToRope(int[] rope) {
        // Using min heap;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : rope){
            pq.add(ele);
        }
        int cost = 0;
        while(pq.size()>1){
            int x = pq.remove();
            int y = pq.remove();
            cost += (x+y);
            pq.add(y+x);
        }
        return cost;
    }
    public static void main(String[] args) {
        int[] rope = {2,7,4,1,8};
        System.out.println("Min cost to connect rope is : " +  minCostToRope(rope));
    }
}
