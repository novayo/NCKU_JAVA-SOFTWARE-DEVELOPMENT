package com.demo.utils;

public class Addition implements IOperation{
	
	public String perform(String num1, String num2) {
		
		boolean isNegtive = false;
		if (num1.charAt(0) != '-' && num2.charAt(0) != '-') {
			isNegtive = false;
		} else if (num1.charAt(0) != '-' && num2.charAt(0) == '-') {
			num2 = num2.substring(1);
			isNegtive = false;
		} else if (num1.charAt(0) == '-' && num2.charAt(0) != '-') {
			num1 = num1.substring(1);
			isNegtive = true;
		} else if (num1.charAt(0) == '-' && num2.charAt(0) == '-') {
			num1 = num1.substring(1);
			num2 = num2.substring(1);
			isNegtive = true;
		}
		
		if (num1.length() > num2.length()) {
	        String tmpString = num1;
	        num1 = num2;
	        num2 = tmpString;
	    }
	 
	    String resultString = "";
	    int n1 = num1.length(), n2 = num2.length();
	    num1 = new StringBuilder(num1).reverse().toString();
	    num2 = new StringBuilder(num2).reverse().toString();
	    
	    int carry = 0;
	    for (int i = 0; i < n1; i++) {
	        int sum = ((int)(num1.charAt(i) - '0') + (int)(num2.charAt(i) - '0') + carry);
	        resultString += (char)(sum % 10 + '0');
	        carry = sum / 10;
	    }
 
	    for (int i = n1; i < n2; i++) {
	        int sum = ((int)(num2.charAt(i) - '0') + carry);
	        resultString += (char)(sum % 10 + '0');
	        carry = sum / 10;
	    }

	    if (carry > 0) resultString += (char)(carry + '0');
	    
	    if (isNegtive == true) return ("-" + new StringBuilder(resultString).reverse().toString());
	    else return (new StringBuilder(resultString).reverse().toString());
	}
	
}
