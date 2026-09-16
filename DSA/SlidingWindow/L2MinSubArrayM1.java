package DSA.SlidingWindow;

public class L2MinSubArrayM1 {
//    M-1:
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0, j = i;
            while (j < n && sum < target) {
                sum += nums[j];
                j++;
            }
            j--;
            int len = j - i + 1;
            if (sum >= target) minLen = Math.min(len, minLen);
        }
        if (minLen == Integer.MAX_VALUE) return 0;
        return minLen;
    }
}