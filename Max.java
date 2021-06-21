package com.bridgelabz.generics;

public class Max {

	//calculating Maximum of Three Numbers using CompareTo method
			public static int checkMax(Integer a, Integer b, Integer c) {
				Integer max = a;
				if(b.compareTo(max) > 0) {
					max = b; // b is largest now
				}
				if(c.compareTo(max) > 0) {
					max = c; // c is largest now
				}
				return max; // returns maximum number
			}

			public static void main(String[] args) {
				int value= checkMax(48,95,35);
				System.out.println(value);
			}



}
