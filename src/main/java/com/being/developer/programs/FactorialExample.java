package com.being.developer.programs;

public class FactorialExample {
  public static void main(String arg[]) {
    System.out.println("Factorial Example!");
    long factorial5 = findFactorial(5);
    long factorial2 = findFactorialRec(2);
    System.out.println(factorial5);
    System.out.println(factorial2);
    int numberOfTrailingZero = findTrailingZeros(5);
    System.out.println("numberOfTrailingZero: " + numberOfTrailingZero);
  }

  private static long findFactorial(int number) {
    long factorial = 1;
    if (number == 0) {
      return 1;
    }
    int i = 0;
    while (number > 0) {
      factorial = factorial * number;
      number--;
    }

    return factorial;
  }

  private static long findFactorialRec(int number) {
    if (number == 0) {
      return 1;
    }
    return number * findFactorialRec(number - 1);
  }

  private static int findTrailingZeros(int number) {
    int res = 0;

    for (int i = 5; i <= number; i = i * 5) {
      res = res + res + number / 5;
    }
    
    return res;
  }
}
