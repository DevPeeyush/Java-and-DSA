package DSA.DyanmicProgramming;

// Using DP and 1D array
// Using Memoization
public class L11MatrixChainMultiplication3 {
    private static int mcm(int i, int j, int[] matrix, int[][] dp) {
        if (i == j) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        int minCost = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int cost = matrix[i] * matrix[k + 1] * matrix[j + 1];
            int totalCost = mcm(i, k, matrix, dp) + mcm(k + 1, j, matrix, dp) + cost;
            minCost = Math.min(minCost, totalCost);
        }
        return dp[i][j] = minCost;
    }
    public static void main(String[] args) {
        // For 1d MATRIX
        int[] matrix = {1, 2, 3, 4};
        int n = matrix.length;
        int[][] dp = new int[n - 1][n - 1];
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                dp[i][j] = -1;
            }
        }

        // We use n-2
        System.out.print("Min Cost : " + mcm(0, n - 2, matrix, dp));
    }
}
