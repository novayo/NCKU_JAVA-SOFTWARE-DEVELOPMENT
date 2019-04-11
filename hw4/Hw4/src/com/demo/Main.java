package com.demo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		double n = inputScanner.nextDouble();
		inputScanner.close();
		DecimalFormat ansDecimalFormat = new DecimalFormat("##.##");
		System.out.println(ansDecimalFormat.format(Babylonian(n)));
	}

	public static double Babylonian(double n) {
		double guess = n/2.0;
		double r = n / guess;
		double nextGuess = (guess + r) / 2.0;
		while (Math.abs(nextGuess - guess) > 0.01) {
			guess = nextGuess;
			r = n / guess;
			nextGuess = (guess + r) / 2.0;
		}
		return nextGuess;
	}
}
