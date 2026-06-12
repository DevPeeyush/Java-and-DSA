package Array;

public class L13SortZerosOnesTwos {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0};
        System.out.print("Array is : ");
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        int noOfZero = 0;
        int noOfOnes = 0;

        int n = arr.length;

        System.out.println("Lenghth of array is : "+n);
        System.out.print("Sorted array is : ");

// Method 1 :

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) noOfZero++;
            if (arr[i] == 1) noOfOnes++;
        }
        for (int i = 0; i < n; i++) {
           if (i<noOfZero) arr[i] = 0;
           else if (i<(noOfZero|+noOfOnes)) arr[i] = 1;
           else arr[i] = 2;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}