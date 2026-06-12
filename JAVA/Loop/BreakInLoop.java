package Loop;

import java.util.Scanner;

public class BreakInLoop {
    // Break : It is a keyword used to finish or terminate the loop
    // WAP to find number is composite or prime number
    // Composite number :  Number 1 and itself eg: 4 $ has 1, 2 , 4 are its factor so 4 is composite number
    // 1 is not prime number and composite number
    // Prime number : Number whose factor is 1 and itself
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = ns.nextInt();
        int i;
        int x = 0; // 0 means prime number
        for (i=2 ; i<=n-1 ; i++){
            if(n%i==0)
            {
                System.out.println("Number is composite number ");
                x = 1; // 1 means composite number
                break;
            }
        }
        if(n==1) System.out.println("Number is neither prime or not composite");
        if(x==0) System.out.println("Prime number ");
    }
}
