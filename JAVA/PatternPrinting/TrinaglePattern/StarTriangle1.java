package PatternPrinting.TrinaglePattern;

import java.util.Scanner;

public class StarTriangle1 {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        System.out.println("Enter the row and column : ");

        int n = ns.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
/*
output is :
Enter the row and column :
4

 *
 * *
 * * *
 * * * *
 */

