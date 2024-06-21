package com.being.developer.string;

public class StringShift {
    public static void main(String[] args) {
        String input = "abhay";
        System.out.println("Input String : " + input);
        System.out.println("Shifted String : " + shift(input, 1));
    }

    public static String shift(String input, int shiftValue) {

        char[] inputArray = input.toCharArray();
        char[] resultArray = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            /*
             * int newIndex = i + shiftValue;
             * if (newIndex >= inputArray.length) {
             * newIndex = newIndex - inputArray.length;
             * }
             */
            // in modulo operation, if shiftValue is greater than inputArray.length, it will
            // automatically take care of it
            int newIndex = (i + shiftValue) % inputArray.length;
            resultArray[i] = inputArray[newIndex];
        }

        return new String(resultArray);
    }
}
