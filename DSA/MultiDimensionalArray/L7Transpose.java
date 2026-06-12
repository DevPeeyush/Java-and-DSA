package MultiDimensionalArray;

public class L7Transpose {
    public static void main(String[] args) {
        // LEETCODE question no. is 867
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        int m = arr.length;
        int n = arr[0].length;
        // Row wise printing
        System.out.println("Matrix is : ");
        for (int i = 0; i < m; i++) { // rows
            for (int j = 0; j < n; j++) { // Column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Columns wise printing
        System.out.println("Transpose is : ");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Storing the elements in array
        System.out.println("Transpose of matrix is : ");
        int[][] transpose = new int[n][m];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <m; i++) {
                transpose[j][i] = arr[i][j];
                System.out.print(transpose[j][i]+" ");
            }
            System.out.println();
        }
    }
}
