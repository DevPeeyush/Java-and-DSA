package Question.java;

import java.util.Scanner;

public class PrintEvenNumber {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = ns.nextInt();
        for (int i=1 ; i<=n ; i++) {
            if (i%2 == 0) System.out.println(i);
        }
    }
}
