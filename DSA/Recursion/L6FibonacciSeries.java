package Recursion;

import java.util.Scanner;

public class L6FibonacciSeries {
    public static int fibonacci(int n) {
        if (n <= 1) return n; // Base case
        int fibn = fibonacci(n - 1) + fibonacci(n - 2); // Recurrence relation
        return fibn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fibonacci number  : ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
