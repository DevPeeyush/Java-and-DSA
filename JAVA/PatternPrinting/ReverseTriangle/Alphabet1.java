package PatternPrinting.ReverseTriangle;

import java.util.Scanner;

public class Alphabet1 {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the row and column : ");

        int n = ns.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=n+1-i; j++) {
                System.out.print((char) (i+64) +" ");
            }
            System.out.println();
        }
    }
}
/*
output is :
Enter the row and column :5

A A A A A
B B B B
C C C
D D
E
 */
