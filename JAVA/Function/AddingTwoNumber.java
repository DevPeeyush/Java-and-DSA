package Function;

import java.util.Scanner;

public class AddingTwoNumber {
        public static int calculateSum(int a, int b) {
            int sum = a + b;
            return sum;
        }

        public static void main(String[] args) {
            Scanner ns = new Scanner(System.in);

            System.out.print("Enter the first digit : ");
            int a = ns.nextInt();

            System.out.print("Enter the second digit : ");
            int b = ns.nextInt();

            int sum = calculateSum(a, b);
            System.out.println("Sum of number is : " + sum);
        }
}

