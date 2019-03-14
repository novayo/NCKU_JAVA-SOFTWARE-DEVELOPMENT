package com.demo;

public class Main {

	public static void main(String[] args) {
		String answerString = "";
		
		for (int i=0; i<args.length; i++) {
			// Do <Pig Latin rule>
			if (args[i].charAt(0) == 'a' || args[i].charAt(0) == 'e' || args[i].charAt(0) == 'i' || 
				args[i].charAt(0) == 'o' || args[i].charAt(0) == 'u') {
				args[i] = args[i] + "ay";
			} else {
				args[i] = args[i].substring(1) + args[i].charAt(0) + "ay";
			}
			
			// Upper case the capital
			args[i] = (char)(args[i].charAt(0)-32) + args[i].substring(1);
			
			// Add to answerString
			answerString += (args[i] + ' ');
		}
		
		System.out.print(answerString.trim()); // Get rid of the last space	
	}

}
