package DSA.DyanmicProgramming;
import java.util.Scanner;

// M-1 : Fibonacci using simple Recursion

public class L1Fibonacci {

    public static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number: " + n + " is : " + fibo(n));
    }
}
