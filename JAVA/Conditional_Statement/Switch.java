package Conditional_Statement;

import java.util.Scanner;

public class Switch {

    // Make a calculator using switch condition
    // Syntax is
    /*
    switch(integer expression){
    case constant 1 :
        do this;
    case constant 2 :
        do this;
    case constant 3 :
        do this;
    default :
        do this
         }
     */
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = ns.nextInt();

        System.out.print("Enter sign : ");
        char op = ns.next().charAt(0);

        System.out.print("Enter the number : ");
        int b = ns.nextInt();

        switch (op) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid sign ");
        }
    }
}
