package Opertor;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the number n1 : ");
        double n1 = ns.nextDouble();
        if(n1>9999 && n1<100000)
            System.out.println("Number is five Digit number ");
        else
            System.out.println("Number is not five Digit number ");

    }
}
