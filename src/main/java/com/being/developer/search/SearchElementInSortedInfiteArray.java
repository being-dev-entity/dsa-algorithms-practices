package com.being.developer.search;

public class SearchElementInSortedInfiteArray {
    public static void main(String[] args) {
        System.out.println("Search an element in sorted infinite array.");
        int array[] = { 1, 3, 7, 8, 12, 58, 72, 87, 92 };

        for (int i : array) {
            System.out.print(" " + i);
        }
        int key = 58;
        int index = searchElement(array, key);
        System.out.println("\nSearch Index for " + key + " is: " + index);
    }

    private static int searchElement(int[] array, int key) {
        int low = 0;
        int high = 1;
        while (key > array[high]) {
            low = high;
            high = high * 2;
        }
        // same logic like binary search.
        return binarySearch(array, key, low, high);
    }

    private static int binarySearch(int[] array, int key, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (key == array[mid]) {
                return mid;
            }
            if (key < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
