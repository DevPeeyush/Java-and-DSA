package DSA.Queues;

public class L5CircularQueue {
    public static class cqueue{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is empty!!");
            }else  if(size==0){
                front = rear = 0;
                arr[0] = val;
            } else if (rear<arr.length-1) {
                arr[++rear] = val;
            }else if (rear==arr.length-1) {
                rear = 0;
                arr[0]=val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty!!");
            }else{
                int val = arr[front];
                if(front == arr.length-1){
                    front = 0;
                }else{
                    front++;
                }
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty!!");
            }
            else return arr[front];
        }

        public boolean isEmpty(){
            if(size==0){
                return true;
            }else{
                return false;
            }
        }
        public void display() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty!!");
            }else if(front<=rear){
                for (int i = front; i <= rear ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }else{
                for (int i = front; i < arr.length ; i++) {
                    System.out.print(arr[i]+" ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        cqueue cq = new cqueue();
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        cq.display();
        System.out.println("First element in queue is : "+cq.peek());
        cq.remove();
        cq.remove();
        cq.add(6);
        System.out.println("Queue print like this : ");
        cq.display();

        System.out.println("Array is working like this : ");
        for(int i = 0 ; i<cq.arr.length; i++){
            System.out.print(cq.arr[i]+" ");
        }

    }
}
