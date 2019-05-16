package com.demo;

import com.demo.utils.A;
import com.demo.utils.SayHello;

public class Main {
	public static void main(String[] args) {
		SayHello sayHello = new SayHello();
		sayHello.Beep(1990);
		
		
		
		
		
		
		A a = new A();
		System.out.println(a.num); //1 
		System.out.println(a.b.speed); //100
		
		A clone_a = (A) a.clone(); 
		System.out.println(clone_a.num); //1 
		System.out.println(clone_a.b.speed); //100
		
		clone_a.num = 2;
		clone_a.b.speed = 200; 
		System.out.println(a.num); //1 
		System.out.println(a.b.speed); //200
		
		
	}
	

}
