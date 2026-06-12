package Stack;

import java.util.Scanner;
import java.util.Stack;

public class L7ValidBrackets {

    public static boolean isBalanced(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // opening brackets
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }

            // closing brackets
            else {

                if (st.size() == 0)
                    return false;

                if (c == ')' && st.peek() == '(') {
                    st.pop();
                }
                else if (c == '}' && st.peek() == '{') {
                    st.pop();
                }
                else if (c == ']' && st.peek() == '[') {
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }

        return st.size() == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String str = sc.nextLine();

        System.out.println(isBalanced(str));
    }
}