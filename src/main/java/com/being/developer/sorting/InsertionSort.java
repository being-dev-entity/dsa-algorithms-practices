package com.being.developer.sorting;

public class InsertionSort {
	public static void main(String[] args) {

		int arr[] = { 6, 4, 5, 3, 2, 1 }; // { 3, 4, 5, 7, 6, 8 };
        
		System.out.println("Given Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		selectionSort(arr);
		System.out.println("\nSorted array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void selectionSort(int array[]) {

		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i;

			while (j > 0 && array[j - 1] > current) {
				array[j] = array[j - 1];
				j--;
			}

			array[j] = current;
		}

	}
}
