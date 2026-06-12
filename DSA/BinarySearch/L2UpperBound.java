package BinarySearch;

import java.util.Scanner;

public class L2UpperBound {
    public static void main(String[] args) {
        // Lower bound means index of number or arr[index] >= X
        int[] arr = {10, 15, 34, 34, 81, 81 , 105, 180, 500, 614};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        int n = arr.length;
        int low = 0, high = n - 1;
        int ub = n;

        System.out.print("Enter the searching element  : ");
        Scanner ns = new Scanner(System.in);
        int target = ns.nextInt();

        while (low < high) {
            int mid = low + (high-low) / 2;
//            Or we can write (low+high)/2 but we use this|
            if (arr[mid] >= target) {
                ub = Math.min(ub , mid);
                high = mid - 1;
            }
            else low = mid+1;
        }
        System.out.println("Lower bound of number is : " + ub);
    }
}
