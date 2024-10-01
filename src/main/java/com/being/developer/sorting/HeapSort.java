package com.being.developer.sorting;

public class HeapSort {
    public static void main(String[] args) {
        System.out.println("Heap Sort example!");
        int array[] = { 10, 30, 50, 20, 35, 15 };

        heapSort(array);

        System.out.println("\nSorted array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    private static void heapSort(int array[]) {
        int size = array.length - 1;
        for (int i = size / 2; i >= 0; i--) {
            heapyfy(array, size, i);
        }
    }

    private static void heapyfy(int array[], int n, int i) {
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;

        if (left <= n && array[left] > array[largest]) {
            largest = left;
        }
        if (right <= n && array[right] > array[largest]) {
            largest = right;
        }
        if (i != largest) {
            // since we find largest postion then swap value at given positions,
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            // call recurisive
            heapyfy(array, n, i);
        }
    }

}
