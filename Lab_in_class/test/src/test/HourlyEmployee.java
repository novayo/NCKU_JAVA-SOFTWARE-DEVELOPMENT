package test;

import java.util.Date;
public class HourlyEmployee extends Employee{
	private double wageRate;
	public HourlyEmployee(String theName, Date theDate, double rate){ 
		name = theName;
		hireDate = theDate;
		wageRate = rate;
		System.out.println("Step 2");
	}
	
	public String getName(int i) {
		return "123";
	}
}