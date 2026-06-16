package DSA.HashSet;

import java.util.HashMap;

public class L3IterateHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Peeyush",85);
        map.put("Aayush",90);
        map.put("Aryan",90);
        map.put("Ravi",90);
        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("Values are : ");
        for(int val : map.values()) {
            System.out.println(val);
        }
    }
}
