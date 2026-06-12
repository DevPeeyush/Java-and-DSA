package Sorting;

public class L1CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 12, 35, 26, 55, 56, 78};
        int n = arr.length;
        System.out.println("Array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        boolean flag = true; // assuming that array is sorted
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false; 
                break;
            }
        }
        if (flag == true) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted ");
    }
}

