package com.demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		int len = 2 * input - 1;
		int star_pos = input-1;
		
		for (int i=0; i<input-1; i++) {
			for (int j=0; j<len; j++) {
				if (j == star_pos) System.out.print("*");
				else if (j == len-star_pos-1) System.out.print("*");
				else System.out.print(".");
			}
			star_pos--;
			System.out.println();
		}
		while(len-->0) System.out.print("*");
		System.out.println();
	}

}
