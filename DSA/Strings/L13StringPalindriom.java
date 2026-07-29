package DSA.Strings;

import java.util.Scanner;

public class L13StringPalindriom {
    public static boolean palindrom(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if(str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        if (palindrom(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }

}
