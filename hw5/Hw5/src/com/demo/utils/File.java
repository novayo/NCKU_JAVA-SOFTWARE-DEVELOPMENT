package com.demo.utils;

public class File extends Document{
	String pathname;

	public File(String pathname, String fileContent) {
		super(fileContent);
		setPathname(pathname);
	}
	
	public String toString() {
		return "Path: " + pathname + "\n" +
				text;
	}
	
	public String getPathname() {
		return pathname;
	}

	public void setPathname(String pathname) {
		this.pathname = pathname;
	}
}
