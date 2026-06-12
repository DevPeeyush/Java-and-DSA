package Array;

public class Q4_Min_Element
{
    // Find the min. value of element from an array
    public static void main(String[] args) {
        int[] array = {10,20,30,5,50,30,66,80,99,886,56,32,52,63,322,3,33};
        int n = array.length;
        int min = array[0];
        for (int i = 1; i <n ; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        } System.out.println("Minimum element i arrya is : " + min
        );
    }
}
