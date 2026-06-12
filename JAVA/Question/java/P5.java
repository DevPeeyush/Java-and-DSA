package Question.java;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        String result = (n % 2 == 1) ? "odd" : "even";
        System.out.println(result);
    }
}

