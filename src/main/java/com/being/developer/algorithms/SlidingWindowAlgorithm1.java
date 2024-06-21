package com.being.developer.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Program uses dyamic size of sliding window to solve the problem of
 * Longest Substring Without Repeating.
 * for example, the longest substring without repeating characters for
 * "abcabcbb" is "abc", which the length is 3.
 */
public class SlidingWindowAlgorithm1 {
    public static void main(String[] args) {
        String s = "abcabcbbd";
        int length = findLengthOfLongestSubstring(s);
        System.out.println(String.format("Length of longest substring without repeating characters: %d", length));
        System.out.println(length);
    }

    public static int findLengthOfLongestSubstring(String input) {
        if (input == null || input.length() == 0) {
            return 0;
        }
        Set<Character> visitedChars = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < input.length(); right++) {
            // If the character is already in the set, remove characters from the left until
            // it's removed
            final Character currentChar = input.charAt(right);
            while (visitedChars.contains(currentChar)) {
                visitedChars.remove(input.charAt(left));
                left++;
            }
            // Add the current character to the set
            visitedChars.add(currentChar);
            // Update the maximum length
            maxLength = Math.max(maxLength, (right - left) + 1);
        }

        return maxLength;
    }
}
