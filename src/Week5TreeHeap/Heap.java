package Week5TreeHeap;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Heap {
    private static final int d = 2;
    private int size;
    private int[] heap;

    // CONSTRUCTOR
    public Heap(int size) {
        this.size = 0;
        heap = new int[size + 1];
        Arrays.fill(heap, -1);
    }

    // METHODS

    // Status
    public boolean isFull() { return size == heap.length; }

    // Print heap
    public void printHeap() {
        System.out.print("Heap = ");
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    // Get children and parent
    private int left(int i) {
        return d*i + 1;
    }

    private int right(int i) {
        return d*i + 2;
    }

    private int parent(int i) {
        return (i - 1)/d;
    }

    // Insert element
    public void enqueue(int x) {
//        if (isFull())
//            throw new NoSuchElementException("Overflow Exception");
        if (!isFull()) {
            size ++;
            heap[size - 1] = x;
            heapifyUp(size - 1);
        }
    }

    private void heapifyUp(int index) {
        int tmp = heap[index];
        while (index > 0 && tmp < heap[parent(index)]) {
            heap[index] = heap[parent(index)];
            index = parent(index);
        }
        heap[index] = tmp;
    }
}
