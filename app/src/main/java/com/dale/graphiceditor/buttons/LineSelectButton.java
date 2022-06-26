package com.dale.graphiceditor.buttons;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


import com.dale.graphiceditor.mouse.MyMouse;

public class LineSelectButton extends JToggleButton{
	
	public LineSelectButton(String name, boolean selected) {
		super("/", selected);
		Font f = new Font("", Font.BOLD, 30);
		this.setFont(f);
	}
	
	public void setSize() {
		this.setBounds(0, 0, 200, 56);
		this.addActionListener(new LineSelect());
	}	
		
	class LineSelect implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			MyMouse.currentMode = "Line";
		}
	}
}
