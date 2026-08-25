package DSA.Sorting;

public class L5MergeSort {

    // Utility method to print array contents
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.print("Original Array: ");
        printArray(arr);

        // Call the sorting function over the entire array
        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }

    // 1. Divide: Recursively splits the array into two halves
    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            // Find middle point
            int mid = left + (right - left) / 2;

            // Sort first half
            mergeSort(arr, left, mid);

            // Sort second half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // 2. Combine: Merge two sorted subarrays
    private static void merge(int[] arr, int left, int mid, int right) {

        // Size of left and right subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy left half
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }

        // Copy right half
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Initial indexes
        int i = 0;
        int j = 0;
        int k = left;

        // Merge in ascending order
        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }

            k++;
        }

        // Remaining elements from left array
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Remaining elements from right array
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}