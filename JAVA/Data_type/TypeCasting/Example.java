package Data_type.TypeCasting;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for changing : ");
        //int x = sc.nextInt();                 // int to double
        //double y = (double)x;

        double x =sc.nextDouble();              // double to int
        int y = (int)x;
        System.out.println("Value is : "+y);
    }
}
