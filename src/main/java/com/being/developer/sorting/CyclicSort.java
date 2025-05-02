package com.being.developer.sorting;

// Cyclic sort works when all number ranges in the array lengh 1 to n where n is length;
public class CyclicSort {
    public static void main(String[] args) {
        System.out.println("Cylic sort example..");
        int array[] = { 2, 1, 3, 6, 4, 5 };

        for (int num : array) {
            System.out.print(num + ", ");
        }

        sort(array);

        System.out.println("\nAfter cyclic sort");
        for (int num : array) {
            System.out.print(num + ", ");
        }

    }

    public static void sort(int[] array) {
        int i = 0;
        while (i < array.length) {
            int currectIndex = array[i] - 1;
            if (array[i] != array[currectIndex]) {
                swap(array, i, currectIndex);
            } else {
                i++;
            }
        }
    }

    private static void swap(int array[], int i, int currectIndex) {
        int temp = array[i]; // this number should be at currectIndex
        array[i] = array[currectIndex];
        array[currectIndex] = temp;
    }
}
