package com.being.developer.overlappingntervals;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Problem: Meeting Room Finder (a.k.a. Minimum Number of Meeting Rooms)
 * Statement:
 * You are given an array of meeting time intervals with start and end times.
 * Your goal is to find the minimum number of meeting rooms required so that no
 * meetings overlap.
 */
public class MinimumMeetingRoom {
    public static void main(String[] args) {
        int[][] meetings = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
        System.out.println(meetings);
        System.out.println("Meeting room required:" + minMeetingRoomRequired(meetings));
        // Output: 2
    }

    private static int minMeetingRoomRequired(int[][] meetings) {
        if (meetings.length == 0)
            return 0;
        // Step 1: Sort meetings by start time
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        // Step 2: Use a min-heap to keep track of end times
        PriorityQueue<Integer> roomQueue = new PriorityQueue<>();
        // Step 3: Add the end time of the first meeting
        roomQueue.add(meetings[0][1]);
        for (int i = 1; i < meetings.length; i++) {
            int currentStart = meetings[i][0];
            int currentEnd = meetings[i][1];
            // If current meeting can reuse a room (meeting ended before current starts)
            if (roomQueue.peek() <= currentStart) {
                roomQueue.poll();
            }
            // Add current meeting's end time to heap
            roomQueue.add(currentEnd);

        }

        return roomQueue.size();
    }
}
