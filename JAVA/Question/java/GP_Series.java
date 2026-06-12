package Question.java;

import java.util.Scanner;

import static java.lang.Math.pow;

public class GP_Series {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        System.out.print("Enter the number of elements in series (n) : ");
        int n = ns.nextInt();

        System.out.print("Enter the first term of series (a) : ");
        int a = ns.nextInt();

        System.out.print("Enter the ratio of two digits (r) : ");
        int r =ns.nextInt();

        System.out.println("Series of GP is : ");

        for (int i=1 ; i<=n ; i++){
            System.out.print(a*pow(r,(i-1))+","+" ");
        }
    }
}
