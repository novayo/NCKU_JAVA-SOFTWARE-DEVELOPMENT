package com.demo.utils;

public class Subtraction implements IOperation{
	
	public String perform(String num1, String num2) {
		if (num1.equals(num2) == true) return "0";
		else if (num1.substring(1).equals(num2) == true || num2.substring(1).equals(num1) == true) return "0";
		
		boolean isNegtive = false;
		if (num1.charAt(0) != '-' && num2.charAt(0) != '-') {
			if (num1.length() < num2.length() || (num1.compareTo(num2) < 0) && num1.length() == num2.length()) isNegtive = true;
		} else if (num1.charAt(0) != '-' && num2.charAt(0) == '-') {
			num2 = num2.substring(1);
			if (num1.length() < num2.length() || (num1.compareTo(num2) < 0) && num1.length() == num2.length()) isNegtive = true;
		} else if (num1.charAt(0) == '-' && num2.charAt(0) != '-') {
			num1 = num1.substring(1);
			if (num1.length() < num2.length() || (num1.compareTo(num2) < 0) && num1.length() == num2.length()) isNegtive = false;
			else isNegtive = true;
		} else if (num1.charAt(0) == '-' && num2.charAt(0) == '-') {
			num1 = num1.substring(1);
			num2 = num2.substring(1);
			if (num1.length() < num2.length() || (num1.compareTo(num2) < 0) && num1.length() == num2.length()) isNegtive = false;
			else isNegtive = true;
		}
		
		if (num1.length() < num2.length() || (num1.compareTo(num2) < 0) && num1.length() == num2.length()) {
			String tmpString = num1;
			num1 = num2;
			num2 = tmpString;
		}
	  
	    String resultString = "";
	    int n1 = num1.length(), n2 = num2.length();
	    num1 = new StringBuilder(num1).reverse().toString();
	    num2 = new StringBuilder(num2).reverse().toString();
	    
	    int carry = 0;
	    for (int i = 0; i < n2; i++) {
	        int sub = ((int)(num1.charAt(i)-'0') - (int)(num2.charAt(i)-'0')-carry);
	        if (sub < 0) {
	            sub = sub + 10;
	            carry = 1;
	        } else {
	            carry = 0;
	        }
	        resultString += (char)(sub + '0');
	    }
	  
	    for (int i = n2; i < n1; i++) {
	        int sub = ((int)(num1.charAt(i) - '0') - carry);
	        if (sub < 0) {
	            sub = sub + 10;
	            carry = 1;
	        } else {
	            carry = 0;
	        } 
	        resultString += (char)(sub + '0');
	    }
	  
	    if (isNegtive == true) return ("-" + new StringBuilder(resultString).reverse().toString());
	    else return (new StringBuilder(resultString).reverse().toString());
	}
	
}
