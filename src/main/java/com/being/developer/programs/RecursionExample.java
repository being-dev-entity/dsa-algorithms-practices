package com.being.developer.programs;

public class RecursionExample {
    public static void main(String[] args) {
        System.out.println("Example of Recursion");
        long result = powerOf(12,12);
        System.out.println(result);
    }
    // TODO: Arithmetic overflow issue,
   static long powerOf(int a , int b){
        if(b == 0){
            return 1;
        }
        
       return a*powerOf(a,b-1);
    }
}
