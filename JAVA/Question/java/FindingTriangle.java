package Question.java;

import java.util.Scanner;

public class FindingTriangle {
    /*
    Triangle is form when
    a+b>c
    b+c>a
    a+c>b
 */
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        System.out.print("Enter side a : ");
        int a = ns.nextInt();
        System.out.print("Enter side b : ");
        int b = ns.nextInt();
        System.out.print("Enter side c : ");
        int c = ns.nextInt();

        if ((a+b)>c && (b+c)>a && (c+a)>b)
            System.out.println("Triangle is Valid ");
        else
            System.out.println("Triangle is Invalid ");
    }
}
