package PatternPrinting.TrinaglePattern;

import java.util.Scanner;

public class NumberAlphabet {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        System.out.print ("Enter the row and column : ");

        int n = ns.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j+96)+" ");
            }
            System.out.println();
        }
    }
}
