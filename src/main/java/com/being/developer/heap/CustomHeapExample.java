package com.being.developer.heap;

public class CustomHeapExample {
    public static void main(String[] args) {
        System.out.println("Custom heap example!");

        CustomHeap heap = new CustomHeap(5);
        
        heap.insert(20);
        heap.insert(12);
        heap.insert(23);
        heap.insert(16);
        heap.insert(5);

        heap.print();

        heap.remove();
        System.out.println("\nAfter remove call.");
        
        heap.print();
    }
}

class CustomHeap {
    private int size;
    private int capacity;
    private int heap[];

    public CustomHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
    }

    public void insert(int element) {
        if (size >= capacity) {
            throw new IllegalArgumentException("Heap Capacity full.");
        }
        heap[size] = element;
        int current = size;

        while (current != 0 && heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }

    public int remove() {
        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return root;
    }

    private void heapify(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (index != largest) {
            swap(index, largest);
            heapify(largest);
        }
    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    private static int parent(int index) {
        return (index - 1 / 2) - 1;
    }

    private static int leftChild(int index) {
        return 2 * index;
    }

    private static int rightChild(int index) {
        return (2 * index) + 1;
    }

    public void print() {
        for (int element : heap) {
            System.out.print(element + " ");
        }
    }
}
