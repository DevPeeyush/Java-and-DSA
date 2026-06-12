package Opertor;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number : ");
        double b = sc.nextDouble();
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<=b);
    }
}
