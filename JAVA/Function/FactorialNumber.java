package Function;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        System.out.print("Enter th Factorial number : " );
        int x = ns.nextInt();

        calculateFactorial(x);
    }

    public static void calculateFactorial(int x ){

        if(x<0){
            System.out.println("Factorial is not possible ");
            return ;
        }

        int fact = 1;
        for (int i = 1 ; i <= x; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of number is : " + fact);
        return ;
    }
}
