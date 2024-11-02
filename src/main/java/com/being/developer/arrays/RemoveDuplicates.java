package com.being.developer.arrays;

/**
 * Remove Duplicates from Sorted Array: Remove duplicates in-place from a sorted
 * array and return the length of the modified array. One pointer traverses the
 * array while the other tracks the index of unique elements.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int array[] = { 2, 4, 4, 7, 8, 11, 11, 12, 19 };
        int index = removeDuplicates(array);

        for (int i : array) {
            System.out.print(" " + i);
        }

        System.out.println("\nAfter Duplicate removal!");

        for (int i = 0; i < index; i++) {
            System.out.print(" " + array[i]);
        }
    }

    private static int removeDuplicates(int array[]) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int uniqueIndexPointer = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[uniqueIndexPointer]) {
                uniqueIndexPointer++;
                array[uniqueIndexPointer] = array[i];
            }
        }

        return uniqueIndexPointer + 1;
    }
}
