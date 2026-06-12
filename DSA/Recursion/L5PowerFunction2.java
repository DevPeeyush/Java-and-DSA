package Recursion;
import java.util.Scanner;
// WAP to calculate power of a number using recursion but for better time complexity
// i.e. O(log n) instead of O(n)
// Example: 2^10 = 1024
// Approach:
// If n is even then power(a, n) = power(a, n/2) * power(a, n/2)
// If n is odd then power(a, n) = a * power(a, n/2) * power(a, n/2)
public class L5PowerFunction2 {
    public static int power(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Undefined");
            return -1;
        }
        if (b == 0) return 1;

        int ans = power(a, b / 2);

        if (b % 2 == 0) return ans * ans;
        else return a * ans * ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of base  : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of power : ");
        int b = sc.nextInt();
        System.out.println(a + " to the power " + b + " is : " + power(a, b));
    }
}
