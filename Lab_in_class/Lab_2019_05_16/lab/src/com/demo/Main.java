package com.demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.demo.utils.MyButtonListener;
import com.demo.utils.MyMenuButton;

public class Main {
	public static JFrame frame = new JFrame("Lab in class");
	public static MyButtonListener endButtonListener = new MyButtonListener();
	public static JButton endButton = new JButton("Click to end program.");
	public static JLabel lbJLabel = new JLabel("Hello World");
	public static JButton btn1 = new JButton("Click me!"); 
	public static JButton btn2 = new JButton("Click me!");
	public static JPanel panel = new JPanel(); 
	public static JMenu diner = new JMenu("Menu");
	public static JMenuItem item1 = new JMenuItem("MenuItem1"); 
	public static JMenuItem item2 = new JMenuItem("MenuItem2"); 
	public static JMenuBar bar = new JMenuBar();
	public static JTextField inpuTextField = new JTextField(50);
	
	public static void main(String[] args) {
		frame.setSize(800, 600); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// set button
		endButton.addActionListener(endButtonListener);
		endButton.setVisible(true);
		endButton.setSize(400, 300);
		endButton.setLocation(200, 150);
		
		// set label
		lbJLabel.setSize(100, 100);
		lbJLabel.setLocation(350, 0);
		
		// set panel
		panel.setSize(200,200); 
		panel.setLayout(new GridLayout()); 
		panel.add(btn1);
		panel.add(btn2);
		
		// set Menu bar
		item1.addActionListener(new MyMenuButton()); 
		item2.addActionListener(new MyMenuButton()); 
		diner.add(item1);
		diner.add(item2);
		bar.add(diner);
		
		// set Background
		frame.getContentPane().setBackground(Color.PINK);
		
		// set text field
		inpuTextField.setLocation(100, 100);
		inpuTextField.setSize(inpuTextField.getPreferredSize());
		inpuTextField.setText("<Input your name here>");
		
		
		frame.setLayout(null);
		frame.add(inpuTextField);
		frame.setJMenuBar(bar);
		frame.add(panel);
		frame.add(endButton);
		frame.add(lbJLabel);
		
		frame.setVisible(true); // 這個放在最後面比較好
		
		for(int i=0;i<300;i++){
			panel.setLocation(i, i);
			try{ 
				Thread.sleep(100);
			}catch(Exception e){ 
				e.printStackTrace();
			}
		}
	}
}
