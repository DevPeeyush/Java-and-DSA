package Stack;

public class L5ArrayImplementation {

    public static class Stack {

        private int[] arr = new int[10];
        private int idx = 0;

        // Push
        void push(int x) {
            if(isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        // Peek
        int peek() {
            if(isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }
            return arr[idx - 1];
        }

        // Pop
        int pop() {
            if(idx == 0){
                System.out.println("Empty stack");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        // Display
        void display() {

            for(int i = 0; i < idx; i++){
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }

        // Size
        int size() {
            return idx;
        }

        // Empty
        boolean isEmpty() {
            if(size() == 0){
                return true;
            }else {
                return false;
            }
        }

        // stack is full (over flow)
        boolean isFull() {
            if(size() == arr.length){
                return true;
            }
            return false;
        }


    }

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(1);
        st.display();
        System.out.println("Size = " + st.size());

        st.push(2);
        st.push(3);
        st.push(4);
        st.display();

        System.out.println("Top = " + st.peek());
        System.out.println("Popped = " + st.pop());
        st.display();

        System.out.println("Size = " + st.size());
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        System.out.println("Stack is empty : "+st.isEmpty());
        st.display();
    }
}