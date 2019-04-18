package com.demo.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileIoTest {
	public void Beep() {
		try {
			PrintWriter writer = new PrintWriter(new FileOutputStream("./output.txt", false));
			writer.println("Dear Alan,");
			writer.println("How are you?");
			writer.println("Joe");
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
