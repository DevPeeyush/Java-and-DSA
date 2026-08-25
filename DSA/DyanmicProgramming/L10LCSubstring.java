package DSA.DyanmicProgramming;

import java.util.Scanner;

/*--- Longest Common Substring---*/
public class L10LCSubstring {
    public static int longestCommonSubstring(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m+1][n+1];
        int max  = 0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1) == b.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = 0;
                max = Math.max(max,dp[i][j]);
            }
        }
        return max;
        // dp[i][j] will store LCS of substr(a,0,i-1) & substr(b,0,j-1)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string 1 : ");
        String s1 = sc.next();
        System.out.print("Enter the string 2 : ");
        String s2 = sc.next();
        System.out.print("Longest Common Substring is : "+longestCommonSubstring(s1,s2));
    }
}
