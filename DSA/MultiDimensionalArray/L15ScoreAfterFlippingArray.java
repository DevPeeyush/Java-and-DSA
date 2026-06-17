package DSA.MultiDimensionalArray;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        // Input matrix
        int[][] arr = new int[m][n];

        System.out.println("Enter matrix elements (0 or 1):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 1: Flip rows whose first element is 0
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] ^= 1;
                }
            }
        }

        // Step 2: Flip columns where zeros > ones
        for (int j = 1; j < n; j++) {
            int ones = 0;

            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 1) {
                    ones++;
                }
            }

            if (ones < m - ones) {
                for (int i = 0; i < m; i++) {
                    arr[i][j] ^= 1;
                }
            }
        }

        // Step 3: Calculate score
        int score = 0;

        for (int i = 0; i < m; i++) {
            int rowValue = 0;

            for (int j = 0; j < n; j++) {
                rowValue = rowValue * 2 + arr[i][j];
            }

            score += rowValue;
        }

        // Print final matrix
        System.out.println("\nFinal Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maximum Score = " + score);

        sc.close();
    }
}