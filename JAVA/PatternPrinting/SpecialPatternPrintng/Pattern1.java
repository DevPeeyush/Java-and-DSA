package PatternPrinting.SpecialPatternPrintng;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the row and column : ");
        int n = ns.nextInt();


        for(int i = 1 ; i<=n ; i++){                          // method 1    (second most used loop)
            int a =1;
            for(int j=1;j<=i ; j++){
                System.out.print( a +" ");
                a+=2;
            }

//        for (int i = 1; i <= n; i++) {
//            for(int j=1; j<=2*i-1  ;j=j+2) {                     // method 2
//                System.out.print(j + " ");
//            }

//      for (int i = 1; i <= n; i++) {
//            for (int j = 1; j<=i; j++) {                     // method 3 (most probably use this type of loop)
//                System.out.print(2*j-1+" ");
//            }

            System.out.println();
        }
    }
}
/*
output is :

Enter the row and column : 5
1
1 3
1 3 5
1 3 5 7
1 3 5 7 9
 */

