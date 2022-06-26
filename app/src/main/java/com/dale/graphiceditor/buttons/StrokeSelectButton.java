package com.dale.graphiceditor.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.dale.graphiceditor.frame.StrokeSelectFrame;

public class StrokeSelectButton extends JButton {
	StrokeSelectFrame strokeSelectFrame;
	
	public StrokeSelectButton() {
		super("º±±Ω±‚ º±≈√");
		
	}
	
	public void createButton() {
		this.addActionListener(new StrokeSelectListener());
		
	}
	
	class StrokeSelectListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			strokeSelectFrame = new StrokeSelectFrame(true);
			
		}
	}
	
	public void setSize() {
		this.setBounds(0, 0, 100, 162);
	}
}
