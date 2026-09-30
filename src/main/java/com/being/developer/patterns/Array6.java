package com.being.developer.patterns;

/**
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 * 
 * Example 1:
 * 
 * Input: nums = [2,2,1]
 * 
 * Output: 1
 * 
 * Example 2:
 * 
 * Input: nums = [4,1,2,1,2]
 * 
 * Output: 4
 * Array6
 */
public class Array6 {
    public static void main(String[] args) {
        int numbers1[] = { 2, 2, 1 };
        System.out.println(findSingleOne(numbers1));
        int numbers2[] = { 4, 1, 2, 1, 2 };
        System.out.println(findSingleOne(numbers2));
    }

    static int findSingleOne(int[] array) {
         if (array == null ) {
           return 0;
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result ^= array[i];
        }

        return result;
    }

}
