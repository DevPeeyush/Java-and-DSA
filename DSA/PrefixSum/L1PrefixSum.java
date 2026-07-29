package DSA.PrefixSum;

public class L1PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int n = arr.length;
        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int ele : prefixSum) {
            System.out.print(ele + " ");
        }
    }
}
