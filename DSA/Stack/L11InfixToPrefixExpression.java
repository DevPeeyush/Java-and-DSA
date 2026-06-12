package DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class L11InfixToPrefixExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression : ");
        String infix = sc.next();
//      str = "9-5+3*4/6"  gives 6
//      str = "9-(5+3)*4/6";  gives 4
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0;i<infix.length();i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                // 0-9
                String s = ""+ch;
                val.push(s);
            }
            else if (op.size()==0 || ch =='(' || op.peek() == '(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.pop(); // '(' is removed
            }
            else{
                if(ch=='+' || ch=='-'){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                    // push
                    op.push(ch);
                }if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        // Work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
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
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);
        }
        System.out.println("\nPrefix expression is  : "+val.peek());
    }
}
