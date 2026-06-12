package Question.java;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        System.out.print("Enter the length : ");
        double l = ns.nextDouble();
        System.out.print("Enter the breadth : ");
        double b =ns.nextDouble();

        double area = l*b;
        double perimeter = 2*(l+b);

        if (area > perimeter)
        {
            System.out.println("Area is greater than perimeter ");
        }if (perimeter > area)
        {
            System.out.println("Perimeter is greater than area ");
        }
    }
}

