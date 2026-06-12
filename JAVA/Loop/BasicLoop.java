package Loop;

import java.util.Scanner;

public class BasicLoop {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = ns.nextInt();
        for(int i = 1 ; i<=n ; i++){
            System.out.println("Hello Bhaiya Ji kase ho ");
        }
    }
}
