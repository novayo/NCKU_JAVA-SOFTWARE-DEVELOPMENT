package com.demo.utils;

public class Document {
	String text;
	
	public Document(String string) {
		setText(string);
	}
	
	public String toString() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
}
