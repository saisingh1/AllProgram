package com.app;

public class CommonElementsInArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int arr2[] = { 1, 3, 5, 7, 9 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println("arr1=" + arr1[i]);
					// System.out.println("arr2="+arr2[j]);
				}
			}
		}
	}
}
