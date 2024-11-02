package com.being.developer.string;

public class FirstNonRepeatingCharProblem {
    public static void main(String[] args) {
        System.out.println("First non repeaating char");
        String input = "abha";
        System.out.println("First non repeating char:" + firstNonRepeatingChar(input));
    }

    // TODO How to do in single for loop.
    private static Character firstNonRepeatingChar(String input) {
        boolean[] nonRepeated = new boolean[256];
        Character firstNonRepeatingChar = null;
        for (int i = 0; i < input.length(); i++) {
            int asci = (int) input.charAt(i);
            if (!nonRepeated[asci]) {
                nonRepeated[asci] = Boolean.TRUE;
            } else {
                nonRepeated[asci] = Boolean.FALSE;
            }
        }

        for (int i = 0; i < input.length(); i++) {
            int asci = (int) input.charAt(i);
            if (nonRepeated[asci]) {
                firstNonRepeatingChar = input.charAt(i);
                return firstNonRepeatingChar;
            }
        }

        return firstNonRepeatingChar;
    }
}
