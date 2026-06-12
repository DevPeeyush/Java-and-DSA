package MultiDimensionalArray;

public class Q5 {
    public static void main(String[] args) {

        // Product of elements of an 2D array
        int[][] arr = {{10, 1, 2}, {2, 3, 1}, {4, 2, 3}};

        int m = arr.length;
        int n = arr[0].length;

        int Product = 1 ;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Product = Product*arr[i][j];
            }
        }
        System.out.println("Product of array is  : " +Product);
    }
}
