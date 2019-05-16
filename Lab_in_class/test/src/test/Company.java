package test;

import java.util.Date;
public class Company {
	public static void main(String[] args){
		
		
		Employee someEmploy = new HourlyEmployee("Josephine", new Date(114,0,1), 100);
		printHireDate(someEmploy);
	}
		public static void printHireDate(Employee someEmploy){ System.out.println(someEmploy.getHireDate());
}}