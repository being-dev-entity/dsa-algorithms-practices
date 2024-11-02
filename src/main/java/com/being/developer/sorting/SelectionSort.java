package com.being.developer.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 6, 4, 5, 3, 2, 1 };
        // int arr[] = { 8, 2, 5, 3, 4, 7, 6, 1 };

        System.out.println("Given Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        selectionSort(arr);
        System.out.println("\nSorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int array[]) {

        for (int i = 0; i < array.length; i++) {
            int currentIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[currentIndex]) {
                    currentIndex = j;
                }
            }
            int temp = array[currentIndex];
            array[currentIndex] = array[i];
            array[i] = temp;
        }
    }
}
