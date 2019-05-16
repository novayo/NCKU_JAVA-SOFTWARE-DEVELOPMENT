package com.demo.utils;

public class Email extends Document{
	String sender;
	String recipient;
	String title;
	
	public Email(String sender, String recipient, String title, String emailBody) {
		super(emailBody);
		setSender(sender);
		setRecipient(recipient);
		setTitle(title);
	}
	
	public String toString() {
		return "From: " + sender + "\n" +
			   "To: " + recipient + "\n" +
			   "Title: " + title + "\n"+ 
			   text;
	}
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
