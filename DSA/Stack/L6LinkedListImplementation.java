package Stack;

public class L6LinkedListImplementation {

    // Node class
    public static class Node {

        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    // Stack class
    public static class LinkedListStack {

        Node head = null;
        int size = 0;

        // Push operation
        void push(int val){

            Node temp = new Node(val);

            temp.next = head;
            head = temp;

            size++;
        }

        // Pop operation
        int pop(){

            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }

            int x = head.val;

            head = head.next;

            size--;

            return x;
        }

        // Peek operation
        int peek(){

            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }

            return head.val;
        }

        // Display in normal order: 1 2 3 4
        void display(){

            displayHelper(head);

            System.out.println();
        }

        // Recursive helper for display
        void displayHelper(Node temp){

            if(temp == null){
                return;
            }

            displayHelper(temp.next);

            System.out.print(temp.val + " ");
        }

        // Display reverse stack order: 4 3 2 1
        void displayReverse(){

            Node temp = head;

            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }

            System.out.println();
        }

        // Size function
        int size(){
            return size;
        }

        // Check empty
        boolean isEmpty(){

            return size == 0;
        }
    }

    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Display (Bottom to Top):");
        stack.display();

        System.out.println("Display Reverse (Top to Bottom):");
        stack.displayReverse();

        System.out.println("Top Element: " + stack.peek());

        System.out.println("Popped Element: " + stack.pop());

        System.out.println("After Pop:");

        System.out.println("Display:");
        stack.display();

        System.out.println("Display Reverse:");
        stack.displayReverse();
    }
}