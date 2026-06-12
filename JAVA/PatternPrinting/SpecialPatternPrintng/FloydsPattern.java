package PatternPrinting.SpecialPatternPrintng;

import java.util.Scanner;

public class FloydsPattern {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = ns.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+ " ");
                a+=1;
            }
            System.out.println();
        }
    }
/*
output is :
Enter the value of n : 5

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
}
