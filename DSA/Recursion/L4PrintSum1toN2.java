package Recursion;
import java.util.Scanner;
// WAP to sum from 1 to N using returm type recursion
public class L4PrintSum1toN2 {
        public static int sum(int n){
        if (n==1 || n == 0) return n; // Base case
        return n + sum(n-1); // Recurrence relation or calling
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("The sum from 1 to " + n + " is : " + sum(n));
    }
}
