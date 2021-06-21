package com.bridgelabz.generics;

public class Max<T extends Comparable<T>> {

	T a, b, c;

	public Max(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// checking which object is the largest
	public static <T extends Comparable<T>> T checkMax(T a, T b, T c) {
		T max = a;
		if (b.compareTo(max) > 0) {
			max = b; // y is largest thus for
		}
		if (c.compareTo(max) > 0) {
			max = c; // z is largest now
		}
		printMax(max);
		return max; // returns maximum
	}

	public static String testMax(String x, String y, String z) {
		String max = x;
		if (y.compareTo(max) > 0) {
			max = y; // y is the largest
		}
		if (z.compareTo(max) > 0) {
			max = z; // z is the largest
		}
		printMax(max);
		return max; // returns the largest so for
	}

	public static <T> void printMax(T max) {
		System.out.println("Max of Three  is" + max);
	}

	public static void main(String[] args) {
		Integer value = checkMax(48, 95, 35);
		Double result = checkMax(15.4, 12.5, 55.5);
		String first = "seltos", second = "sonet", third = "nexon";
		Max.testMax(first, second, third);
		printMax(value);
		printMax(result);

	}

}
