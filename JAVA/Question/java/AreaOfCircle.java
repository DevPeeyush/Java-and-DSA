package Question.java;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args)
    {
        Scanner ns =  new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double r = ns.nextDouble();
        System.out.print("Area of circle is : ");
        System.out.println(3.14*r*r);
        System.out.print("Perimeter of circle is : ");
        System.out.println(2*3.14*r);
    }
}

