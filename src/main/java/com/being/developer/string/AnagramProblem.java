package com.being.developer.string;

public class AnagramProblem {
    public static void main(String[] args) {
        System.out.println("Angram String ");
        String first = "not";
        String second = "ton";
        System.out.println(first + "," + second + " are anagrams: " + isAnagrams(first, second));
    }

    private static boolean isAnagrams(String first, String second) {
        if (first.length() != second.length()) {
            return Boolean.FALSE;
        }
        // can use map, and if we want to use case insensitive then convert char to
        // either upper or lower then find.
        boolean[] chars = new boolean[256];
        for (int i = 0; i < first.length(); i++) {
            int asci = (int) first.charAt(i);
            chars[asci] = Boolean.TRUE;
        }
        for (int i = 0; i < second.length(); i++) {
            int asci = (int) second.charAt(i);
            if (!chars[asci]) {
                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }
}
