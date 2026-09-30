package com.being.developer.arrays;

/**
 * Problem Statement
 * Find the majority element in an array. A majority element appears more than
 * n/2 times in the array, where n is the array size.
 * 
 * The algorithm works in two phases:
 * 
 * Finding a Candidate
 * 
 * Initialize first element as candidate and count = 1
 * For each element in array:
 * If count becomes 0, make current element as candidate
 * If current element matches candidate, increment count
 * If different, decrement count
 * Verification
 * 
 * Count frequency of candidate element
 * If frequency > n/2, it's the majority element
 * Otherwise, no majority element exists
 * Time & Space Complexity
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MooreVotingExample {
    public static void main(String[] args) {
        System.out.println("Find majority element in the Array example!");
        // int array[] = { 1, 1, 2, 3, 1,6,6,7,6,6,6,6 }; ans is 6
        int array[] = { 1, 1, 2, 3, 1 }; // ans is 1
        int result = findMajorityElement(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\nMajority Number is: " + result);
    }

    private static int findMajorityElement(int array[]) {
        int answerIndex = 0;
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            int a = array[i];
            int b = array[answerIndex];
            if (array[i] == array[answerIndex]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                answerIndex = i;
                count = 1;
            }
        }
        int frequency = findFrequency(array[answerIndex], array);
        if (frequency >= array.length / 2) {
            return array[answerIndex];
        }

        return 0;
    }

    private static int findFrequency(int number, int array[]) {
        int frequency = 0;
        for (int element : array) {
            if (number == element) {
                frequency++;
            }
        }

        return frequency;
    }

}
