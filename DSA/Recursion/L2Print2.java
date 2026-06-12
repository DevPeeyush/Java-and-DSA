// WAP to print numbers from 1 to n using recursion  and a global variable.
package Recursion;

import java.util.Scanner;

public class L2Print2 {
    static int n; //Global variable
    public static void num(int x) {
        if (x>n) return ;
        System.out.println(x);
        num(x+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();
        num(1);
    }
}
