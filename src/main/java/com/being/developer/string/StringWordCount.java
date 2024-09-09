package com.being.developer.string;
  // if we want to consider word only seperated by space then
  // can use string split method by "\\s"
public class StringWordCount {
    public static void main(String[] args) {
        System.out.println("Word count in String Example!");
        String input = "I am developer";
        System.out.println("WordCount:" + wordCount(input));
        input = "i want  to learn    programming";
        System.out.println("WordCount:" + wordCount(input));
    }

    private static int wordCount(String input) {
        int wordCount = 1;

        for (int i = 0; i < input.length()-1; i++) {
            char chatAt = input.charAt(i);
            char nextChar = input.charAt(i + 1);
            if (chatAt == ' ' && nextChar != ' ') {
                wordCount++;
            }
        }

        return wordCount;
    }
}
