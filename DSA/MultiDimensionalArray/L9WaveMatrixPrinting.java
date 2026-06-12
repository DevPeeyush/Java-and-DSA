package MultiDimensionalArray;

public class L9WaveMatrixPrinting {
    public static void use(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 10, 15}, {4, 5, 6, 11, 20}, {7, 8, 9,12,17}};
        int m = arr.length, n = arr[0].length;
        System.out.println("Matrix is :  ");
        use(arr);
        // Wave Printing
        System.out.println("Wave form of matrix is : ");
        for (int i = 0; i <m ; i++) {
            if(i%2==0){
                for (int j = 0; j <n ; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for (int j = n-1; j >=0 ; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
