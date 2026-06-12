package DSA.Stack;
import java.util.Stack;
public class L8NextGreaterElementM2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int n = arr.length;
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        res[n-1] = -1;
        st.push(arr[n-1]);
        for(int i = n-2 ; i>=0 ; i--){
            while(st.size() > 0 && st.peek() < arr[i]){
                st.pop();
            }
            if(st.size() == 0 ) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        System.out.println("Array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nNext Greater Element is : ");

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
