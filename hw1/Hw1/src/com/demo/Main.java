package com.demo;

public class Main {

	public static void main(String[] args) {
		String answerString = "";
		String[] partOfArgs = args[0].split(" ");
		
		for (int i=0; i<partOfArgs.length; i++) {
			// Do <Pig Latin rule>
			if (partOfArgs[i].charAt(0) == 'a' || partOfArgs[i].charAt(0) == 'e' || partOfArgs[i].charAt(0) == 'i' || 
				partOfArgs[i].charAt(0) == 'o' || partOfArgs[i].charAt(0) == 'u') {
				partOfArgs[i] = partOfArgs[i] + "ay";
			} else {
				partOfArgs[i] = partOfArgs[i].substring(1) + partOfArgs[i].charAt(0) + "ay";
			}
			
			// Upper case the capital
			partOfArgs[i] = (char)(partOfArgs[i].charAt(0)-32) + partOfArgs[i].substring(1);
			
			// Add to answerString
			answerString += (partOfArgs[i] + ' ');
		}
		
		System.out.print(answerString.trim()); // Get rid of the last space	
	}

}
