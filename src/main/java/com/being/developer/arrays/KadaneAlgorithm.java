package com.being.developer.arrays;

public class KadaneAlgorithm {

    public static void main(String[] args) {
        System.out.println("Find Max sum subArray from the given Array example!");
        int array[] = { 5, -4, -2, 6, 1 };
        int result = findMaxSumSubArray(array);
        for (int i : array) {
            System.out.print(" " + i);
        }
        System.out.println("\nMax Sum: " + result);
    }

    // Optimized O(n2) -> O(n)
    private static int findMaxSumSubArray(int array[]) {
        int maxSum = 0;
        int currentSum = 0;

        for (int i = 1; i < array.length; i++) {
            currentSum = currentSum + array[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
