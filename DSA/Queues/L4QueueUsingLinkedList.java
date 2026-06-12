package DSA.Queues;

public class L4QueueUsingLinkedList {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class queueLL {
        Node head;
        Node tail;
        int size = 0;

        public void add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty!!");
            }
            return head.val;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty!!");
            }
            int temp = head.val;
            head = head.next;
            size--;
            return temp;
        }
        public boolean isEmpty() {
            if (size == 0) return true;
            return false;
        }
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Queue is : ");
        q.display();

        q.remove();
        q.remove();

        System.out.println("Queue is : ");
        q.display();

        System.out.println("Element at top is : "+ q.peek());
        System.out.println("Size of queue is : "+q.size);
    }
}
