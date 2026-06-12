package PatternPrinting.SquarePattern;

import java.util.Scanner;

public class BasicSquare1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row and columsn : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

/*
output is :
*****
*****
*****
*****
 */

