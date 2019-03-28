package com.demo;

import com.demo.utils.Duck;
import com.demo.utils.MathExample;
import com.demo.utils.StaticTest;
import com.demo.utils.StringToken;

public class Demo {

	public static void main(String[] args) {
		Duck duck = new Duck(true);
		
		boolean canTheDuckFly = duck.isCanfly();
		
		if (canTheDuckFly == true) {
			System.out.println("The duck can fly");
		}
		//duck.quack();
		//duck.quack("Ga Ga Ga");
		
		String food = "Hamburger"; 
		//String message = duck.eat(food); 
		//System.out.println(message);
		
		int expectedDistance = 10;
		//duck.swim(expectedDistance);
		//System.out.println("The expected distance is " + expectedDistance);
		
		StringToken stringToken = new StringToken();
		//stringToken.Beep();
		
		StaticTest obj1 = new StaticTest(); 
		StaticTest obj2 = new StaticTest();
		//System.out.println(StaticTest.port); 
		//System.out.println(obj1.port); 
		//System.out.println(obj2.port);
		StaticTest.port = 1234; 
		//System.out.println(obj1.port);
		obj2.port = 5678;
		//System.out.println(obj1.port);
		
		MathExample mathExample = new MathExample();
		mathExample.Beep();
	}

}
