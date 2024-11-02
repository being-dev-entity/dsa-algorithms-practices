package com.being.developer.string;

// check if String is palindrome or not!=.
public class PalindromeProblem {

    public static void main(String[] args) {
        System.out.println("Palindrome String example!");
        String input = "malayalam";
        System.out.println(input + " Is Palindrome: " + isPalindrome(input));
        input = "ramayan";
        System.out.println(input + " Is Palindrome: " + isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }
}
