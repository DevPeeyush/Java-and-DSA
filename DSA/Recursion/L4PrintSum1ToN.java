package Recursion;
import java.util.Scanner;
// WAP to print sum of 1 to n using parameterized recursion
public class L4PrintSum1ToN {

    public static void sum(int n, int s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
        sum(n - 1, s + n); // Calling and updating sum
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        sum(n, 0);
    }
}
