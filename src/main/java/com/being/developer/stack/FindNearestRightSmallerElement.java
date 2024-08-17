package com.being.developer.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

// find nearest smaller to right.
public class FindNearestRightSmallerElement {
    public static void main(String[] args) {
        Integer[] array = { 1, 3, 2, 4 };
        for (Integer integer : array) {
            System.out.print(integer + ",");
        }
        System.out.println("\nnearest smaller elements!");
        Integer[] nearestSmaller = findNearestSmaller(array);
        for (Integer integer : nearestSmaller) {
            System.out.print(integer + ",");
        }
        // output -1,2,-1,-1
    }

    public static Integer[] findNearestSmaller(Integer[] array) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for (int i = array.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                list.add(-1);
            } else if (stack.peek() < array[i]) {
                list.add(stack.peek());
            } else {
                while (!stack.isEmpty() && stack.peek() >= array[i]) {
                    stack.pop();
                }
                // could not found any greater element in the stack.
                if (stack.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(stack.peek());
                }
            }
            stack.push(array[i]);
        }
        // need to reverse since we started from right/last scanning.
        Collections.reverse(list);

        return list.toArray(new Integer[array.length]);
    }

}
