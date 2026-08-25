package DSA.Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;
/**-----------Sort a 'k' sorted array------------**/
public class L5KSortedArray {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = {6,5,3,2,8,10,9};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int k = 3;
        for(int ele :arr){
            pq.add(ele);
            if(pq.size()>k){
                list.add(pq.remove());
            }
        }
        while(!pq.isEmpty()){
            list.add(pq.remove());
        }
        System.out.print("[ ");
        for(int ele : list){
            System.out.print(ele+" ");
        }
        System.out.print("]");
    }
}
