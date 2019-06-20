package com.demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String args1 = scanner.nextLine();
		
		
		char firstInputString = args1.charAt(0);
		String indexString = args1.substring(2);
		
		int index = Integer.parseInt(indexString);
		
		if (firstInputString == 'X') {
			while(index % 5==0) index/=5;
			while(index % 3==0) index/=3;
			while(index % 2==0) index/=2;
			if (index == 1) System.out.println("true");
			else System.out.println("false");
		} else if (firstInputString == 'Y' && index > 1){
			long ans = 2;
			for (long i=1; i<index; i++) {
				long tmpans = ans;
				while(tmpans % 5==0) tmpans/=5;
				while(tmpans % 3==0) tmpans/=3;
				while(tmpans % 2==0) tmpans/=2;
				if (tmpans != 1) i--;
				ans++;
			}
			System.out.println(ans-1);
		} else {
			System.out.println(1);
		}
	}
}
