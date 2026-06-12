package Sorting;

public class L3InsertionSortPart2 {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
//        Swapping the array
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2};
        int n = arr.length;
        print(arr);

//        Insertion Sort standard code
        for (int i = 1; i < n; i++) { // No. of pass
            int j = i;
            while (j >= 1 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
        print(arr);
    }
}