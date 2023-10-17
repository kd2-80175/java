package com.question2;

import java.util.Arrays;
import java.util.Comparator;

public class Selection {
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (T d : arr)
			System.out.println(d);
	}

	public static void main(String[] args) {
		Double[] arr = { 2.5, 3.5, 5.5, 4.5, 6.5 };
		for (Double d : arr)
			System.out.println(d);
		class SelectionComparator implements Comparator<Double> {
			@Override
			public int compare(Double e1, Double e2) {
				
				int diff = e1.compareTo(e2);
				return diff;
			}

		}
		System.out.println("After selection sort");
		selectionSort(arr, new SelectionComparator());

	}
}
