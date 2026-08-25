package DSA.DyanmicProgramming;
// Using 2D array
// Using Recursion
public class L11MatrixChainMultiplication {
    private static int mcm(int i, int j, int[][] matrix) {
        if (i == j) return 0;
        int minCost = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int cost = matrix[i][0] * matrix[k][1] * matrix[j][1];
            int totalCost = mcm(i, k, matrix) + mcm(k + 1, j, matrix) + cost;
            minCost = Math.min(minCost, totalCost);
        }
        return minCost;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {2, 3}, {3, 4}, {4, 2},};
        int n = matrix.length;
        System.out.print("Min Cost : "+mcm(0, n - 1, matrix));
    }
}
