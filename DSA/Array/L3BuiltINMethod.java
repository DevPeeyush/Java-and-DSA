package Array;

import java.util.Arrays;

public class L3BuiltINMethod {
    public static void main(String[] args) {
        int[] arr = {30, 10, 2, 80, 30, 85, 5};

        System.out.print("Array is : ");      // For writing an array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr);         // For sorting an array
        System.out.print("Sorting of an array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();     // It use for writing an array method 2
        System.out.print("Sorted array is : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}


