package StringAdvance;

import java.util.Scanner;

public class L4StringBuilderInput {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = "Peeyush ";
        StringBuilder sb = new StringBuilder(ns.nextLine());
        System.out.println(sb.capacity());
        System.out.println("Reverse the string : "+sb.reverse());
    }
}
