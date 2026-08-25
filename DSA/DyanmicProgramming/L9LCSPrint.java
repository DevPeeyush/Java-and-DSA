package DSA.DyanmicProgramming;

import java.util.Scanner;

public class L9LCSPrint {
    // Cleaned up parameters: only needs the two input strings
    public static String longestCommonSubsequence(StringBuilder a, StringBuilder b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m + 1][n + 1];

        // Step 1: Fill the DP matrix
        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= n; col++) {
                if (a.charAt(row - 1) == b.charAt(col - 1))
                    dp[row][col] = 1 + dp[row - 1][col - 1];
                else
                    dp[row][col] = Math.max(dp[row][col - 1], dp[row - 1][col]);
            }
        }

        // Step 2: Backtrack to find and build the LCS string
        StringBuilder str = new StringBuilder(" ");
        int currI = m, currJ = n;
        while (currI > 0 && currJ > 0) {
            if (a.charAt(currI - 1) == b.charAt(currJ - 1)) {
                str.append(a.charAt(currI - 1));
                currI--; // Move diagonally up-left when characters match
                currJ--;
            } else if (dp[currI - 1][currJ] > dp[currI][currJ - 1]) {
                currI--; // Move up
            } else {
                currJ--; // Move left
            }
        }

        // Reverse the string since we built it backwards
        str.reverse();
        return str.toString();
    }

    public static void main(String[] args) {
        String text1;
        String text2;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the string 1 : ");
            text1 = sc.next();
            System.out.print("Enter the string 2 : ");
            text2 = sc.next();
        }

        StringBuilder a = new StringBuilder(text1);
        StringBuilder b = new StringBuilder(text2);

        // Simply call the method and print the returned string
        System.out.print("Longest Common Subsequence is : " + longestCommonSubsequence(a, b));
    }
}
