package Question.java;
import java.util.Scanner;
// what is palindrome
// eg: 121 if reverse it 121 same , 146 if reverse it it become 641 not same

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int rev = 0, temp = num;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}