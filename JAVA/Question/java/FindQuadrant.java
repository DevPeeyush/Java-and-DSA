package Question.java;

import java.util.Scanner;

public class FindQuadrant {
    public static void main(String[] args)
    {
        Scanner ns = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int x = ns.nextInt();

        System.out.print("Enter the number : ");
        int y = ns.nextInt();

        System.out.println("("+x+","+y+")");

        if (x==0 && y==0) {
            System.out.println("At origin");
        }
        else if (x>=1 && y==0){
            System.out.println("At x-axis ");
        }
        else if (x==0 && y>=1){
            System.out.println("At y-axis");
        }
        else if (x<=1 && y==0) {
            System.out.println("At x-axis");
        }
        else if (x==0 && y<=1) {
            System.out.println("At y-axis ");
        }
        else if (x>=1 && y>=1) {
            System.out.println("In 1st Quadrant");
        } else if (x<=1 && y>=1){
            System.out.println("In 2nd Quadrant");
        }
        else if (x<=1) {
            System.out.println("In 3rd Quadrant");
        }
        else if (x>=1) {
            System.out.println("In 4th Quadrant");
        }
    }
}
