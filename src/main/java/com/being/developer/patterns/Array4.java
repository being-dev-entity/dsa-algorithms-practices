package com.being.developer.patterns;

// Check whether an array is sorted.
public class Array4 {
    public static void main(String[] args) {
        int arr1[] = { 3, 45, 2, 4, 33, 11, 43 };
        System.out.println(iArraySorted(arr1));

        int arr2[] = { 1, 2, 2, 4, 7, 11, 43 };
        System.out.println(iArraySorted(arr2));

        int arr3[] = { 12, 9, 18, 5, 3, 2, 1 };
        System.out.println(iArraySorted(arr3));
    }

    static boolean iArraySorted(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int prevRecord = arr[0];
        boolean sorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (prevRecord <= arr[i]) {
                prevRecord = arr[i];
            } else {
                sorted = false;
                break;
            }
        }
        if (!sorted) {
            // reset it to start again check descing sort.
            prevRecord = arr[0];
            sorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (prevRecord >= arr[i]) {
                    prevRecord = arr[i];
                } else {
                    sorted = false;
                    break;
                }
            }
        }
        return sorted;
    }
}
