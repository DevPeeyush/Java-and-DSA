package MultiDimensionalArray;

public class L2Output {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr [0][0] = 10;
        arr [0][1] = 20;
        arr [0][2] = 30;
        arr [1][0] = 40;
        arr [1][1] = 50;
        arr [1][2] = 60;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
