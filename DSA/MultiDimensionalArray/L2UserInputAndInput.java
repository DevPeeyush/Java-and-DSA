package MultiDimensionalArray;

import java.util.Scanner;

public class L2UserInputAndInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number if rows : ");
        int n = sc.nextInt();

        System.out.print("Enter the number if columns : ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
// Input of 2d array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
// Output of 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
