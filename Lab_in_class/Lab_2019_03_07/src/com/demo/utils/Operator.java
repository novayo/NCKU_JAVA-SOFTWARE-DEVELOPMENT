package com.demo.utils;

public class Operator {
	
	public void Beep() {
		int x = 30;
		int y = 2;
		System.out.println(x * y + 9 / 3); // 63
		System.out.println(x / y * 5);     // 75
		
		System.out.println("");
		
		System.out.println(15.0/2);
		System.out.println(15/2);
		
		System.out.println("");
		
		double c = 10/3;
		double d = 10/(double)3;
		System.out.println( c );
		System.out.println( d );
		
		System.out.println("");
		
		int value1 = 3;
		int value2 = 4;
		int result = 0;
		result = value1++ * value2--; // result = 12, value1 = 4, value2 = 3
		System.out.println("Post increment/decrement: " + result);
		result = ++value1 * --value2; // result = 10, value1 = 5, value2 = 2
		System.out.println("Pre increment/decrement: " + result);
	}
}
