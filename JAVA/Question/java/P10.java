package Question.java;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        int sum = 0;
        do {
            sum = sum +i;
            i++;
            System.out.print(sum);
        }while (i<=n);
    }
}
