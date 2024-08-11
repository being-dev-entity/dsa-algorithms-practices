package com.being.developer.sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 6, 4, 5, 3, 2, 1 };
		// int arr[] = { 8, 2, 5, 3, 4, 7, 6, 1 };

		System.out.println("Given Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		bubbleSort(arr);
		System.out.println("\nSorted array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void bubbleSort(int array[]) {

		for (int i = 0; i < array.length; i++) {

			for (int j = 1; j < array.length; j++) {
				if (array[j] < array[j - 1]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
