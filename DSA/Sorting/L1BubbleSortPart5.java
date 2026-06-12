package Sorting;

public class L1BubbleSortPart5 {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 2};
        int n = arr.length;
        System.out.println("Array is : ");
        print(arr);

        // bubble sort optimize
        for (int x = 0; x < n - 1; x++) { // No of passes
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            //check if this pass has sorted or not
            boolean flag = true; // true is for array is sorted
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                break;
            }
        }
        System.out.println("Sorted array is : ");
        print(arr);
    }
}
