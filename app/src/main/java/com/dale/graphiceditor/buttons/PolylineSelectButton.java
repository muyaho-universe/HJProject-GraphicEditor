package com.dale.graphiceditor.buttons;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToggleButton;

import com.dale.graphiceditor.buttons.CircleSelectButton.CircleSelect;
import com.dale.graphiceditor.mouse.MyMouse;

public class PolylineSelectButton extends JToggleButton {
	public PolylineSelectButton() {
		super("Z");
		Font f = new Font("", Font.BOLD, 30);
		this.setFont(f);
	}
	public void setSize() {
		this.setBounds(200, 56, 200, 56);
		this.addActionListener(new PolylineSelect());
	}	
		
	class PolylineSelect implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			MyMouse.currentMode = "Polyline";
		}
	}
}
