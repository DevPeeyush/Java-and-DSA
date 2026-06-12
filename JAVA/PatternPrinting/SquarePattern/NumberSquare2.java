package PatternPrinting.SquarePattern;

import java.util.Scanner;

public class NumberSquare2 {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter the row and column : ");
        int n = ns.nextInt();
        int m = ns.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(i+" ");
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
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
 */

