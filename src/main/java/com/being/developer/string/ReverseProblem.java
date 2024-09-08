package com.being.developer.string;

public class ReverseProblem {
    public static void main(String[] args) {
        System.out.println("String Reverse Example!");
        String input = "Ramayan";
        String output = reverseOptimized(input);
        System.out.println(input + " Reverse: " + output);

    }

    private static String reverse(String input) {
        String output = null;
        char[] chars = new char[input.length()];
        for (int i = input.length() - 1; i >= 0; i--) {
            chars[input.length() - 1 - i] = input.charAt(i);
        }
        output = new String(chars);
        return output;
    }
    // kind of two pointer,
    private static String reverseOptimized(String input) {
        String output = null;
        char[] chars = new char[input.length()];
        int mid = input.length() / 2; // 3
        for (int i = mid; i >= 0; i--) {
            chars[input.length() - 1 - i] = input.charAt(i); // 3&3, 4&2, 5&1, 6&0;
            chars[i] = input.charAt(input.length() - 1 - i); // 3&3, 2&4, 1&5, 0&6;
        }
        output = new String(chars);
        return output;
    }

}