package com.being.developer.heap;

import java.util.*;

public class FindKthHighestElement {
    public static void main(String[] args) {
        System.out.println("find the kth Largest element!");
        int[] array = { 4, 44, 23, 66, 54, 122 };
        int number = findKthHighestElement(array, 3);
        System.out.println("Kth: " + number);
    }

    private static int findKthHighestElement(int array[], int kth) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (int num : array) {
            minHeap.offer(num);
            if (minHeap.size() > kth) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
