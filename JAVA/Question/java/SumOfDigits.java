package Question.java;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n  = ns.nextInt();
        int sum = 0;
        int last;
        while (n!=0){
            last = n%10;
            sum = sum + last;
            n = n/10;
        }
        System.out.println("Sum of digit is : " + sum);
    }
}
