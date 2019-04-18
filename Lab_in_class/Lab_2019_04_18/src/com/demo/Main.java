package com.demo;

import com.demo.utils.FileIoTest;
import com.demo.utils.ObjectInputStreamTest;
import com.demo.utils.ObjectOutputStreamTest;
import com.demo.utils.ReadFileTest;

public class Main {

	public static void main(String[] args) {
		FileIoTest fileIoTest = new FileIoTest();
		fileIoTest.Beep();

		ReadFileTest readFileTest = new ReadFileTest();
		readFileTest.Beep();
		
		ObjectOutputStreamTest objectOutputStreamTest = new ObjectOutputStreamTest();
		objectOutputStreamTest.Beep();
		
		ObjectInputStreamTest objectInputStreamTest = new ObjectInputStreamTest();
		objectInputStreamTest.Beep();
	}

}
