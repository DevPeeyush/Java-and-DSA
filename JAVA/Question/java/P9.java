package Question.java;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int a = sc.nextInt();
//        for (int i = 0; i <= a; i++) {
//            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
//            else if (i % 3 == 0) System.out.println("Fizz");
//            else if (i % 5 == 0) System.out.println("Buzz");
//            else System.out.println(i);
        int i = 0;
        while( i <= a){
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
            i++;
        }
    }
}
