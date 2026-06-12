package PatternPrinting.SquarePattern;

import java.util.Scanner;

public class Alphabate2 {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter the row and column : ");
        int n = ns.nextInt();
        int m = ns.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print((char)(i+64) +" ");
            }
            System.out.println();
        }
    }
}
/*
output is :
Enter the row and column :
5
5
A A A A A
B B B B B
C C C C C
D D D D D
E E E E E
 */

