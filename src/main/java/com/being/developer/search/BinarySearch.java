package com.being.developer.search;

public class BinarySearch {

    public static void main(String args[]) {
       // int[] array = { 3, 5, 8, 11, 21, 33, 44 };
        int array[] = { 1, 3, 7, 8, 12, 58, 72, 87, 92 };
        int index = binarySearch(array, 58);
        System.out.println(index);
    }

    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
