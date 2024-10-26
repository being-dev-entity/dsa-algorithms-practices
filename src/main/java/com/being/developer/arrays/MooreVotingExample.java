package com.being.developer.arrays;

public class MooreVotingExample {
    public static void main(String[] args) {
        System.out.println("Find majority element in the Array example!");
        // int array[] = { 1, 1, 2, 3, 1,6,6,7,6,6,6,6 };
        int array[] = { 1, 1, 2, 3, 1 };
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
