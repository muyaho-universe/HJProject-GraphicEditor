package com.dale.graphiceditor.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StrokeSelectButton extends JButton {
	
	
	public StrokeSelectButton() {
		super("º±±Ω±‚ º±≈√");
		
	}
	
	public void createButton() {
		this.addActionListener(new StrokeSelectListener());
		
	}
	
	class StrokeSelectListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
	}
	
	public void setSize() {
		this.setBounds(0, 0, 100, 162);
	}
}
