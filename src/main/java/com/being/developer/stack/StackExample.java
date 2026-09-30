package com.being.developer.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

class StackExample {

    public static void main(String[] args) {
        // stackCreation();
        System.out.println("=============Stack operations ==================");
        stackOperations();
        System.out.println("=============Stack Itr ==================");

        iteratorExample();
    }

    private static void iteratorExample() {
        Stack<String> stack = new Stack<String>();

        stack.push("123");
        stack.push("456");
        stack.push("789");

        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.print("\t" + value);
        }

        Deque<String> dequeAsStack = new ArrayDeque<String>();

        dequeAsStack.push("one");
        dequeAsStack.push("two");
        dequeAsStack.push("three");

        String one = dequeAsStack.pop();
        String two = dequeAsStack.pop();
        String three = dequeAsStack.pop();

        System.out.println(one); // three
        System.out.println(two); // two
        System.out.println(three); // one
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