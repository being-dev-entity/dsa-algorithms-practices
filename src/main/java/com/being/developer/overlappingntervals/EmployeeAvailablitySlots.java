package com.being.developer.overlappingntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
Problem: Employee Free Time
You're given a employees' schedules.
Each employee has a list of overlapping working time intervals sorted by start time.
Your task is to find free time intervals of employees.
*/
public class EmployeeAvailablitySlots {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        Stream.of(intervals).forEach(a -> System.out.print(Arrays.toString(a)));
        List<int[]> availablity = findAvaialblitySlots(intervals);
        System.out.println("\n");
        availablity.forEach(a -> System.out.print(Arrays.toString(a)));
       // output: [6, 8][10, 15]
    }

    private static List<int[]> findAvaialblitySlots(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> mergedIntervals = Arrays.asList(intervals);
        List<int[]> availablity = new ArrayList<>();
        int prevEnd = mergedIntervals.get(0)[1];
        for (int i = 1; i < mergedIntervals.size(); i++) {
            int currentStart = mergedIntervals.get(i)[0];
            int currentEnd = mergedIntervals.get(i)[1];
            if (currentStart > prevEnd) {
                // means last meeting ending before current meeting
                availablity.add(new int[] { prevEnd, currentStart });
            }
            // Update previous end time
            prevEnd = Math.max(prevEnd, currentEnd);
        }

        return availablity;
    }
}
