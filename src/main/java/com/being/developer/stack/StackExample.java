package com.being.developer.stack;

import java.util.Stack;

class StackExample {

    public static void main(String[] args) {
        // stackCreation();
        System.out.println("=============Stack operations ==================");
        stackOperations();
    }

    public static void stackCreation() {
        final Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("stack -> " + stack);

        final Stack<Integer> stack2 = new Stack<>();
        stack2.add(1);
        stack2.add(2);
        System.out.println("stack2 -> " + stack2);
    }

    public static void stackOperations() {
        final Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("stack -> " + stack);

        System.out.println("stack contains 4 " + stack.contains(4));
        System.out.println("stack pop " + stack.pop());
        System.out.println("stack -> " + stack);
        System.out.println("stack pop " + stack.pop());
        System.out.println("stack -> " + stack);
        System.out.println("stack peek " + stack.peek());
        System.out.println("stack -> " + stack);
        System.out.println("stack get index at 1 is " + stack.get(1));
        System.out.println("stack add index at 1 then ");
        stack.add(1, 7);
        System.out.println("stack -> " + stack);
    }
}