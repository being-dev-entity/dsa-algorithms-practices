package com.being.developer.patterns;

import java.util.stream.Stream;

// Find the smallest element in an array.
public class Array2 {
    public static void main(String[] args) {
          Integer arr[] = { 3, 45, 2, 4, 33, 11, 43 };
        System.out.println(findTheSmallestElement(arr));
    }
    private  static int findTheSmallestElement(Integer array[]){
        if (array==null) {
            return  0;
        }

      return  Stream.of(array).min((e1,e2)-> e1.compareTo(e2)).get();
    }
}
