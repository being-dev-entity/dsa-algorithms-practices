package com.being.developer.arrays;

/**
 * Container With Most Water: Given an array where each element represents the
 * height of a line, find the two lines that, together with the x-axis, form a
 * container that holds the most water. Two pointers start at both ends of the
 * array and move towards each other to find the maximum area.
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println("Container with most water problem solution example usnig two pointer.");
        // int array[] = { 3, 6, 12, 16, 14, 10 };
        int array[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int result = maxArea(array);
        System.out.println("Max Area Found: " + result);
    }

    private static int maxArea(int hegiht[]) {
        int maxArea = 0;
        int left = 0;
        int right = hegiht.length - 1;

        while (left < right) {
            int minHeight = Math.min(hegiht[left], hegiht[right]);
            int width = right - left;
            int currentArea = minHeight * width;
            maxArea = Math.max(maxArea, currentArea);
            if (hegiht[left] < hegiht[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
