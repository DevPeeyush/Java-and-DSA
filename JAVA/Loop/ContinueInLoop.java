package Loop;

import java.util.Scanner;

public class ContinueInLoop {
    // Continue is use for skip some particular iteration
    // WAP to print odd number using continue keyword
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = ns.nextInt();
        int i;
//        // 50 iteration
//        for (i =1; i<=n ; i+=2){
//            System.out.println(i+" ");
//        }
        // 100 iteration using continue
        for (i = 1 ; i<=n ;i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
