package Sorting;

public class L1BubbleSortPart1 {

    public static void print(int[] arr) { // Function for printing the array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Not sort every array
        //int[] arr = {3, 1, 2, 5, 4}; // sorting is done
        int[] arr = {5,1,3,4,2}; // sorting is not done by this method
        int n = arr.length;
        System.out.println("Array is : ");
        print(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("Sorted array is : ");
        print(arr);
    }
}