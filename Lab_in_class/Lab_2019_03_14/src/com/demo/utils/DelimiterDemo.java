package com.demo.utils;

import java.util.Scanner;

public class DelimiterDemo {
	public void Beep() {
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		scanner2.useDelimiter("##");
		String wordString1, wordString2;
		
		System.out.println("Enter a line of text:");
		wordString1 = scanner1.next();
		wordString2 = scanner1.next();
		System.out.println("For scanner1 the two words read are:");
		System.out.println(wordString1);
		System.out.println(wordString2);
		String junkString = scanner1.nextLine();
		
		System.out.println("Reenter the same text:");
		wordString1 = scanner2.next();
		wordString2 = scanner2.next();
		System.out.println("For scanner2 the two words read are:");
		System.out.println(wordString1);
		System.out.println(wordString2);
	}
}
