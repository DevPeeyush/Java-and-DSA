package BinarySearch;

import java.util.Scanner;

public class L1BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 15, 34, 81, 105, 180, 500, 614};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        int n = arr.length;
        int low = 0, high = n - 1;
        boolean flag = false; // Means we assume that number is not present in the array

        System.out.print("Enter the searching element  : ");
        Scanner ns = new Scanner(System.in);
        int target = ns.nextInt();

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }
        }
        if(flag==true){
            System.out.println("Target is present");
        }
        else System.out.println("Target not found ");
    }
}
