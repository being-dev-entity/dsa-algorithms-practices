package com.being.developer.patterns;

public class Array5 {
    public static void main(String[] args) {
        int numbers[] = { 3, 0, 1 };
        System.out.println(findMissingNumber(numbers));
        int numbers2[] = { 0, 1 };
        System.out.println(findMissingNumber(numbers2));
        int numbers3[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(findMissingNumber(numbers3));
    }

    static int findMissingNumber(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int n = array.length + 1; // mean include the total elements of AP include missing as well.
        int a = 0; // should start from 0 be else we need to find element min and max from the
                   // array.
        int l = array.length; // should not be greater than n
        int expectedSum = n * (a + l) / 2; // AP formula.
        int atualSum = 0;
        for (int num : array) {
            atualSum += num;
        }

        return expectedSum - atualSum;
    }
}
