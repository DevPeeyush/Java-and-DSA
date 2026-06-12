package Array;

public class Q1
{
    public Q1() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{35, 63, 51, 25, 36, 25, 24, 25, 36, 20, 28, 35, 36, 38, 98, 87, 56, 28, 50};
        int n = arr.length;
        System.out.println(n);

        for(int i = 0; i <= n; ++i) {
            if (arr[i] < 35) {
                System.out.println("Roll number is : " + i);
            }
        }

    }
}
