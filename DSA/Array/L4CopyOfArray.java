package Array;

import java.util.Arrays;

public class L4CopyOfArray
{
    public static void main(String[] args) {
        int[] arr = {20,30,40,50,60};
        System.out.print("Array is : ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        int[] num = arr; // Shallow Copy
        num[0] = 70 ;
        System.out.println("Element at index 0 : "+arr[0]);

        System.out.println("Copy and Updation of array : ");
        int[] brr = Arrays.copyOf(arr,arr.length); // Deep Copy
        for(int ele : brr){
            System.out.print(ele + " ");
        }
    }
}