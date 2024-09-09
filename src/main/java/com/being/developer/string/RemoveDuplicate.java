package com.being.developer.string;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println("Remove duplicate from String example!");
        String input = "Ramayan";
        System.out.println(input + " Remove duplicate char:  " + revmoveDuplicateChars(input));
    }

    private static String revmoveDuplicateChars(String input) {
        char chars[] = new char[input.length()];
        // can also use map of char key
        boolean seen[] = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int asci = (int) ch;
            if (!seen[asci]) {
                seen[asci] = true;
                chars[i] = ch;
            }
        }

        return new String(chars);
    }
}
