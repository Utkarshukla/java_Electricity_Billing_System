package com.electricityBill;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JButton b1;
	JLabel l1;
	Font f, f1, f2;
	TextArea t1;
	String s;

	public About() {
        setLocationRelativeTo(null);
		setLayout(null);
		JButton b1 = new JButton("Close");
		add(b1);
		b1.setBounds(150, 250, 100, 30);
		b1.addActionListener(this);
		
		Font f = new Font("Ralway", Font.BOLD, 20);
		setFont(f);
		
		s = "Electricity Bill Management System\n" 
		+ "Version 1.0\n" + "Developed by Utkarsh Shukla\n"
		+ "Contact: shuklautkarsh742@gmail.com\n" 
		+ "This application helps manage electricity bills efficiently.\n"
		+ "For more information, visit our website https://utkarshukla.github.io .";
		
		TextArea t1 = new TextArea(s, 10, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
		t1.setEditable(false);
		t1.setBounds(20, 20, 350, 200);
		add(t1);
		
		Font f1 = new Font("Ralway", Font.BOLD, 18);
		
		t1=new TextArea();
		JLabel l1 = new JLabel("About");
		add(l1);
		l1.setBounds(150, 10, 100, 30);
		l1.setForeground(java.awt.Color.BLUE);
		
		Font f2 = new Font("Ralway", Font.BOLD, 16);
		l1.setFont(f2);
		
		// setBounds(100, 100, 400, 350);
        setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new About().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
	}

}
