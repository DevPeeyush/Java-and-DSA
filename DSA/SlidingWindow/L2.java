package DSA.SlidingWindow;

import java.util.Scanner;

public class L2 {
//    M-1:
//    public static int minSubArrayLen(int target, int[] nums) {
//        int n = nums.length;
//        int minLen = Integer.MAX_VALUE;
//        for(int i = 0 ; i<n ;i++){
//            int sum = 0 , j = i;
//            while(j<n && sum<target){
//                sum += nums[j];
//                j++;
//            }
//            j--;
//            int len = j-i+1;
//            if(sum>=target) minLen = Math.min(len,minLen);
//        }
//        if(minLen == Integer.MAX_VALUE) return 0;
//        return minLen;
//    }

    //    M-2:
    public static int minSubArrayLen(int target, int[] arr) {
        int n = arr.length, minLen = Integer.MAX_VALUE;
        int i = 0, j = 0, sum = 0;
        while(j<n && sum<target){ // first window
            sum += arr[j++];
        }
        j--;
        // sliding window
        while(i<n && j<n){
            int len = j-i+1;
            if(sum>=target) minLen = Math.min(minLen,len);
            sum -= arr[i];
            i++; j++;
            while(j<n && sum<target){
                sum += arr[j++];
            }
            j--;
        }
        if(minLen==Integer.MAX_VALUE) return 0;
        return minLen;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        for (int ele : nums) {
            System.out.print(ele + " ");
        }
        System.out.println(minSubArrayLen(target, nums));
    }
}