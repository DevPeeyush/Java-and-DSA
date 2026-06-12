package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class L1BasicStacks {
    public static void main(String[] args) {
//        int arr[] = new int[5];
//        ArrayList<Integer> list = new ArrayList<>();
//        Implementation of stack
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(2);
        st.push(4);
        System.out.println(st.peek());
        st.push(10);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.size());
    }
}
