package Stack;

import java.util.Stack;

public class L3ReverseStack {
    public static void displayRec(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        System.out.print(top+" ");
        displayRec(st);
        st.push(top);
    }
    public static void display(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Orginal stack : ");
        System.out.println(st);

        //using recursion
        System.out.println("Reverse stack using recursion : ");
        displayRec(st);
        System.out.println();

        // Using arrays
        System.out.println("Reverse using array : ");
        int n  = st.size();
        int[] arr = new int[n];
        for(int i = n-1 ; i > 0 ; i--){
            arr[i] = st.pop();
        }
        for(int i = 1; i < n; i++){
            st.push(arr[i]);
        }
        System.out.println(st);

        // Using predefine functions
        Stack<Integer> st2 = new Stack<>();
        System.out.println("Reverse Stack using predefine functions : ");
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        System.out.println(st2);
    }
}
