package Recursion;

import java.util.Scanner;
// WAP to find the number of ways to climb n stairs, where you can climb either 1 stair or 2 stairs at a time.
public class L7StairProblem {
    public static int stair(int n) {
        if (n <= 1) return n; // Base case
        return stair(n - 1) + stair(n - 2); // Recurrence relation

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stair : ");
        int n = sc.nextInt();
        System.out.println(stair(n));
    }
}
