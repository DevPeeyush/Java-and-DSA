package PatternPrinting.CompositePatternPrinting;

import java.util.Scanner;

public class NumberTrianglePalindrom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) { // Spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=i; j++) { // Number
                System.out.print(j + " ");
            }
            for (int j = i-1; j >=1; j--) { // Number
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
/*
Output
Enter n : 4
      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1
 */