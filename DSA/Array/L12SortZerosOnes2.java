package Array;

public class L12SortZerosOnes2 {
    public static void main(String[] args) {

// Method 4th    Also Known as one pass solution

//        int[] arr = {1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0};
        int[] arr = {0,0,0,1,1,1};
        int n = arr.length;

        System.out.println("Array is : ");

        for(int ele : arr){
            System.out.print(ele+" ");
        }

        System.out.println();
        System.out.println("Sorted array is : ");

        int i = 0;
        int j = n-1;
        while (j > i){
            if(arr[i] == 0) i++;
            if(arr[j] == 1) j--;
            if(i>j) break;
            if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
// Method 4th (b)
//        if(arr[i] == 0) i++;
//        else if(arr[j] == 1) j--;
//        else if(arr[i] == 1 && arr[j] == 0){
//        arr[i] = 0;
//        arr[j] = 1;
//        i++;
//        j--;
//        }
//        }