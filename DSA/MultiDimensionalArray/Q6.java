package MultiDimensionalArray;

public class Q6 {
    public static void main(String[] args) {
        // WAP to add two matrices
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{10,11,12},{13,14,15},{16,17,18}};
        int[][] res = new int[3][3];
        System.out.println("Matrix a is : ");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matrix b is : ");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        // Not make matrix
        System.out.println("Sum  is : ");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
               int re = a[i][j] + b[i][j];
                System.out.print(re+" ");
            }
            System.out.println();
        }
        // Matrix is formed
        System.out.println("Sum of matrices is : ");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = a[i][j] + b[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
