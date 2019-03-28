package com.demo.utils;

import java.util.StringTokenizer;

public class StringToken {
	public void Beep() {
		String in = "Hello,World,Java";
		StringTokenizer st = new StringTokenizer(in, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token); 
		}
	}
}
