package PatternPrinting.ReverseTriangle;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the row and column : ");

        int n = ns.nextInt();

//        for (int i = 0; i <= n; i++) {
//            for (int j = 1; j<=n-i; j++) {
//                System.out.print(" * ");
//            }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=n+1-i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
/*
 output is :
 Enter the row and column : 4

 *  *  *  *
 *  *  *
 *  *
 *
 */
