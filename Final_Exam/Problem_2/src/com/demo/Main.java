package com.demo;

public class Main {

	public static void main(String[] args) {
		int numA=0;
		int numB=0;
		
		for (int i=0; i<args[0].length(); i++) {
			if (args[1].indexOf(args[0].charAt(i)) == -1) continue;
			if (args[0].charAt(i) == args[1].charAt(i)) numA++;
			else numB++;
		}
		System.out.println(numA + "A" + numB + "B");
	}

}
