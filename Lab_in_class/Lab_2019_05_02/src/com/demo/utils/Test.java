package com.demo.utils;
public class Test {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = a1;
		a2.a = 10;
		System.out.println(a2.a);
		
		
		int[] arr = {10};
		System.out.println(arr[0]);
		test(arr);
		System.out.println(arr[0]);
		
	}
	
	public static void test(int[] a) {
		a[0] = -10;
	}
}
