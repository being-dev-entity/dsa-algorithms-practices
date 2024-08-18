package com.being.developer.stack;

import java.util.Stack;

public class ParanthesisProblem {

    public static void main(String[] args) {
        System.out.println("find given input of paranthesis is valid or not");
        System.out.println("IsValid ({[]}) :" + isValid("({[]})"));
        System.out.println("IsValid ([]}) :" + isValid("([]})"));
    }

    public static boolean isValid(String input) {

        if (input == null) {
            return false;
        }
        input = input.trim();

        Stack<Character> openingParanthesStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            Character ch = (Character) input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                openingParanthesStack.push(ch);
            } else {
                if (openingParanthesStack.isEmpty()) {
                    return Boolean.TRUE;
                } else {
                    Character expectedOpenChar = getExpectedOpenChar(ch);
                    Character openChar = openingParanthesStack.peek();
                    if (openChar.charValue() == expectedOpenChar.charValue()) {
                        openingParanthesStack.pop();
                    } else {
                        return Boolean.FALSE;
                    }
                }
            }
        }
        return openingParanthesStack.empty();
    }

    private static Character getExpectedOpenChar(Character ch) {
        if (ch == ')')
            return '(';
        if (ch == '}')
            return '{';
        if (ch == ']')
            return '[';
        throw new RuntimeException("CharacterNotSupperted: " + ch);
    }
}