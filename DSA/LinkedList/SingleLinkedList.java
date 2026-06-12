package LinkedList;

// Definition of a Singly Linked List Node
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

// Singly Linked List Implementation
class SLL {
    Node head;
    Node tail;
    int size;

    // Traverses and prints list elements sequentially
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Appends a new node at the end of the list (O(1) time complexity)
    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (size == 0) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    // Prepends a new node at the start of the list (O(1) time complexity)
    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (size == 0) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    // Inserts a node at a specific index positional assignment
    void insertAt(int idx, int val) {
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            insertAtTail(val);
            return;
        }
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for (int i = 0; i < idx - 1; i++) {
            x = x.next;
        }
        Node y = x.next;
        x.next = temp;
        temp.next = y;
        size++;
    }

    // Removes the first node from the list
    void deleteAtHead() throws Error {
        if (head == null) throw new Error("Empty List");
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
    }

    // Removes the last node by iterating to find the second-to-last node (O(N) time complexity)
    void deleteAtTail() throws Error {
        if (head == null) throw new Error("Empty List");
        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        size--;
    }
}

// Execution class containing the main driver program
public class SingleLinkedList {

    // Prints a manual node sequence from a given start node
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
//    public static void reverseList(Node head) {
//        // M-1 using recurssion
//        if (head == null || head.next == null) return head;
//        Node a = head.next;
//        Node newHead = reverseList(a);
//        a.next = head;
//        head.next = null;
//    }

    // Uses the call stack to print the node elements in reverse order
    public static void printReverse(Node head) {
        if (head == null) return;
        printReverse(head.next);
        System.out.print(head.val + " ");
    }

    public static void display(Node node) {
        print(node);
    }

    public static void main(String[] args) {
        // Section 1: Manual Node Manipulation
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;

        print(a);
        printReverse(a);
        System.out.println();
        display(a);

        // Section 2: Object-Oriented List Class Operations
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();

        list.insertAtTail(40);
        list.display();

        System.out.println("Size of Linked List : " + list.size);
        list.insertAtHead(90);
        list.insertAtHead(100);
        list.display();

        list.insertAt(1, 500);
        list.display();

    }
}
