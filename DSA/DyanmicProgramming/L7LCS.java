package DSA.DyanmicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class L7LCS {
    public static int lcs(int i, int j, StringBuilder a, StringBuilder b,int[][] dp) {
        // Base case
        if (i < 0 || j < 0) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        if (a.charAt(i) == b.charAt(j))
            return dp[i][j] = 1 + lcs(i - 1, j - 1, a, b,dp);
        else
            return dp[i][j] = Math.max(lcs(i - 1, j, a, b,dp), lcs(i, j - 1, a, b,dp));
    }

    public static void main(String[] args) {
        String text1;
        String text2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the strng 1 : ");
            text1 = sc.next();
            System.out.println();
            System.out.print("Enter the strng 2 : ");
            text2 = sc.next();
        }
        StringBuilder a = new StringBuilder(text1);
        StringBuilder b = new StringBuilder(text2);
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.print("Longest Common Subsequence is : "+lcs(m - 1, n - 1, a, b,dp));
    }
}

