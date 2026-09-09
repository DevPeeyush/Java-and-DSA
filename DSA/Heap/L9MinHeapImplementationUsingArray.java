package DSA.Heap;
class MinHeap{
    private int[] arr;
    private int size;
    MinHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add(int ele) throws Exception{
        if(size == arr.length) throw new Exception("Array is full !!! ");
        arr[size] = ele;
        size++;
        upHeapify(size-1);
    }
    public int remove() throws Exception{
        if(size == 0) throw new Exception("Array is empty !!! ");
        int peek = arr[0];
        swap(0,size-1);
        downHeapify(0);
        return peek;
    }
    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void upHeapify(int child){
        if(child==0) return;
        int parent = (child -1)/2;
        if(arr[child] < arr[parent]){
            swap(child,parent);
            upHeapify(parent);
        }
    }
    public void downHeapify(int child){
        int leftChild = 2*child + 1;
        int rightChild = 2*child + 2;
        int minIdx = child;
        if(leftChild >= size && arr[leftChild] < arr[minIdx]) minIdx = leftChild;
        if(rightChild >= size && arr[rightChild] < arr[minIdx]) minIdx = rightChild;
        if(child == minIdx) return;
        swap(minIdx, child);
        downHeapify(minIdx);
    }
    public int peek() throws Exception{
        if(size==0) throw new Exception("Heap is empty !!! ");
        return arr[0];
    }
    public int size(){
        return size;
    }

}
public class L9MinHeapImplementationUsingArray {
    public static void main(String[] args) throws  Exception {
        MinHeap heap = new MinHeap(10);
//        System.out.println(heap.peek()+" "+ heap.size());
        heap.add(1);
        heap.add(2);
        heap.add(-1);
        heap.add(3);
        System.out.println(heap.size());
        heap.add(0);
        System.out.println(heap.peek()+" "+ heap.size());
        heap.add(12);
        System.out.println("Element reomve from the heap : "+heap.remove());
    }
}
