package PatternPrinting.CompositePatternPrinting;

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");

        int n = sc.nextInt();

        for (int i = 1; i <=(2*n) - 1; i++) { // print first line
            System.out.print( i + " ");
        }
        System.out.println();
        n--; // because we required only n-1 row we already created one row

        for (int i = 1; i <= n; i++) {
            int a =1;
            for (int j = 1; j <= n+1-i; j++) { // Star
                System.out.print(a + " ");
                a++;
            }
            for (int j = 1; j <= 2*i -1; j++) { // Spaces
                System.out.print(" " + " ");
                a++;
            }
            for (int j = 1; j <= n+1-i; j++) { // Star
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
/*
Output
Enter n : 4
1 2 3 4 5 6 7
1 2 3   5 6 7
1 2       6 7
1           7
 */