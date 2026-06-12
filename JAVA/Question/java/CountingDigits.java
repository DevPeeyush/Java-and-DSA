package Question.java;

import java.util.Scanner;

public class CountingDigits {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter the number  : ");
        int n = ns.nextInt();
        int count = 0;
        while(n != 0){
            n = n/10;
            count++;
        }
        System.out.println("Number of digit in number are : " + count );
    }
}
