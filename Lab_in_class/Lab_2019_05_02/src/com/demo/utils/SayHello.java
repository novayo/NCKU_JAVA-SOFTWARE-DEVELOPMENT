package com.demo.utils;

public class SayHello {
	
	int year = 2019;
	public String sayHello(String name){ 
		return "Hello! "+ name;
	}
	
	public String sayHello(String name, String gender){ 
		if(gender.equals("boy")){
			return "Hello! Mr. "+ name;	
		} else if(gender.equals("girl")){
			return "Hello! Miss. "+ name;
		} else{
			return "Hello! "+ name;
		}
	}
	
	public static void Beep(int year) {
		this.year = year;
		System.out.println(sayHello("S.J.")); //decided at compile time 
		System.out.println(sayHello("S.J.","boy")); //decided at compile time
	}
}
