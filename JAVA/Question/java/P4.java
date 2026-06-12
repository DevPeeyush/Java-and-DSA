package Question.java;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int a = sc.nextInt();
        if (a % 3 == 0 && a % 5 == 0) System.out.println(a + " is divisble by 5 and 3");
        else if (a % 3 == 0) System.out.println(a + " is only divisble by 3");
        else if (a % 5 == 0) System.out.println(a + " is only  divisble by 5");
        else System.out.println(a + " is not divisble by 5 and 3");
    }
}
