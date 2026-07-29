package DSA.PrefixSum;

public class L3SuffixProduct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] prefixProduct = new int[n];
        prefixProduct[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * arr[i];
        }
        for (int ele : prefixProduct) {
            System.out.print(ele + " ");
        }
    }
}

