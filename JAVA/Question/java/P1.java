package Question.java;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        double a = sc.nextDouble();
        if(a%2 == 0) System.out.println(a + " is Even");
        else System.out.println(a + " is Odd");
    }
}
