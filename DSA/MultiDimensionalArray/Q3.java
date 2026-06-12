package MultiDimensionalArray;

public class Q3 {
    public static void main(String[] args) {
        // WAP to find smallest element in given 2D array

        int[][] arr = {{10,15,226},{2,30,1},{45,20,36}};
        int mn =Integer.MAX_VALUE;

        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                mn = Math.min(mn,arr[i][j]);
            }
        }
        System.out.println("Smallest value of given 2D array is : "+mn);
    }
}

