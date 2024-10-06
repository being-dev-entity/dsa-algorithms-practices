package com.being.developer.programs;

import java.util.Arrays;

public class PrimeNumberExample {
    public static void main(String[] arg) {
        System.out.println("Prime number example");
        boolean isPrimes[] = findPrimes(12);
        for (boolean prime : isPrimes) {
            System.out.println(prime + " ");
        }
    }

    private static boolean[] findPrimes(int n) {
        boolean isPrimes[] = new boolean[n + 1];
        Arrays.fill(isPrimes, Boolean.TRUE);
        isPrimes[0] = true;
        isPrimes[1] = true;

        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j = j + i) {
                isPrimes[j] = false;
            }
        }
        
        return isPrimes;
    }
}
