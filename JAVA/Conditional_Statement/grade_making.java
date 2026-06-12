package Conditional_Statement;

import java.util.Scanner;

public class grade_making {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);

        System.out.print("Enter the marks of student : ");
        double a = ns.nextDouble();

        if (a>=81)
            System.out.println(" VERY GOOD");
        else if (a>=61)
            System.out.println("GOOD");
        else if (a>=41)
            System.out.println("AVERAGE");
        else System.out.println("FAIL");

    }
}

