package Strings;

import java.util.Scanner;

public class L3CountVowels {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = ns.nextLine();
        int x = str.length();
        int count = 0;
        for (int i = 0; i <x ; i++) {
            char ch = str.charAt(i);
            if(isVowel(ch)) count++;
        }
        System.out.println("Number of Vowel in the string is  : "+count);
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='A') return true;
        if(ch=='e' || ch=='E') return true;
        if(ch=='i' || ch=='I') return true;
        if(ch=='o' || ch=='O') return true;
        if(ch=='u' || ch=='U') return true;
        return false;
    }
}
