package com.being.developer.patterns;
/**
 * Move all zeroes to the end, preserving relative order. LC-283
Problem statement
Given an integer array, move all 0's to the end while preserving the relative order of the non-zero elements — in place, without allocating a copy.

Example
Input: nums = [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]
Constraints
1 ≤ nums.length ≤ 104
 */
public class Array7 {
    public static void main(String[] args) {
        
    }

    static void moveZeros(int nums[]){
        int j=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=0){
             nums[j] = nums[i];
             j++;
            }
        }
        for(int i = j; i<nums.length;i++){
            nums[j]=0;
        }
    }
}
