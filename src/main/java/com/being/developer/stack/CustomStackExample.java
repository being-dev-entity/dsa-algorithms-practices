package com.being.developer.stack;

public class CustomStackExample {
    public static void main(String[] args) {
        System.out.println("Custom Stack Example !");

        CustomStack customStack = new CustomStack();
        for (int i = 1; i <= 20; i++) {
            customStack.push(i);
        }
        System.out.println("Size is : " + customStack.size());
        while (customStack.peek() != null) {
            System.out.println(customStack.pop());
        }
    }
}

// TODO: Make generic type stack.
class CustomStack {
    int MAX_SIZE = 10;
    private Integer[] data;
    private int size = 0;

    public CustomStack() {
        data = new Integer[MAX_SIZE];
    }

    public CustomStack(int length) {
        MAX_SIZE = length;
        data = new Integer[MAX_SIZE];
    }

    public Integer peek() {
        if (size == 0) {
            return null;
        }
        return data[size - 1];
    }

    public void push(Integer element) {
        data[size] = element;
        size++;
        // if size is higher than half of max size;
        if (size == MAX_SIZE) {
            // create a new array and copy elements
            MAX_SIZE = MAX_SIZE * 2;
            copyArray();
        }
    }

    public Integer pop() {
        if (size == 0)
            return null;
        Integer element = data[size - 1];
        data[size] = null; // when generic then it will be pointing to null

        // if size is less than half of max size;
        /*
         * if (size < data.length / 2) {
         * MAX_SIZE = data.length / 2;
         * // create a new array and copy elements
         * copyArray();
         * }
         */
        size--;
        return element;
    }

    private void copyArray() {
        Integer temp[] = new Integer[MAX_SIZE];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
        temp = null;
    }

    public int size() {
        return size;
    }
}
