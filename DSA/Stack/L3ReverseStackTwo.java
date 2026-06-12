package Stack;

import java.util.Stack;

public class L3ReverseStackTwo {
    public static void pushAtBottom(Stack<Integer> st, int val) {
        if (st.size() == 0) {
            st.push(val);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, val);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if (st.size()==1) return;
        int top  = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Orginal stack : ");
        System.out.println(st);
        System.out.println("Reverse stack using recursion : ");
        reverse(st);
        System.out.println(st);
    }
}
