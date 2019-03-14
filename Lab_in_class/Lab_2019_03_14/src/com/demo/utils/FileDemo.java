package com.demo.utils;

import java.io.FileInputStream;
import java.util.Scanner;

public class FileDemo {
	public void Beep() {
		try{
			Scanner scanner = new Scanner(new FileInputStream("./src/test.txt")); // 路徑跟src同一層
			String name = scanner.nextLine();
			String id = scanner.nextLine();
			String school = scanner.nextLine();
			System.out.println("Name: "+ name); 
			System.out.println("ID: "+ id); 
			System.out.println("School: " + school);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
