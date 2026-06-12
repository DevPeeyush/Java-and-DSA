package StringAdvance;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Given to strings s and t , return true if t is anagram of s and false otherwise
        // Leet code 242
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter string 1st : ");
        String s = ns.nextLine();
        System.out.println("Enter string 2nd : ");
        String p = ns.nextLine();
        if(s.length()!=p.length()){
            System.out.println("Anagram is not possible ");
        }
        char[] a = s.toCharArray();
        char[] b = p.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i <a.length ; i++) {
            if(a[i] == b[i]);
        }
        System.out.println("String is anagram of each other ");
    }
}
