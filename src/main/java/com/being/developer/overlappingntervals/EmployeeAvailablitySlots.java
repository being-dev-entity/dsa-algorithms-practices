package com.being.developer.overlappingntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeAvailablitySlots {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        Stream.of(intervals).forEach(a -> System.out.print(Arrays.toString(a)));
        List<int[]> availablity = findAvaialblitySlots(intervals);
        System.out.println("\n");
        availablity.forEach(a -> System.out.print(Arrays.toString(a)));
    }

    private static List<int[]> findAvaialblitySlots(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> mergedIntervals = new ArrayList<>();
        int currentInterval[] = intervals[0];
        mergedIntervals.add(currentInterval);
        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            if (currentEnd > nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }
        }
        System.out.println("\n");
        mergedIntervals.forEach(a -> System.out.print(Arrays.toString(a)));
        List<int[]> availablity = new ArrayList<>();
        int freeSlotStart = 0;
        int freeSlotEnd = 0;
        for (int i = 1; i < mergedIntervals.size(); i++) {
            freeSlotStart = mergedIntervals.get(i - 1)[1]; // end time of first meeting
            freeSlotEnd = mergedIntervals.get(i)[0]; // start time of second meeting.
            availablity.add(new int[] { freeSlotStart, freeSlotEnd });
        }

        return availablity;

    }
}
