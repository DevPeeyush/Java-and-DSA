package Strings;

import java.util.Scanner;

public class L1Input {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String str ;
        // str = ns.next(); USE FOR PRINT ONLY ONE STRING
        str = ns.nextLine();
        System.out.println("Name is : "+str);
    }
}
