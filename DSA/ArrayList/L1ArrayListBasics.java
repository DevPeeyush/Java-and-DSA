package ArrayList;

import java.util.ArrayList;

public class L1ArrayListBasics {
    public static void  display(ArrayList<Integer> ann) {
            for(int ele : ann) {
                System.out.println(ann.get(ele)+" ");
            }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(1);
        number.add(90);
        number.add(3);
        number.add(4);
        System.out.print("Array is : ");
        display(number);
        System.out.println("Size of list: " + number.size());
        System.out.println("Get the element at index 2 : "+number.get(2));
        System.out.println("After applying the operations : ");
        display(number);
        number.set(0,9);
        display(number);
        number.remove(2);
        display(number);
        number.clear();
        display(number);
    }
}
