package PatternPrinting.TrinaglePattern;

import java.util.Scanner;

public class AlphabetSmall2 {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        System.out.println("Enter the row and column : ");

        int n = ns.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j+96)+" ");
            }
            System.out.println();
        }
    }
}
/*
output is :
Enter the row and column :
5

a
a b
a b c
a b c d
a b c d e
 */
