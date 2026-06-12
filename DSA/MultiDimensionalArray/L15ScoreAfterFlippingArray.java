//class Solution {
//    public static void main(String[] args) {
//        int[][] a = {{1,0,1},{1,0,0}};
//        int[][] b = {{1,1,1},{1,0,0},{0,0,1}};
//        int[][] arr = new int[a.length][b.length];
//        int m = arr.length, n = arr[0].length;
//        // put 1 at the 0th position of the array
//        for (int i = 0; i < m; i++) {
//            if (arr[i][0] == 0) { // Flip that row
//                for (int j = 0; j < n; j++) {
//                    if (arr[i][j] == 0) arr[i][j] = 1;
//                    else arr[i][j] = 0;
//                }
//            }
//        }
//        // flip those columns where (no. of 0s > no. of 1s)
//        for (int j = 1; j < n; j++) {
//            int noOfZeros = 0, noOfOnes = 0; // Flip that column
//            for (int i = 0; i < m; i++) {
//                if (arr[i][j] == 0) noOfZeros++;
//                else noOfOnes++;
//            }
//            if (noOfZeros > noOfOnes) {
//                for (int i = 0; i < m; i++) {
//                    if (arr[i][j] == 0) arr[i][j] = 1;
//                    else arr[i][j] = 0;
//                }
//            }
//        }
//        // Calculating the score
//        int score = 0;
//        int x = 1;
//        for (int j = n - 1; j >= 0; j--) {
//            for (int i = 0; i < m; i++) {
//                score += (arr[i][j] * x);
//            }
//            System.out.print(arr[][j]);
//            x *= 2;
//        }
//    }
//}
