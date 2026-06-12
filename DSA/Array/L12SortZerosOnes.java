package Array;

public class L12SortZerosOnes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0};
        int n = arr.length;
        System.out.println("Array is : ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }

        System.out.println();
        System.out.println("Sorted array is : ");

//Method 1st
//      Arrays.sort(arr);

// Method 2nd
        int noOfZeros = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0) noOfZeros++;
//        }
//
//        for (int i = 0; i < noOfZeros; i++) {
//            arr[i] = 0;
//            System.out.print(arr[i]+" ");
//        }
//
//        for (int i = noOfZeros; i < n; i++) {
//            arr[i] = 1;
//            System.out.print(arr[i]+" ");
//        }

// Method 3rd

        System.out.println();
        System.out.println("Sorted array is : ");

        for (int i = 0; i < n; i++) {
           if(arr[i]==0) noOfZeros++;
        }

        for (int i = 0; i < n; i++) {
          if(i<noOfZeros)
              arr[i] = 0;
          else arr[i] = 1;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
}

