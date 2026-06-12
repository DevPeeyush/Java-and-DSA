package Array;

public class L13SortZerosOnesTwos2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 0, 2, 1, 0, 1, 2, 0, 0};
        int n = arr.length;

        System.out.print("Array is : ");
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();

        System.out.println("Length of array is : " + n + "\n");
        System.out.print("Sorted array is : ");
        int low = 0, mid = 0, hi = n - 1;

        while (mid <= hi) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) mid++;
            else {
                //arr[mid]==2;
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
                }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int p = arr.length;
        System.out.println("Length of new arrays is : " + p);
    }
}

