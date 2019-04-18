package com.demo.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
	public void Beep() {
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("./output2.obj"));
			int num = objectInputStream.readInt();
			System.out.println("num=" + num);
			
			Student stu = (Student)objectInputStream.readObject(); 
			System.out.println("Student name=" + stu.getName()); 
			System.out.println("Student age=" + stu.getAge());
			
			Student[] stu2 = (Student[])objectInputStream.readObject(); 
			System.out.println("Student1 name="+stu2[0].getName()); 
			System.out.println("Student1 age="+stu2[0].getAge()); 
			System.out.println("Student2 name="+stu2[1].getName()); 
			System.out.println("Student2 age="+stu2[1].getAge());
			objectInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
