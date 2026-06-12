package Recursion;

import java.util.Scanner;

public class L5PowerFunction {
    public static int power(int n, int k) {
        if(k==0 && n==0){
            System.out.println("Undefined");
            return -1;
        }
        if (k==0)  return 1;
        return n * power(n,k-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of base  : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of power : ");
        int b = sc.nextInt();
        System.out.println(a + " to the power " + b + " is : "+power(a, b));
    }
}


