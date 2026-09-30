package com.being.developer.patterns;

public class Array3 {
    public static void main(String[] args) {

    }

    static int findSecondHighetDistinctElement(int [] array){
         if(array==null || array.length<=1)
          throw new RuntimeException("Invalid argument");
        
         int highest = array[0];
         int secondHighest= array[0];
         
         for (int i = 1; i < array.length; i++) {
            if(highest< array[i]){
                secondHighest= highest;
                highest = array[i];
            }
            else if (secondHighest< array[i]){
                secondHighest = array[i];
            }
         }
         
        return secondHighest;
    }
}
