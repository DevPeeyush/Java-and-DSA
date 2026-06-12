package Array;

public class Q5_Max_Element {
    // Find the max. value of element from an array
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 5, 50, 30, 66, 80, 99, 886, 56, 32, 52, 63, 322, 3, 33};
        int n = array.length;
        // Method 1
//        int max = array[0];
//        for (int i = 1; i <n ; i++) {
//            if (max < array[i]){
//                max = array[i];
//            }
//        }
//        System.out.println("Maximum value of an array is : " +max );

        // Method 2
        int max = Integer.MIN_VALUE; //We use Integer.Min.Value because it is smaller value in integer
        System.out.println("Smallest value of an integer is : " + max);
        for (int i = 0; i < n; i++) {
            max = Math.max(max, array[i]); // Method 2 a by using math function

//            if (max < array[i]){        // Method 2 b
//                max = array[i];
//            }
        }
        System.out.println("Maximum value of an array is : " + max);
    }
}

