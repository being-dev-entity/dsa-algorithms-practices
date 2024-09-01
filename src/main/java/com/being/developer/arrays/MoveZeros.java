package com.being.developer.arrays;

// Move all zeros to right at end of array and non zero elements left side
// keep relative order of zeros.
public class MoveZeros {
    public static void main(String[] args) {
        System.out.println("Move all zeros example!");
        int[] array = { 2, 4, 0, 4, 0, 6, 7, 0, 6, 7, 8, 11 };
        for (Integer integer : array) {
            System.out.print(integer + ",");
        }
        System.out.println("\nMove zeros:");
        array  =  moveZeros(array);
        
        for (Integer integer : array) {
            System.out.print(integer + ",");
        }
    }

    public static int[] moveZeros(int array[]) {
        int lastNonZeroIndex = 0;
        // collecting all non zero and storing in the same array from starting.
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[lastNonZeroIndex] = array[i];
                lastNonZeroIndex++;
            }
        }
        // filling remaining index with zero.
        for (int i = lastNonZeroIndex; i < array.length; i++) {
            array[i] = 0;
        }

        return array;
    }
}
