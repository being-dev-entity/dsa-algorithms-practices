package com.being.developer.patterns;
// Find the largest element in an array.

import java.util.stream.Stream;

public class Array1 {
    public static void main(String[] args) {
        Integer arr[] = { 3, 45, 2, 4, 33, 11, 43 };
        System.out.println(findTheLargestElement(arr));
        System.out.println(findTheLargestElementV2(arr));
    }

    private static int findTheLargestElement(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        return Stream.of(arr).max((e1, e2) -> e1.compareTo(e2)).get();
    }

    private static int findTheLargestElementV2(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max = 0;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
