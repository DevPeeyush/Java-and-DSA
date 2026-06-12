package MultiDimensionalArray;

public class L14MultiplicationOfMatrix {
    public static void print (int[][] arr) {
        // Method 1 of printing of an array by using function
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = {{1, 2, 1}, {2, 1, 2}};
        int[][] b = {{1, 2, 3}, {2, 3, 1}, {4, 2, 3}};
// Method 2 of printing matrix
//        System.out.println("matrix a is : ");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("matrix b is : ");
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b[0].length; j++) {
//                System.out.print(b[i][j] + " ");
//            }
//            System.out.println();
//        }

       // System.out.println("Multiplication of matrix a and b  : ");
        if (a[0].length != b.length) {
            System.out.println("Multiplication is not possible ");
        } else {
            int[][] c = new int[a.length][b[0].length];
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    //  c[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j] + ...
                    for (int k = 0; k < b.length; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                   // System.out.print(c[i][j] + " ");
                }
                //System.out.println();
            }
            System.out.println("Matrix a is : ");
            print(a);
            System.out.println("Matrix b is : ");
            print(b);
            System.out.println("Multiplication of matrix a and b is : ");
            print(c);
        }
    }
}

