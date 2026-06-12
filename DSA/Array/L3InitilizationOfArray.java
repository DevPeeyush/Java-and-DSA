package Array;

public class L3InitilizationOfArray
{
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90};
        int n = arr.length;
        System.out.println("Elements in an array is : " + n);

        for(int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

    }
}
