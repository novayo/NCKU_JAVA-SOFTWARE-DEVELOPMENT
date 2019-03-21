package com.demo.utils;

public class StringCompare {
	public void Beep() {
		String a = new String("Java"); 
		String b = new String("Java"); 
		System.out.println(a); 
		System.out.println(b);
		
		if(a==b) {
			System.out.println("a==b");
		}
		if(a.equals(b)) {
			System.out.println("a equals to b");
		}
	}
}
