package com.demo.utils;

import java.util.Scanner;

public class ScannerDemo {
	public void Beep() {
		int n1, n2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two whole numbers");
		System.out.println("seperated by one or more spaces:");
		
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		System.out.println("You entered " + n1 + " and " + n2);
		
		
		
		System.out.println("Next enter two numbers");
		System.out.println("Decimal points are allowed.");
		double d1, d2;
		d1 = scanner.nextDouble();
		d2 = scanner.nextDouble();
		System.out.println("You entered " + d1 + " and " + d2);
		
		System.out.println("Next enter two words:");
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		System.out.println("You entered \"" + s1 + "\" and \"" + s2 + "\"");
		
		String junkString = scanner.nextLine();
		System.out.println("Next enter a line of string:");
		String lineString = scanner.nextLine();
		System.out.println("You entered \"" + lineString + "\"");
		
		System.out.println("~~~~~~~~~~~~~~ End Process ~~~~~~~~~~~~~~");
	}
}
