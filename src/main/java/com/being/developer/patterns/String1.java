package com.being.developer.patterns;

// Reverse a string in place.
public class String1 {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverse(str));
        System.out.println(reverseV2(str));

    }

    static String reverse(String str) {
        if (str == null) {
            return str;
        }
        char chars[] = new char[str.length()];
        int j = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            chars[j] = str.charAt(i);
            j++;
        }
        return new String(chars);
    }

    static String reverseV2(String str) {
        if (str == null) {
            return str;
        }
        char[] chars = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
       return new String(chars);
    }
}
