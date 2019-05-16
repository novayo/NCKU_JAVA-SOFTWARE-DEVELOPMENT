package com.demo;

import java.util.Scanner;

import com.demo.utils.Document;
import com.demo.utils.Email;
import com.demo.utils.File;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input_1 = scanner.nextLine(); // get A, B, C
		String input_2 = scanner.nextLine(); // get Document, Email, File
		
		switch (input_2) {
		case "Document":
			String input_3 = scanner.nextLine();
			Document document = new Document(input_3);
			
			switch (input_1) {
			case "A":
				System.out.println(document.toString());
				break;
			case "B":
				String input_B = scanner.nextLine();
				if (input_3.indexOf(input_B) != -1) System.out.println("true");
				else System.out.println("false");
				break;
			case "C":
				String input_variable = scanner.nextLine();
				if (input_variable.equals("text")) {
					String input_newText = scanner.nextLine();
					document.setText(input_newText);
				} else {
					System.out.println("Error in variable input");
				}
				System.out.println(document.toString());
				break;
			default:
				System.out.println("Error in first input");
				break;
			}
			
			break;
		case "Email":
			String input_4 = scanner.nextLine();
			String input_5 = scanner.nextLine();			
			String input_6 = scanner.nextLine();
			String input_7 = scanner.nextLine();
			Email email = new Email(input_4, input_5, input_6, input_7);
			
			switch (input_1) {
			case "A":
				System.out.println(email.toString());
				break;
			case "B":
				String input_B = scanner.nextLine();
				if (input_7.indexOf(input_B) != -1) System.out.println("true");
				else System.out.println("false");
				break;
			case "C":
				String input_variable = scanner.nextLine();
				if (input_variable.equals("text")) {
					String input_newText = scanner.nextLine();
					email.setText(input_newText);
				} else if (input_variable.equals("sender")) {
					String input_newText = scanner.nextLine();
					email.setSender(input_newText);
				} else if (input_variable.equals("recipient")) {
					String input_newText = scanner.nextLine();
					email.setRecipient(input_newText);
				} else if (input_variable.equals("title")) {
					String input_newText = scanner.nextLine();
					email.setTitle(input_newText);
				} else {
					System.out.println("Error in variable input");
				}
				System.out.println(email.toString());
				break;
			default:
				System.out.println("Error in first input");
				break;
			}
			
			break;
		case "File":
			String input_8 = scanner.nextLine();
			String input_9 = scanner.nextLine();
			File file = new File(input_8, input_9);
			
			switch (input_1) {
			case "A":
				System.out.println(file.toString());
				break;
			case "B":
				String input_B = scanner.nextLine();
				if (input_9.indexOf(input_B) != -1) System.out.println("true");
				else System.out.println("false");
				break;
			case "C":
				String input_variable = scanner.nextLine();
				if (input_variable.equals("text")) {
					String input_newText = scanner.nextLine();
					file.setText(input_newText);
				} else if (input_variable.equals("pathname")) {
					String input_newText = scanner.nextLine();
					file.setPathname(input_newText);
				} else {
					System.out.println("Error in variable input");
				}
				System.out.println(file.toString());
				break;
			default:
				System.out.println("Error in first input");
				break;
			}
			
			break;
		default:
			System.out.println("Error in second input");
			System.exit(-1);
			break;
		}
		scanner.close();
	}
}
