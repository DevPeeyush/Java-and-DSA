package Strings;

import java.util.Scanner;

public class L11Q3 {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        long n = ns.nextInt();
        //String s = s+n;
        //String s = Integer.toString(n);
        String s = Long.toString(n);
        System.out.println("Integer convert into string : "+s.length());

    }
}
