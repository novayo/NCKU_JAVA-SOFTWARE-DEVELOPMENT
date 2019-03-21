package com.demo.utils;

import java.util.Random;

public class RandomPractice {
	public void Beep() {
		Random genRandom = new Random();
		for (int i=0; i<100; i++) {
			int x = genRandom.nextInt(40);
			System.out.println(x);
		}
	}
}
