package MultiDimensionalArray;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        // Sum of elements of an 2D array
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number if rows : ");
        int n = sc.nextInt();

        System.out.print("Enter the number if columns : ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
// Input of 1st  array
        System.out.println("Enter the first array : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
// Output of 1st array
        System.out.println("First array is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // Input of 2nd array
        System.out.println("Enter the second element : ");
        int[][] brr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                brr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
// Output of 2D array
        System.out.println("Second  array is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
// Sum of array is
        int[][] c = new int[m][n];
        System.out.println("sum of array is : ");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = arr[i][j]+brr[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}


