package Array;
public class Q7
// Find the double in the array whose sum is equal to the given value x. (Two sum )
{
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,10};
        int x = 3;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1 ; j <arr.length ; j++) {
                if(arr[i] + arr[j] == x ){
                    System.out.println(arr[i] + " " +arr[j]);
                }
            }
        }
    }
}
