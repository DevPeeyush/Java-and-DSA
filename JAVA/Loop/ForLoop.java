package Loop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = ns.nextInt();
        // For loop Syntax
        /* for(initialization : Condition ; Increment)
            {
            System.out.println();
            }
         */
        for (int i=1;i<=n;i++){
            System.out.print(i+" ");  // print in same line
            //System.out.println(i);   // print in new lin
        }
    }
}
// Iteration - Number of times i change its value (rounds)

