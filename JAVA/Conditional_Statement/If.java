package Conditional_Statement;

import java.util.Scanner;

public class If
{
    public static void main(String[] args)
    {
        // Even & Odd number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n%2==0)
            System.out.println("Number is even");
        else
            //if(n%2==1)
            //  if(n%2!=0) This also work for odd number
            System.out.println("Number is Odd");
    }
}
