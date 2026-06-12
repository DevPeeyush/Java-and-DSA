package Array;

public class L6PassingArrayToMethod
{
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println(array[0]);
        change(array);
        System.out.println(array[0]);
    }

    public static void change(int[] array) {
        array[0] = 90;
    }
}
