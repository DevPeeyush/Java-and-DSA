package DSA.PrefixSum;

public class L4SuffixProduct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] suffixProduct = new int[n];
        suffixProduct[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixProduct[i] = suffixProduct[i + 1] * arr[i];
        }
        for (int ele : suffixProduct) {
            System.out.print(ele + " ");
        }
    }
}

