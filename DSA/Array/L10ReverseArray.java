package Array;

public class L10ReverseArray
{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        System.out.print("Array is : ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        int n = arr.length;
        System.out.println("Length of array is : " + n);

        // Reverse array
        for (int i = 0; i <n/2 ; i++) {
            int j = n-1-i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
        }
        System.out.print("Reverse array is : ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
