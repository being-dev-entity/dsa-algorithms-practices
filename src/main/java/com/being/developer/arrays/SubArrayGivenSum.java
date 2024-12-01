package com.being.developer.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArrayGivenSum {
    public static void main(String[] args) {
        System.out.println("Example of SubArray for given SUM!");
        int array[] = { 10, 15, -5, 15, -10, 5 };  
        for (int i : array) {
            System.out.println(" " + i);
        }
        int sum = 5;
        int result[] = findSubArrayOfGivenSum(array, sum);
        System.out.println("\nSub array of sum: " + sum);
        for (int i : result) {
            System.out.println(" " + i);
        }
    }

    static int[] findSubArrayOfGivenSum(int array[], int sum) {
        int subArrayStartIndex = 0;
        int subArrayEndIndex = -1;
        int currentSum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];
            if (currentSum == sum) {
                subArrayStartIndex = 0;
                subArrayEndIndex = i;
                break;
            }
            if (map.containsKey(currentSum-sum)) {
                subArrayStartIndex = map.get(currentSum-sum) + 1;
                subArrayEndIndex = i;
                break;
            }
            map.put(currentSum, i);
        }
        System.out.println("Start: "+subArrayStartIndex+" End: "+subArrayEndIndex);
        if (subArrayEndIndex == -1) {
            return new int[0];
        }
        return Arrays.copyOfRange(array, subArrayStartIndex, subArrayEndIndex+1);
    }

}
