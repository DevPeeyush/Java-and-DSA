package Array;

public class Q6_Second_MaxElement
{
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 5, 50, 30, 66, 80, 99, 886, 56, 32, 52, 63, 322, 3, 33};
        int n = array.length;

        int max = Integer.MIN_VALUE;

        for (int i = 0 ; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Maximum value of an array is : " + max);

        int smax  = Integer.MIN_VALUE;
        for (int i = 0 ; i < n; i++) {
            if (array[i] != max) {
                smax = Math.max(smax,array[i]);
            }
        }
        System.out.println("Second maximum value of an array is : " + smax);
    }
}
