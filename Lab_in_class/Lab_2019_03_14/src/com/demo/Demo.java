package com.demo;

import com.demo.utils.DelimiterDemo;
import com.demo.utils.DemicalFormatDemo;
import com.demo.utils.FileDemo;
import com.demo.utils.PrintfDemo;
import com.demo.utils.ScannerDemo;

public class Demo {
	public static void main(String[] args) {
		PrintfDemo prinfdemo = new PrintfDemo();
		//prinfdemo.Beep();
		
		DemicalFormatDemo demicalFormatDemo = new DemicalFormatDemo();
		//demicalFormatDemo.Beep();
		
		ScannerDemo scannerDemo = new ScannerDemo();
		//scannerDemo.Beep();
		
		DelimiterDemo delimiterDemo = new DelimiterDemo();
		//delimiterDemo.Beep();
		
		FileDemo fileDemo = new FileDemo();
		fileDemo.Beep();
	}
}
