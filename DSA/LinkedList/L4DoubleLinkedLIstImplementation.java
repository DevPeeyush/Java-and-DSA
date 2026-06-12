package LinkedList;

import org.w3c.dom.Node;

class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val = val;
    }
}
class DLL{
    dNode head;
    dNode tail;
    int size;
    void display(){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtTail(int val){
        dNode temp  = new dNode(val);
        if(size==0) head  = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        dNode temp  = new dNode(val);
        if(size==0) head  = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insertAt(int idx, int val){
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size){
            insertAtTail(val);
            return;
        }
        if(idx <0 || idx > size){
            System.out.println("Invalid index");
        }
        dNode temp  = new dNode(val);
        dNode x = head;
        for (int i = 0; i < idx-1; i++) {
            x = x.next;
        }
        dNode y = x.next;
        x.next = temp; temp.prev = x;
        y.prev = temp; temp.next = y;
        size++;

    }
    void deleteAtTail(int val) throws  Error{
        if(head==null) throw new Error("Empty List");
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteAtHead(int val) throws  Error{
        if(head==null) throw new Error("Empty List");
        head = head.next;
        head.prev = null;
        size--;
    }
}
public class L4DoubleLinkedLIstImplementation {
    public static void print(dNode head){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printReverse(dNode tail){
        dNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display(dNode node){
        dNode temp = node;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        // ow temp is at head
        print(temp);
    }
    public static void main(String[] args) {
        dNode a = new dNode(10);
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        dNode d = new dNode(40);
        a.next = b;  b.prev = a;
        b.next = c;  c.prev = b;
        c.next = d;  d.prev = c;
        print(a);
        printReverse(d);
        display(a);
        DLL list = new DLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        System.out.println("Size of Double Linked List : "+list.size);
        list.insertAtHead(90);
        list.insertAtHead(100);
        list.display();
        list.insertAt(1,500);
        list.display();

    }
}
