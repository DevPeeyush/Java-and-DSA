package Question.java;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        double x = ns.nextDouble();
        System.out.print("Enter the value of y : ");
        double y = ns.nextDouble();
        double sum = x+y;
        System.out.println("Sum of x and y is : "+sum);
    }
}

