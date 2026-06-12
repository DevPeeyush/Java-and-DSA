package Question.java;

import java.util.Scanner;

import static java.lang.Math.pow;

public class SynatxOfPower {
    public static void main(String[] args) {
        Scanner ns =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = ns.nextInt();

        System.out.print("Enter the value of power : ");
        int p = ns.nextInt();

        System.out.println(pow(n,p));
    }
}
