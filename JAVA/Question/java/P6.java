package Question.java;

import java.util.Scanner;

// Check the character is vowel or not
public class P6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the alphabet : ");
        String ch = input.nextLine();
        switch (ch) {
            case "a":
                System.out.println("Vowel");
                break;
            case "e":
                System.out.println("Vowel");
                break;
            case "i":
                System.out.println("Vowel");
                break;
            case "o":
                System.out.println("Vowel");
                break;
            case "u":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a vowel");
        }
    }
}

