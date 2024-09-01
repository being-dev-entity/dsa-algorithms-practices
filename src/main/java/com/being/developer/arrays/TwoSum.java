package com.being.developer.arrays;

// This uses two pointers to solve problem so that can do in SPACE Compleexity (1) and Time complexity O(n)
// Precondition: input array will be sorted always:
public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Two Sum Problem Example!");
        int array[] = { 3, 3, 4, 5, 8, 11, 14, 17, 20 };

        int index[] = findTwoSumIndex(array, 9);

        System.out.println(index[0] + "," + index[1]);
    }

    public static int[] findTwoSumIndex(int[] array, int pairSum) {
        int left = 0;
        int right = array.length - 1;
        int index[] = new int[2];
        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == pairSum) {
                index[0] = left;
                index[1] = right;
                break;
            } else if (sum < pairSum) {
                left++;
            } else {
                right--;
            }
        }
        return index;
    }
}
