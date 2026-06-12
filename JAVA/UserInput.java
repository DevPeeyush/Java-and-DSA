import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double n = sc.nextDouble();     // For taking input from user
        System.out.println("Square of number is : "+n*n);
    }
}