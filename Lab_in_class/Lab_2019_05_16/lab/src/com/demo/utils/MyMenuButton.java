package com.demo.utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.demo.Main;

public class MyMenuButton implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("MenuItem1")) {
			System.out.println("You pressed menuitem1");
			System.out.println(Main.inpuTextField.getText());
		} else if (command.equals("MenuItem2")) {
			System.out.println("You pressed menuitem2");
		}
		
	}

}
