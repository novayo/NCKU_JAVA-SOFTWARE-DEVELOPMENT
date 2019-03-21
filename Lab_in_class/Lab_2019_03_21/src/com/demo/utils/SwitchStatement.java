package com.demo.utils;

public class SwitchStatement {
	
	public void Beep() {
		char myChar = 'b';
		switch(myChar) {
		case 'a':
			System.out.println("It's an A");
			break;
		case 'b':
			System.out.println("It's an B");
			break;
		default:
			System.out.println("Default case");
			break;
		}
	}
	
}
