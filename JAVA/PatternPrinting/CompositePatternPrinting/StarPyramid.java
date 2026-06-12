package PatternPrinting.CompositePatternPrinting;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) { // Spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= (2*i)-1; j++) { // Star
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
/*
Output
Enter n : 5
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
 */