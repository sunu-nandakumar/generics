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
			public static float checkMax(Float d, Float e, Float f) {
				Float max = d;
				if(e.compareTo(max) > 0) {
					max = e; // e is largest now
				}
				if(f.compareTo(max) > 0) {
					max = f; // f is largest
				}
				return max; // // returns maximum number
			}

			public static void main(String[] args) {
				int value= checkMax(48,95,35);
				float result = checkMax(15.4f,12.5f,55.5f);
				System.out.println(value);
				System.out.println(result);
			}



}
