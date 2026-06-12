package Stack;

import java.util.Scanner;
import java.util.Stack;

public class L4InsertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println(st);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index  : ");
        int idx = sc.nextInt();
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(n);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println("New stack after insert element : "+st);
    }
}
