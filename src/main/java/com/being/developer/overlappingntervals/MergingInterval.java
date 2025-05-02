package com.being.developer.overlappingntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergingInterval {
    public static void main(String args[]) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        System.out.println(Arrays.toString(intervals));
        int[][] merged = mergeIntervals(intervals);
        System.out.println(Arrays.toString(merged));
    }

    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 1) {
            return intervals;
        }
        // sort all interval by their start time.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();

        // Step 2: Initialize with the first interval
        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        // Step 3: Go through remaining intervals
        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap, move to next
                currentInterval = interval;
                result.add(currentInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
