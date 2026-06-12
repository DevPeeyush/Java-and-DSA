package Stack;

import java.util.Scanner;
import java.util.Stack;

public class L2CopyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the size of the stack : ");
        n = sc.nextInt();

        System.out.println("Enter the elements in the stack ");
        for(int i = 0; i < n; i++){
            int x  = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        while(st.size() >0){
            gt.push(st.pop());
        }
        Stack<Integer> rt = new Stack<>();
        while(gt.size() >0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
        System.out.println(st+" is empty and size is "+st.size());
    }
}
