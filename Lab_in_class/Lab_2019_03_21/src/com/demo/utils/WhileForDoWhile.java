package com.demo.utils;

public class WhileForDoWhile {
	public void Beep() {
		
		// while
		int x = 3;
		System.out.println("The value of x is:" + x); 
		while(x < 10){
			x+=3; 
		}
		System.out.println("The value of x is:" + x);
		
		
		// do-while
		int evenNumber = 2; 
		do{
			System.out.println(evenNumber);
			evenNumber += 2; 
		} while(evenNumber <= 10);
		
		
		// for
		int sum = 0;
		for(int i=1; i <= 3; i++) {
		sum += i; }
		System.out.println("The total is: " + sum);	
		
		
		
		
		
		
		// advanced
		int evenSum = 0;
		int oddSum = 0;
		//loop through the numbers 
		for(int i=1; i <= 5; i++) {
			if(i % 2 == 0) {
				//even number
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		System.out.println("Even sum = " + evenSum); 
		System.out.println("Odd sum = " + oddSum);
		
		
		// nested for loop
		for (int row = 1; row <=3; row++) {
			for (int column = 1; column <=2; column++){ 
				System.out.print("<"+row + "," + column+">");
			}
			System.out.println(); 
		}
		
		
		// name the for loop
		for(int i=0; i<=10; i++){ 
			System.out.println("i="+i);
			for(int j=0;j<=10;j++){ 
				System.out.println("j="+j);
				break; 
			}
		}
		System.out.println("");
loop1:	for(int i=0; i<=10; i++){ 
			System.out.println("i="+i);
			for(int j=0;j<=10;j++){ 
				System.out.println("j="+j);
				break loop1; 
			}
		}
	}
}
