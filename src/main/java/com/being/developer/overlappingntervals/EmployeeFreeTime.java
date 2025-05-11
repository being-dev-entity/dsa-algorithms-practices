package com.being.developer.overlappingntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Problem: Employee Free Time
You're given a list of employees' schedules.
Each employee has a list of non-overlapping working time intervals sorted by start time.
Your task is to find all common free time intervals across all employees.
*/
public class EmployeeFreeTime {
    public static void main(String[] args) {
        List<List<Interval>> schedule = new ArrayList<>();
        schedule.add(Arrays.asList(new Interval(1, 3), new Interval(6, 7)));
        schedule.add(Arrays.asList(new Interval(2, 4)));
        schedule.add(Arrays.asList(new Interval(5, 6), new Interval(7, 9)));
        List<Interval> freeIntervals = findfreeTimeSchedule(schedule);
        System.out.println("Employee free time intervals: " + freeIntervals);
        // output: [[4,5]]
    }

    public static List<Interval> findfreeTimeSchedule(List<List<Interval>> schedule) {
        // collect all interval in one all list.
        List<Interval> allIntervals = new ArrayList<>();
        for (List<Interval> interval : schedule) {
            allIntervals.addAll(interval);
        }
        // sort all intervals by their start time asceding order.
        Collections.sort(allIntervals, (a, b) -> Integer.compare(a.start(), b.start()));

        // Now find free time among all.
        List<Interval> freeIntervals = new ArrayList<>();
        int prevEnd = allIntervals.get(0).end();
        for (int i = 1; i < allIntervals.size(); i++) {
            Interval current = allIntervals.get(i);
            if (current.start() > prevEnd) {
                // found free time.
                freeIntervals.add(new Interval(prevEnd, current.start()));
            }
            // Update previous end time
            prevEnd = Math.max(prevEnd, current.end());
        }

        return freeIntervals;
    }
}

record Interval(int start, int end) {

    public String toString() {
        return "[" + start + ", " + end + "]";
    }
}
