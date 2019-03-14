package com.demo.utils;

import java.text.DecimalFormat;

public class DemicalFormatDemo {
	public void Beep() {
		DecimalFormat df = new DecimalFormat("00.000");
		String string = df.format(1.23);
		System.out.println(string);
		
		DecimalFormat df2 = new DecimalFormat("#0.###");
		String string2 = df2.format(1.23);
		System.out.println(string2);
	}
}
