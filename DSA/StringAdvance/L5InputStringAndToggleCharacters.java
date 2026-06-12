package StringAdvance;

import java.util.Scanner;

public class L5InputStringAndToggleCharacters {
    public static void main(String[] args) {
        //Input a string Builder and toggle all the character in string
        //Toggle means character which in small letter convert it into capital letter and vise versa
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the String : ");
        StringBuilder sb = new StringBuilder(ns.nextLine());
        int n = sb.length();
        for (int i = 0; i < n; i++) {
            char ch = sb.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 65 && ascii <= 90) {
                ascii += 32;
                ch = (char) ascii;
                sb.setCharAt(i, ch);
            }
            else if (ascii >= 97 && ascii <= 122) {
                ascii -= 32;
                ch = (char) ascii;
                sb.setCharAt(i, ch);
            }
        }
        System.out.println(sb);
    }
}
