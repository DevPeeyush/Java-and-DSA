package Conditional_Statement;

import java.util.Scanner;

public class Q2_Absolute_value {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = ns.nextInt();
        if(n<0) {
            System.out.println(-n);
        } else {
            System.out.println(n);
        }
    }
}
