package com.demo.utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonListener implements ActionListener{

	public void actionPerformed(ActionEvent e) { // 當button按下之後，會由這個listener去監聽，而會自動去呼叫這個method
		System.out.println(e.getActionCommand()); // 回傳設定的文字
		System.out.println(e.getSource());
		System.exit(0);
	}

}
