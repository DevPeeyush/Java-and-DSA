package StringAdvance;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Update even position of index in string with a
        System.out.print("Enter the string : ");
        Scanner ns = new Scanner(System.in);

        String x = ns.nextLine();
        int n = x.length();
        //Creating new string for changing because change in old/current string is not possible
        System.out.println("Changed string is : ");
        String str = "";
        for (int i = 0; i <n ; i++) {
            if(i%2==0) str = str+'a';
            else str = str+x.charAt(i);
        }
        System.out.println(str);
    }
}
