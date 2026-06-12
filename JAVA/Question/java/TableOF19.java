package Question.java;

import java.util.Scanner;

public class TableOF19 {
    // Print table
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = ns.nextInt();
        for (int i=1 ; i<=10 ; i++) {
            System.out.println(i*n);
        }
    }
}
