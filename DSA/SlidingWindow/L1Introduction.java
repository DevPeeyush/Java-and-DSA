package DSA.SlidingWindow;

import java.util.Scanner;

public class L1Introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the size of window : ");
        int k = sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int maxSum = 0;
        int i=0,j=k-1,sum=0;
        for(int a=0;a<=k-1;a++){ // k times
            sum += arr[a];
        }
        i++; j++;
        while(j<n){ // n-k times
            sum = sum - arr[i-1] + arr[j];
            i++; j++;
        }
        System.out.println("******************************************************");
        System.out.println("Maximum sum of the array is : "+sum+"\nwhen window is : "+k);
    }
}
