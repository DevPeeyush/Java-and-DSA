package Opertor;

import java.util.Scanner;

public class Or_LogicalOperator {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("For Checking multiple of 5 & 7");
        System.out.print("Enter the number : ");
        double a = ns.nextDouble();
        if (a%5==0 || a%3==0)
            System.out.println("Number is multiple of 5 anf 3 ");
        else
            System.out.println("Number is not multiple of 5 and 7 ");
    }
}
