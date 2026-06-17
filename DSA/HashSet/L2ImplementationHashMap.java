package DSA.HashSet;

import java.util.HashMap;

public class L2ImplementationHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Peeyush",85);
        map.put("Aayush",90);
        map.put("Aryan",90);
        map.put("Ravi",90);
        System.out.println(map);
        System.out.println("1. Mark of Peeyush is " +map.get("Peeyush"));
        System.out.println("2. "+map.containsKey("Peeyush"));
        System.out.println("3. "+map.get("Peeyush"));
        System.out.println("4. "+map.put("Peeyush",200));
        System.out.println(map);
//        System.out.println("Ajay",20); // gives error because key is immutable and value is mutable
    }
}
