package Strings;

import java.util.Scanner;

public class L10Q2 {
    // Take a input from user and Convert integer into String
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int n = ns.nextInt();
        String s = "" ;
        s = s+n;
        System.out.println("Integer convert into string : "+s);

    }
}
