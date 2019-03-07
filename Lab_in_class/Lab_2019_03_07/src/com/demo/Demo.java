package com.demo;
import com.demo.utils.HelloWorld;
import com.demo.utils.Operator;

public class Demo {
	
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.Beep();
		
		Operator operator = new Operator();
		operator.Beep();
	}
}
