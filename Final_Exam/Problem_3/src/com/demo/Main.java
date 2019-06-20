package com.demo;

public class Main {

	public static void main(String[] args) {
		doPermutation("", args[0]);
	}
	
	public static void doPermutation(String prefix, String subString) {
		int n = subString.length();
		if (n == 0) System.out.println(prefix);
		
		// 每個都要跑
		for (int i=0; i<n; i++) {
			doPermutation(prefix + subString.charAt(i), subString.substring(0, i) + subString.substring(i+1, n));
		}
	}

}
