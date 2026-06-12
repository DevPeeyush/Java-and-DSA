package PatternPrinting.SquarePattern;

import java.util.Scanner;

public class AlphabateSmall {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        System.out.println("Enter the row and column : ");

        int n = ns.nextInt();
        int m = ns.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= m; j++)
            {
                System.out.print((char)(j+96) + " ");
            }
            System.out.println();
        }
    }
}
/*
output is :
Enter the row and column :
4
4
a b c d
a b c d
a b c d
a b c d
 */

