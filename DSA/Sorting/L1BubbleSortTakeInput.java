package Sorting;

import java.util.Scanner;

public class L1BubbleSortTakeInput {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = ns.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array : ");
        int i;
        for (i = 0; i <= n - 1; ++i) {
            arr[i] = ns.nextInt();
        }

        for (i = 0; i <= n - 1; ++i) {
            System.out.print(arr[i] + " ");
        }
        for (int x = 0; x < n - 1; x++) {
            boolean flag = true; // No of passes
            for (int j = 0; j < n - 1 - x; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
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
