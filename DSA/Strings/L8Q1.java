package Strings;

import java.util.Scanner;

public class L8Q1 {
    // Take a input from users & print all substrings of the strings
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String x = ns.nextLine();
        for (int i = 0; i <x.length() ; i++) {
            for (int j =i+1 ; j <x.length()+1 ; j++) {
                System.out.print(x.substring(i,j)+",");
            }
            System.out.println();
        }
    }
}
