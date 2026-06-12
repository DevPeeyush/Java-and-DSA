package Conditional_Statement;

import java.util.Scanner;

public class If_else_Calculator {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = ns.nextInt();

        System.out.print("Enter sign : ");
        char op = ns.next().charAt(0);

        System.out.print("Enter the number : ");
        int b = ns.nextInt();

        if (op == '+') System.out.println(a+b);
        if (op == '*') System.out.println(a*b);
        if (op == '-') System.out.println(a-b);
        if (op == '/') System.out.println(a/b);
    }
}
