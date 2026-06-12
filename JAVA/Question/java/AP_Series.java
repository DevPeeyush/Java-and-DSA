package Question.java;

import java.util.Scanner;

public class AP_Series {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        System.out.print("Enter the number of elements in series (n) : ");
        int n = ns.nextInt();

        System.out.print("Enter the first term of series (a) : ");
        int a = ns.nextInt();

        System.out.print("Enter the difference between two digits (d) : ");
        int d =ns.nextInt();

        System.out.println("Series of AP is : ");

        for (int i=1 ; i<=n ; i++){
            System.out.print((a+(i-1)*d)+" ");
        }
    }
}
