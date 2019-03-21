package com.demo.utils;

import java.util.Scanner;

public class Factorial {
	
	public void Beep() {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		try {
			System.out.print("Please input a number:");
			input = scanner.nextInt();
		} finally {
			scanner.close();
		}
		
		int ans = 1;
		for (int i=1; i<input+1; i++) {
			ans = ans * i;
		}
		
		System.out.println(input + "!=" + ans);
	}
	
}
