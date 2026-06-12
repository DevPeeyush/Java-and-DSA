package Question.java;

import java.util.Scanner;

public class LeastAmoungThree {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter n1 : ");
        int a = ns.nextInt();
        System.out.print("Enter n2 : ");
        int b = ns.nextInt();
        System.out.print("Enter n3 : ");
        int c = ns.nextInt();
        if(a<b && a<c)
            System.out.println("a is smallest number ");
        else if (b<a &&  b<c)
            System.out.println("b is greatest number ");
        else
            System.out.println("c is smallest number ");
    }
}

