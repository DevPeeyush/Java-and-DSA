package DSA.Pratise;

import java.util.Scanner;

public class Q1 {
    public static void printVal(int n){
        if(n == 0) return;
        printVal(n-1);
        System.out.print(n+" ");
    }
    public static void revPrintVal(int n){
        if(n==0) return;
        System.out.print(n+" ");
        revPrintVal(n-1);
        return ;
    }
    public static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
    public static int fibo(int n){
        if(n==1) return 1;
        if(n==0) return 0;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        printVal(n);
        System.out.println();
        revPrintVal(n);
        System.out.println();
        System.out.println("Factorial of the "+n+" is "+fact(n));
        System.out.println("Fibo of the number " +n+"is : "+fibo(n));
    }
}
