package com.demo.utils;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
	public void Beep() {
		Student student = new Student("Yan", 20);
		Student[] student2 = new Student[2];
		student2[0] = new Student("no name", 1);
		student2[1] = new Student("Eric", 21);
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("./output2.obj"));
			objectOutputStream.writeInt(123);
			objectOutputStream.writeObject(student);
			objectOutputStream.writeObject(student2);
			objectOutputStream.flush();
			objectOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
