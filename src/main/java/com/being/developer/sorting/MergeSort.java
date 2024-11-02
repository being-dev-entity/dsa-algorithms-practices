package com.being.developer.sorting;

public class MergeSort {

    public static void main(String[] args) {

        // int arr[] = { 12, 11, 13, 5, 6, 7 };
        int arr[] = { 8, 2, 5, 3, 4, 7, 6, 1 };
        System.out.println("Given Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        mergeSort(arr);
        System.out.println("\nSorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr) {
        // base case.
        if (arr == null || arr.length <= 1) {
            return;
        }
        // find middle of array to dive it into two parts.
        int middle = arr.length / 2;
        int rightArrayLength = arr.length - middle;
        // copying main array into two sub left sub array.
        int[] leftArray = new int[middle];
        for (int i = 0; i < middle; i++) {
            leftArray[i] = arr[i];
        }
        // copying main array into right sub array.
        int[] rightArray = new int[rightArrayLength];
        for (int i = 0; i < rightArrayLength; i++) {
            // since we have copied left array first, we need to start from middle
            rightArray[i] = arr[i + middle];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, arr);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int i = 0, l = 0, r = 0;
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                l++;
                i++;
            } else {
                array[i] = rightArray[r];
                r++;
                i++;
            }
        }
        // case when left array has some elements remaining which is because right array
        // is exhausted and all element are greater than left and therefore coppied to
        // main array.
        while (l < leftSize) {
            array[i] = leftArray[l];
            l++;
            i++;
        }
        // case when righ array has some elements remaining which is because left array
        // is exhausted and all element are greater than right array and therefore
        // coppied to main array.
        while (r < rightSize) {
            array[i] = rightArray[r];
            r++;
            i++;
        }
    }
}
