package com.being.developer.search;

public class BinarySearch {

    public static void main(String args[]) {
        int[] array = { 3, 5, 8, 11, 21, 33, 44 };

        int index = binarySearch(array, 5);
        System.out.println(index);

    }

    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = low + high / 2;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
