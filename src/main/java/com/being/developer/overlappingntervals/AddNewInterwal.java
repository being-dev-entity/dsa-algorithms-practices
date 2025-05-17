package com.being.developer.overlappingntervals;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a list of non-overlapping intervals, sorted by their start
 * time. Each interval is represented as a pair [start, end].
 * Your task is to insert a new interval into the list and merge overlapping
 * intervals so that the final list remains sorted and non-overlapping.
 * 
 * Insert, Sort, and Merge All Intervals can be
 * Alternative but less optimal approach
 */
public class AddNewInterwal {
    public static void main(String[] args) {
        int[][] intervals1 = { { 1, 3 }, { 6, 9 } };
        int[] newInterval1 = { 2, 5 };

        System.out.print("Merged intervals: ");
        printIntervals(addNewInterval(intervals1, newInterval1)); // Output: [[1, 5], [6, 9]]

        int[][] intervals2 = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
        int[] newInterval2 = { 4, 9 };

        System.out.print("Merged intervals: ");
        printIntervals(addNewInterval(intervals2, newInterval2)); // Output: [[1, 2], [3, 10], [12, 16]]

        int[][] intervals3 = {};
        int[] newInterval3 = { 5, 7 };

        System.out.print("Merged intervals: ");
        printIntervals(addNewInterval(intervals3, newInterval3)); // Output: [[5, 7]]
    }

    static int[][] addNewInterval(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int intervalsLength = intervals.length;
        int i = 0;
        // Step 1: Add all intervals that end before the new interval starts
        while (i < intervalsLength && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Step 2: Merge all overlapping intervals with the new interval
        while (i < intervalsLength && intervals[i][0] < newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        result.add(newInterval);

        // Step 3: Add remaining intervals
        while (i < intervalsLength) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }

    private static void printIntervals(int[][] intervals) {
        for (int[] interval : intervals) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
        System.out.println();
    }
}
