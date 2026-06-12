package Loop;

import java.util.Scanner;

public class Do_whileLoop {
    /*      Syntax is :
        do{
        //code
        }while(another=='y';
 */
    // First print than check the condition
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = ns.nextInt();
        int i = 1;
        do {
            System.out.print(i+" ");
            i++;
        } while (i<=n);
    }
}
