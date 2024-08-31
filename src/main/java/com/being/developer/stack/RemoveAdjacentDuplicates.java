package com.being.developer.stack;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        System.out.println("Remove Adjacent Duplicate characters in String!");
        String input = "abbaca"; // azxxzy;
        System.out.println("Input: " + input);

        String output = removeDuplicates(input);
        System.out.println("Output: " + output);
    }

    private static String removeDuplicates(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (stack.empty()) {
                stack.push(Character.valueOf(c));
            } else if (stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(Character.valueOf(c));
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i));
        }

        return sb.toString();

        // Can use iteration of stack this way if not supported index based access in
        // stack.
        // while (!stack.isEmpty() && stack.peek() != null) {
        // sb.append(stack.pop());
        // }
        // return sb.reverse().toString();
    }
}
