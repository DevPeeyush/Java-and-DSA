// WAP to print number from n to 1 using recursion
package Recursion;

import java.util.Scanner;

public class L2Print {
    public static int num(int n) {
        if (n == 1) {
            return 1;
        }
        System.out.println(n);
        return num(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(num(n));
    }
}

