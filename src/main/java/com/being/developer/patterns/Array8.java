package com.being.developer.patterns;

import java.util.HashSet;
import java.util.Set;

/**
 * // Longest consecutive sequence in an unsorted array. LC 128
 * Problem statement
 * Given an unsorted array of integers, return the length of the longest run of
 * consecutive integers (they don't need to be adjacent in the array itself).
 * Must run in O(n).
 * 
 * Example
 * Input: nums = [100, 4, 200, 1, 3, 2]
 * Output: 4 (the run 1, 2, 3, 4)
 */
public class Array8 {
    public static void main(String[] args) {
     int num [] = {1001, 4, 200, 101, 33, 12};
     System.out.println(findLongestconsecutiveIntegers(num));
    }

    static int findLongestconsecutiveIntegers(int nums[]) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int longest = 0;
        for (Integer num : set) {
            if (set.contains(num)) {
                int length = 1;
                while (set.contains(num + length)) {
                    length++;
                }
                longest = Math.max(length, longest);
            }

        }

        return longest;
    }
}
