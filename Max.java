package com.bridgelabz.generics;

public class Max {
  // using generic for making the code more streamline
	
	public static <T extends Comparable<T>> T checkMax(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max) > 0) {
			max = y; // y is maximum now
		}
		if(z.compareTo(max) > 0) {
			max = z; // z is maximum now
		}
		return max; // returns maximum value
	}
	
	public static <T extends Comparable<T>> T checkMax_With_MoreThan_ThreeParameters(T... elements) {
		T max = elements[0];
		for(T maxParametereter : elements) {
			if(maxParametereter.compareTo(max) > 0) {
				max = maxParametereter;
			}
		}
		return max;
	}
			public static void main(String[] args) {
				Integer value= checkMax(48,95,35);
				Double result = checkMax(15.4,12.5,55.5);
				String cars = checkMax("sonet", "seltos", "nexon");
				Integer valueForInteger = checkMax_With_MoreThan_ThreeParameters(55,43,85,40,93);
				Double resultForDouble = checkMax_With_MoreThan_ThreeParameters(19.8, 25.8, 23.0,24.0,50.2);
				String fruits = checkMax_With_MoreThan_ThreeParameters("Apple", "Peach", "Banana", "Mango", "Orange"); 
				
				System.out.println(value);
				System.out.println(result);
				System.out.println(cars);
				System.out.println(valueForInteger);
				System.out.println(resultForDouble);
				System.out.println(fruits);
			}



}
