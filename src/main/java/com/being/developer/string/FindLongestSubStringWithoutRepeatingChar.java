package com.being.developer.string;

import java.util.Set;
import java.util.HashSet;

public class FindLongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
        System.out.println("Find longest sbustring without repeating char example!");
        String input = "abcabcbbd"; // abcs
        String ouString = findLongestSubString(input);
        System.out.println(ouString);
    }

    private static String findLongestSubString(String input) {
        String longestSubString = null;
        Set<Character> visitedCharacters = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < input.length(); right++) {
            Character currentChar = input.charAt(right);

            while (visitedCharacters.contains(currentChar)) {
                visitedCharacters.remove(input.charAt(left));
                left++;
            }

            visitedCharacters.add(currentChar);
            // need to plus one for right since it start with 0;
            if ((right - left) + 1 > maxLength) {
                longestSubString = input.substring(left, right + 1);
            }
            maxLength = Math.max(maxLength, (right - left) + 1);

        }
        System.out.println(maxLength);
        return longestSubString;
    }

    private static String findLongestSubStringV1(String input) {
        String longestSubString = null;
        Set<Character> visitedCharacters = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;
        while (right < input.length()) {
            if (!visitedCharacters.contains(input.charAt(right))) {
                visitedCharacters.add(input.charAt(right));
                right++;

                if (right - left > maxLength) {
                    maxLength = right - left;
                    longestSubString = input.substring(left, right);
                }

            } else {
                visitedCharacters.remove(input.charAt(left));
                left++;
            }

        }
        System.out.println(maxLength);
        return longestSubString;
    }
}
