package com.being.developer.string;

public class StringUpperCaseExample {
    public static void main(String[] args) {
        System.out.println("String upper case example!");
        String input = "Rama";
        System.out.println(input + " To Upper case: " + toUpperCase(input));
        input = "Abc123We";
        System.out.println(input + " To Upper case: " + toUpperCase(input));
    }

    private static String toUpperCase(String input) {
        char[] chars = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            int asci = (int) input.charAt(i);
            if (asci >= 97 && asci <= 120) {
                int asciD = asci - 97;
                chars[i] = (char) (65 + asciD);
            } else {
                chars[i] = input.charAt(i);
            }
        }

        return new String(chars);
    }
}
