package com.dale.graphiceditor.buttons;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.dale.graphiceditor.buttons.CircleSelectButton.CircleSelect;
import com.dale.graphiceditor.mouse.MyMouse;

public class QuadrangleSelectButton extends JToggleButton {
	public QuadrangleSelectButton() {
		super("бр");
		Font f = new Font("", Font.BOLD, 30);
		this.setFont(f);
	}
	public void setSize() {
		this.setBounds(200, 0, 200, 56);
		this.addActionListener(new QuadrangleSelect());
	}	
		
	class QuadrangleSelect implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			MyMouse.currentMode = "Quadrangle";
		}
	}
}
