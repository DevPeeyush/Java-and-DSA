package Function;

import java.util.Scanner;

public class Syntax {
    public static void printMyName(String name ){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        System.out.print("Enter the name of person : ");
        Scanner ns = new Scanner(System.in);
        String name = ns.next();

        printMyName(name);   // Calling the function
    }
}
