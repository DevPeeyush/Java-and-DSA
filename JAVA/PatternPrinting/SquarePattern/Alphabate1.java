package PatternPrinting.SquarePattern;
import java.util.Scanner;
public class Alphabate1 {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter the row and column : ");
        int n = ns.nextInt();
        int m = ns.nextInt();
        for (int i = 1; i <= n; i++) {

//            Method 1
//            for (int j = 1; j <= m; j++) {
//                System.out.print((char)(j+64) +" ");

//            Method 2
//            for (int j = 0; j < m; j++) {
//                System.out.print((char) ('A' + j) + " ");
//            }

//            Method 3
            char ch = 'A';
            for (int j = 0; j < m; j++) {
                System.out.print(ch + " ");
                ch++;
            }


            System.out.println();
        }
    }
}
/*
output is :
Enter the row and column :
5
5
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
 */
