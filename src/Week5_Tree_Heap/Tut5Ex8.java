package Week5_Tree_Heap;

public class Tut5Ex8 {
    public static void main(String[] args) {
        Heap heap = new Heap(15);

        heap.enqueue(10);
        heap.enqueue(12);
        heap.enqueue(1);
        heap.enqueue(14);
        heap.enqueue(6);
        heap.enqueue(5);
        heap.enqueue(8);
        heap.enqueue(15);
        heap.enqueue(3);
        heap.enqueue(9);
        heap.enqueue(7);
        heap.enqueue(4);
        heap.enqueue(11);
        heap.enqueue(13);
        heap.enqueue(2);

        heap.printHeap();
    }


}
