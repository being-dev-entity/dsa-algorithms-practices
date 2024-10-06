package com.being.developer.programs;

public class GCDExample {
    public static void main(String[] args) {
        System.out.println("GCD Example!");
        int gcd = findGCD(15, 5);
        System.out.println("GCD value: " + gcd);

    }

    static int findGCD(int a, int b) {
        if (b == 0)
            return a;

        return findGCD(b, a % b);
    }
}
