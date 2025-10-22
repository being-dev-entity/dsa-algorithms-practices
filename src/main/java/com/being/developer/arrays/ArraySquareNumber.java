package com.being.developer.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array
 * of the squares of each number sorted in non-decreasing order.
 * For example, if the input is [-4, -1, 0, 3, 10], the output should be [0, 1, 9, 16, 100].
 */
public class ArraySquareNumber {
    public static void main(String[] args) {
        System.out.println("Two Sum Problem Example!");
        int array[] = { -4, -1, 0, 3, 10 };

        int result [] = squareSortedArray(array);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int [] squareSortedArray(int input[]) {
        List<Integer> squareSortedArray = new ArrayList<>();
        int left = 0;
        int right = input.length - 1;
        int i = 0;
        while (left <= right) {
            if (Math.abs(input[left]) > Math.abs(input[right])) {
                squareSortedArray.add(input[left] * input[left]);
                left++;
            } else {
                squareSortedArray.add(input[right] * input[right]);
                right--;
            }
            i++;
        }
       Collections.reverse(squareSortedArray);
       // Convert List<Integer> to primitive int[]
       int[] result = new int[input.length];
       for (int idx = 0; idx < squareSortedArray.size(); idx++) {
           result[idx] = squareSortedArray.get(idx);
       }
       return result;
    }
}
