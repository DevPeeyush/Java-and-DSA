package Array;

public class L15NextGreatestElement{
    public static void main(String[] args) {
        int[] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;
        for (int i = 0 ; i <n-1 ; i++) {
            int mx = Integer.MIN_VALUE;
            for(int j=i+1 ; j<n;j++){
                mx = Math.max(mx,arr[j]);
            }
            ans[i] = mx;
        }
        System.out.print("Array is : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        System.out.print(" \n Next Greatest element 's array is : ");
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
