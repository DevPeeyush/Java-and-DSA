package DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class L10InfixExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression : ");
        String str = sc.next();
//      str = "9-5+3*4/6"  gives 6
//      str = "9-(5+3)*4/6";  gives 4
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) val.push(ascii-48);
            else if (op.size()==0 || ch =='(' || op.peek() == '(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-') val.push(v1 - v2);
                    if(op.peek()=='+') val.push(v1 + v2);
                    if(op.peek()=='*') val.push(v1 * v2);
                    if(op.peek()=='/') val.push(v1 / v2);
                    op.pop();
                }
                op.pop(); // '(' is removed
            }
            else{
                if(ch=='+' || ch=='-'){
                    // Work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-') val.push(v1 - v2);
                    if(op.peek()=='+') val.push(v1 + v2);
                    if(op.peek()=='*') val.push(v1 * v2);
                    if(op.peek()=='/') val.push(v1 / v2);
                    op.pop();
                    //push
                    op.push(ch);
                }if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        // Work
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek()=='*') val.push(v1 * v2);
                        if(op.peek()=='/') val.push(v1 / v2);
                        op.pop();
                        //push
                        op.push(ch);
                    }else{
                        op.push(ch);
                    }
                }
            }
        }
        // val stack size
        while(val.size() > 1) {
            int v2 = val.pop();
            int v1 = val.pop();
            if (op.peek() == '+') val.push(v1 + v2);
            if (op.peek() == '-') val.push(v1 - v2);
            if (op.peek() == '*') val.push(v1 * v2);
            if (op.peek() == '/') val.push(v1 / v2);
            op.pop();
        }
        System.out.println("\nAnswer of the expression is  : "+val.peek());
    }
}
