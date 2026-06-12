package Recursion;

import java.util.Scanner;

public class L2FactorialRecurrence {
    public static int factorial(int n){
        if (n==1 || n==0) return 1; // Base case
        int ans =  n * factorial(n-1); // Recurrence relation or calling
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

}
