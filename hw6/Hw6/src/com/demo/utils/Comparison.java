package com.demo.utils;

public class Comparison implements IOperation{
	
	public String perform(String num1, String num2) {
		if (num1.charAt(0) != '-' && num2.charAt(0) != '-') {
			Subtraction utilSubtraction = new Subtraction();
			return utilSubtraction.perform(num1, num2);
		} else if (num1.charAt(0) != '-' && num2.charAt(0) == '-') {
			return "1";
		} else if (num1.charAt(0) == '-' && num2.charAt(0) != '-') {
			return "-1";
		} else {
			Subtraction utilSubtraction = new Subtraction();
			if (utilSubtraction.perform(num1.substring(1), num2.substring(1)).charAt(0) == '-') return "1";
			else return "-1";
		}
	}
	
}
