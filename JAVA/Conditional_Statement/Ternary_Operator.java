package Conditional_Statement;

import java.util.Scanner;

public class Ternary_Operator {
    // Syntax is expression 1 ? Syntax is expression 2 : Syntax is expression 3
    // Find number is even or odd using Ternary Operator
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the  number : ");
        int a = ns.nextInt();
        // condition ? if true : If false
        System.out.println((a%2==0) ? "Even" : "Odd");
    }
}
