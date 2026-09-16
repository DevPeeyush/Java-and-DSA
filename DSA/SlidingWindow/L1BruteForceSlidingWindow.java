package DSA.SlidingWindow;

import java.util.Scanner;

public class L1BruteForceSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {10,20,5,-9,5,6,27,6};
        int n = arr.length;
        int k = 1;
        int sum = 0;
        int maxSum = 0;
        for(int i=0; i<n-k+1;i++){
            for(int j = i; j<=i+k-1;j++){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println(maxSum);
    }
}
