package Opertor;

import java.util.Scanner;

public class ModulasOperator {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        int modulus = a%b;
        System.out.println("Quotient of a/b is : "+a/b);
        System.out.println("Remainder of a%b is : " + modulus);
    }
}
/*
   Properties of modulus  :
   1. a%b = a so a>b
   2. a%(-b) = a%b
   3. -a%b = -(a%b)
   4. (-a)%(-b) = -(a%b)

*/

