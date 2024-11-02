package com.being.developer.stack;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class FindNextHighestTemp {
    public static void main(String[] args) {
        int[] temperature = { 73, 74, 75, 71, 69, 72, 76, 73 };
        Integer[] maxTempDays = maxTempDays(temperature);
        for (Integer integer : maxTempDays) {
            System.out.print(integer + ",");
        }
        // output ,1,1,4,2,1,0,0
    }

    // method will return 0 if no other days found max temp.
    public static Integer[] maxTempDays(int[] temperature) {
        Stack<Pair> stack = new Stack<>();
        List<Integer> nearestRightGreaterPostions = new ArrayList<>();
        for (int i = temperature.length - 1; i >= 0; i--) {

            if (stack.empty()) {
                nearestRightGreaterPostions.add(-1);
            } else if (stack.peek().temperature > temperature[i]) {
                nearestRightGreaterPostions.add(stack.peek().index); // here calculated days.
            } else {

                while (!stack.isEmpty() && stack.peek().temperature <= temperature[i]) {
                    stack.pop();
                }
                if (stack.empty()) {
                    nearestRightGreaterPostions.add(-1);
                } else {
                    nearestRightGreaterPostions.add(stack.peek().index);
                }
            }
            stack.push(new Pair(i, temperature[i]));
        }
        Collections.reverse(nearestRightGreaterPostions);

        // calculate days gap using nearest greater right position.
        Integer days[] = new Integer[temperature.length];
        for (int i = 0; i < nearestRightGreaterPostions.size(); i++) {
            if (nearestRightGreaterPostions.get(i) == -1) {
                days[i] = 0;
            } else {
                days[i] = nearestRightGreaterPostions.get(i) - i;
            }
        }
        return days;
    }
}

class Pair {
    public int index;
    public int temperature;

    public Pair(int index, int temperature) {
        this.index = index;
        this.temperature = temperature;
    }
}
