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
        System.out.println("Mark of Peeyush is " +map.get("Peeyush"));
    }
}
