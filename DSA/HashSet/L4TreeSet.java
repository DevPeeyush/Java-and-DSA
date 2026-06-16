package DSA.HashSet;

import java.util.TreeSet;

public class L4TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(25);
        ts.add(90);
        ts.add(85);
        ts.add(90);
        System.out.println(ts);
        System.out.println("Size is : " + ts.size());
        ts.remove(25);
        System.out.println(ts);
        System.out.println("Size is : " + ts.size());
        ts.remove(90);
        System.out.println(ts);
        System.out.println("Size is : " + ts.size());
    }
}
