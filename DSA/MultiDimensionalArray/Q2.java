package MultiDimensionalArray;

public class Q2 {
    public static void main(String[] args) {
        // WAP to find largest element in given 2D array
        int[][] arr = {{10,15,226},{2,30,1},{45,20,36}};
        int mx = Integer.MIN_VALUE;

        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                mx = Math.max(mx,arr[i][j]);
            }
        }
        System.out.println("Largest value of given 2D array is : "+mx);
    }
}
