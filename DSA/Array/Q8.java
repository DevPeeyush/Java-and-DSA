package DSA.Array;

import java.util.Scanner;

public class Q8 {
    /* Question : Given an array of'N' integers
             There are Q queries
              For each query (l,r), find the usm of elements from index l to r (both inclusion)
              INPUT FORMAT :
              N (No. of elemenets)
              N integer
              Q (number of queries)
              Q1
              Q2
              ...
              QN
              */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i <= N - 1; ++i) {
            arr[i] = sc.nextInt();
        }
        // Printing array
        for (int i = 0; i <= N - 1; ++i) {
            System.out.print(arr[i] + " ");
        }
        // Printing sum
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sum = 0;
        for(int i = l ; i <=r ; i++){
            sum = arr[i]+sum;
        }
        System.out.println(sum);
    }
}
