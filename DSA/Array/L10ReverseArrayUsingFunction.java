package Array;

public class L10ReverseArrayUsingFunction
{
    public static void main(String[] args)
    {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

        System.out.print("Array is : ");
        for (int ele : arr)
        {
            System.out.print(ele + " ");
        }

        System.out.println();

        int n = arr.length;
        System.out.println("Length of array is : " + n);

        // Reverse array using two pointers
        int i = 0;
        int j = n-1;
        while(i<=j)
        {
            swap(arr, i , j);
            i++;
            j--;
        }
        System.out.print("Reverse array is : ");
        for (int ele : arr)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
