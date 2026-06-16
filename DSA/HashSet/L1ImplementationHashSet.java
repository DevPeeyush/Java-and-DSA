package DSA.HashSet;

import java.util.HashMap;
import java.util.HashSet;

public class L1ImplementationHashSet {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        // Insert T.C is O(1)
        h.add(25);
        h.add(100);
        h.add(-8);
        h.add(10);
        h.add(10);
        System.out.println(h.size());
        System.out.println(h);
        // Size T.C is O(1)
        System.out.println(h.size());
        System.out.println(h.isEmpty());
        System.out.println(h);
        System.out.println(h.size());
        // Searching T.C is O(1)
        System.out.println(h.contains(25));
        h.remove(25);
        System.out.println(h);
        // to convert in array
        System.out.println("HashSet into array : ");
        Object[] arr = h.toArray();
        for(Object ele : arr) System.out.print(ele+" ");
    }
}
