package DSA.Array;

import java.util.Scanner;

public class Q8UsingPrifixSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] prefix = new int[N];

        // Input array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }

        // Build prefix sum array
        prefix[0] = arr[0];
        for (int i = 1; i < N; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        // Number of queries
        int Q = sc.nextInt();
        // Process queries
        while ((Q--) > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum;
            if (l == 0) sum = prefix[r];
            else sum = prefix[r] - prefix[l - 1];
            System.out.println(sum);
        }
        sc.close();
    }
}
