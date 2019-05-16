package com.demo;

import java.util.Scanner;

import com.demo.utils.Addition;
import com.demo.utils.Comparison;
import com.demo.utils.IOperation;
import com.demo.utils.Subtraction;

public class Main {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String inputString = inputScanner.nextLine();
		String[] splitInput = inputString.split(" ");
		
		/*
		 * + "+" + => Addition
		 * + "-" + => Subtraction
		 * - "+" + => Subtraction
		 * - "-" + => (-)Addition
		 * + "+" - => Subtraction
		 * + "-" - => Addition
		 * - "+" - => (-)Addition
		 * - "-" - => Subtraction
		 */
		IOperation operation = new Comparison();;
		String resultString = splitInput[0];
		if (splitInput[1].charAt(0) == '>') {
			if (operation.perform(resultString, splitInput[2]).charAt(0) == '0') {
				resultString = "false";
			} else if (operation.perform(resultString, splitInput[2]).charAt(0) == '-') {
				resultString = "false";
			} else {
				resultString = "true";
			}
		} else if (splitInput[1].charAt(0) == '<') {
			if (operation.perform(resultString, splitInput[2]).charAt(0) == '0') {
				resultString = "false";
			} else if (operation.perform(resultString, splitInput[2]).charAt(0) == '-') {
				resultString = "true";
			} else {
				resultString = "false";
			}
		} else if (splitInput[1].charAt(0) == '=') {
			if (operation.perform(resultString, splitInput[2]).charAt(0) == '0') {
				resultString = "true";
			} else if (operation.perform(resultString, splitInput[2]).charAt(0) == '-') {
				resultString = "false";
			} else {
				resultString = "false";
			}
		} else {
			for (int i=1; i<splitInput.length; i+=2) {
				if (splitInput[i].charAt(0) == '+') {
					if (resultString.charAt(0) != '-' && splitInput[i+1].charAt(0) != '-') {
						operation = new Addition();
					} else if (resultString.charAt(0) == '-' && splitInput[i+1].charAt(0) != '-') {
						operation = new Subtraction();
					} else if (resultString.charAt(0) != '-' && splitInput[i+1].charAt(0) == '-') {
						operation = new Subtraction();
					} if (resultString.charAt(0) == '-' && splitInput[i+1].charAt(0) == '-') {
						operation = new Addition();
					}
				} else if (splitInput[i].charAt(0) == '-') {
					if (resultString.charAt(0) != '-' && splitInput[i+1].charAt(0) != '-') {
						operation = new Subtraction();
					} else if (resultString.charAt(0) == '-' && splitInput[i+1].charAt(0) != '-') {
						operation = new Addition();
					} else if (resultString.charAt(0) != '-' && splitInput[i+1].charAt(0) == '-') {
						operation = new Addition();
					} if (resultString.charAt(0) == '-' && splitInput[i+1].charAt(0) == '-') {
						operation = new Subtraction();
					}
				}
				resultString = operation.perform(resultString, splitInput[i+1]);
			}
			while (resultString.charAt(0) == '0' && resultString.length() != 1) resultString = resultString.substring(1); // get rid of 0
		}		
		System.out.println(resultString);
		inputScanner.close();
	}
	
}
