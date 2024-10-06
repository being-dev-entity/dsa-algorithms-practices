package com.being.developer.arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("Merge two sorted array!");
        int array1[] = { 20, 40, 50, 70, 80, 110,112,120 };
        int array2[] = { 21, 41, 51, 70, 81, 109,117 };
        int result [] = mergeSortedArray(array1, array2);
         for (Integer integer : result) {
            System.out.print(integer + ",");
        }
    }

    private static int[] mergeSortedArray(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int result[] = new int[length1 + length2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < length1 && j < length2) {
            if (array1[i] < array2[j]) {
                result[k] = array1[i];
                k++;
                i++;
                continue;
            } if (array2[j] < array1[i]) {
                result[k] = array2[j];
                k++;
                j++;
                continue;
            } if (array2[j] == array1[i]) {
                // copy first array.
                result[k] = array1[i];
                k++;
                i++;
                // copy second array
                result[k] = array2[j];
                k++;
                j++;
            }
        }
        // copy renmaining items.
        while (i < length1) {
            result[k] = array1[i];
            k++;
            i++;
        }
        while (j < length2) {
            result[k] = array2[j];
            k++; 
            j++;
        }

        return result;
    }
}
