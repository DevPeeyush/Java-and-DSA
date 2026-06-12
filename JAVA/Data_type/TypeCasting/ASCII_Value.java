package Data_type.TypeCasting;

import java.util.Scanner;

public class ASCII_Value {
    // A =65 B=66 C=67 D=68 E=69 ....Z=90
    // a=97 b=98 c=99 d=100....z=122
    // 0 =48 1=49 2=50.....
    // are ASCII value There total 128 ASCII values
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0);
        System.out.println("Character is "+ch);
        System.out.println("ASCII value of character is : "+(int)ch);
    }
}
