package com.demo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		String format = scanner.next();
		scanner.close(); // this can't be ignored
		
		DecimalFormat decimalFormat = new DecimalFormat(format);
		
		double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
	    double root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
		
		if (a>0) {
			System.out.println(decimalFormat.format(Math.max(root1, root2)));
			System.out.print(decimalFormat.format(Math.min(root1, root2)));
		} else {
			System.out.println(decimalFormat.format(Math.min(root1, root2)));
			System.out.print(decimalFormat.format(Math.max(root1, root2)));
		}
	}

}
