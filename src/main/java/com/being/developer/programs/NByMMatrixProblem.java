package com.being.developer.programs;

// number of total ways to reach the desired end of matrix.
public class NByMMatrixProblem {
    public static void main(String[] args) {
        System.out.println("N*M matrix example");

        int result = findWays(4, 3);

        System.out.println("Result: " + result);
    }

    static int findWays(int row, int column) {
        if (row == 1 || column == 1) {
            return 1;
        }

        return findWays(row - 1, column) + findWays(row, column - 1);
    }
}
