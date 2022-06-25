package com.dale.graphiceditor.buttons;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToggleButton;

import com.dale.graphiceditor.buttons.LineSelectButton.LineSelect;
import com.dale.graphiceditor.mouse.MyMouse;

public class CircleSelectButton extends JToggleButton {
	public CircleSelectButton() {
		super("O");
		Font f = new Font("", Font.BOLD, 30);
		this.setFont(f);
	}
	
	public void setSize() {
		this.setBounds(0, 56, 200, 56);
		this.addActionListener(new CircleSelect());
	}	
		
	class CircleSelect implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			MyMouse.currentMode = "Circle";
		}
	}
}
