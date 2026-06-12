package PatternPrinting.CompositePatternPrinting;

import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");

        int n = sc.nextInt();

        for (int i = 1; i <=(2*n) - 1; i++) { // print first line
            System.out.print("*" + " ");
        }
        System.out.println();
        n--; // because we required only n-1 row we already created one row

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) { // Star
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= 2*i -1; j++) { // Spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= n+1-i; j++) { // Star
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
/*
Output
Enter n : 4
* * * * * * *
* * *   * * *
* *       * *
*           *
 */