package demo;

import java.util.Scanner;

public class Demo3 {
	public static void main(String args[]) {
		// Input from keyboard (stdin)
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println("You input " + input.length() + " characters.");
	}
}