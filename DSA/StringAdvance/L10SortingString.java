package StringAdvance;

import java.util.Arrays;
import java.util.Scanner;

public class L10SortingString {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("String is : ");
        String s = ns.nextLine();
        char[] ch = s.toCharArray();//convert string into array
        // Because sorting in string is not possible due to immutable condition of string
//        for(char ele : ch){
//            System.out.print(ele);
//        }
        System.out.println();
        System.out.println("Sorted string is : ");
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
    }
}
