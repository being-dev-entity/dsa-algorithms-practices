package com.being.developer.algorithms;

/*
 * This program uses sliding window algorithm to find the maximum sum of subArray of size k.
 *  for example when given array is {8, 2, 5, 3, 4, 7, 6, 1} and k=3, then the output should be 17.
 */
class SlidingWindowAlgorithm2 {
    public static void main(String[] args) {
        int arr[] = { 8, 2, 5, 3, 4, 7, 6, 1 };
        System.out.println("Given Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int maxSum = findMaxSum(arr, 3);
        System.out.print("\nMax Sum of subArray:" + maxSum);
    }

    public static int findMaxSum(int[] array, int k) {
        if (array == null || array.length < k) {
            System.out.println("Invalid input");
            return -1;
        }
        int maxSum = 0;
        int windowSum = 0;
        // calculating the sum of first k elements means first window.
        for (int i = 0; i < k; i++) {
            windowSum += array[i];
        }
        maxSum = windowSum;
        for (int i = k; i < array.length; i++) {
            // Here we are adding the next element and removing the first element of the
            // window
            windowSum = windowSum + array[i] - array[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}