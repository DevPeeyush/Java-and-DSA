package DSA.DyanmicProgramming;
import java.util.Scanner;

// M-2 : Fibonacci using the Memoization
// Time Complexity : O(n)
//
public class L2Fibonacci {
    static int[] dp;
    public static int fibo(int n){
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        int ans = fibo(n-1)+fibo(n-2);
        dp[n] = ans;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        dp = new int[n+1];
        System.out.println("Fibonacci number: " + n + " is : " + fibo(n));
    }
}
