package DSA.HashSet;

import java.util.*;

public class L5TreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("Peeyush",20);
        tm.put("Aayush",30);
        tm.put("Aryan",30);
        tm.put("komal",40);
        tm.put("Komal",45);
        System.out.println(tm);
        System.out.println("Size is : " + tm.size());
        System.out.println(tm.remove("Peeyush"));
        System.out.println(tm);
        System.out.println("Size is : " + tm.size());

    }
}
