package MultiDimensionalArray;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //  WAP to store marks and roll no. of students using side by side array
        Scanner sc = new Scanner(System.in);
        int [][] students = new int[4][2];
        System.out.println("Enter the roll number and marks  of students : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <2 ; j++) {
              students[i][j] = sc.nextInt();
            }
            System.out.println();
        }



        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print(students[i][j]+" ");
            }
            System.out.println();
        }
    }
}

