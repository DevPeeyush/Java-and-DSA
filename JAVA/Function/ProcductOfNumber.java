package Function;

import java.util.Scanner;

public class ProcductOfNumber {
    public static int calculateProduct(int a, int b) {
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        System.out.print("Enter the first digit : ");
        int a = ns.nextInt();

        System.out.print("Enter the second digit : ");
        int b = ns.nextInt();

        int product = calculateProduct(a,b);
        System.out.println("Product of number is : " + product);
    }
}
