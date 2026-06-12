package Array;

public class Q3_ProductOfArray
{
    public static void main(String[] args) {
        // int[] arr = {20,30,54,56,25,35,39,7,5,655,6,58,32,25,2039,90,660,6,5,56,59,62,966,296,26,2962,62,962,62,63};
        int[] arr ={10,20,30,40,50,60,70,80,90,100};

        int n = arr.length;
        System.out.println(n);

        int product = 1;

        for (int i = 0; i<n ; i++) {
            product = product * arr[i];
        }
        System.out.println("Product of array is : " + product);
    }
}
