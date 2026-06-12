package Recursion;

import java.util.Scanner;
// WAP to find the number of ways to climb n stairs, where you can climb either 1 stair or 3 stairs at a time.
public class L7StairProblem2 {
    public static int stair(int n) {
        // Base cases
        if (n == 0) return 1;   // one valid way
        if (n < 0) return 0;    // no valid way
        return stair(n - 1) + stair(n - 3); // Recurrence relation

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stair : ");
        int n = sc.nextInt();
        System.out.println(stair(n));
    }
}
