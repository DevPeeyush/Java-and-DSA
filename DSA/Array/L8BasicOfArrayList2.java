package Array;

import java.util.ArrayList;

public class L8BasicOfArrayList2
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
// Adding element and size of array
        System.out.println("Null Array is : "+list + " " + "Size is : " + list.size());
        list.add(30);
        System.out.println(list + " " + list.size());
        list.add(40);
        System.out.println(list + " " + list.size());
        list.add(50);
        System.out.println(list + " " + list.size());
        list.add(-60);
        System.out.println(list + " " + list.size());
        list.add(-70);
        System.out.println(list + " " + list.size());

// Removing of array
        list.remove(0);
        System.out.println(list + " "+list.size());
    }
}
