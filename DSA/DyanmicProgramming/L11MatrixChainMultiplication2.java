package DSA.DyanmicProgramming;
// Using 1D array
// Using Recursion
public class L11MatrixChainMultiplication2 {
    private static int mcm(int i, int j, int[] matrix) {
        if (i == j) return 0;
        int minCost = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int cost = matrix[i] * matrix[k+1] * matrix[j+1];
            int totalCost = mcm(i, k, matrix) + mcm(k + 1, j, matrix) + cost;
            minCost = Math.min(minCost, totalCost);
        }
        return minCost;
    }

    public static void main(String[] args) {
        // For 1d MATRIX
        int[] matrix = {1,2,3,4};
        int n = matrix.length;
        // We use n-2
        System.out.print("Min Cost : "+mcm(0, n - 2, matrix));
    }
}
