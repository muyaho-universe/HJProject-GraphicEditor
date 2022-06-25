package com.dale.graphiceditor.buttons;

import java.awt.Color;

import javax.swing.JButton;

public class ColorSelectButtons extends JButton {
	Color myColor;
	int x, y;
	ColorSelectButtons(int x, int y, int r, int g, int b){
		myColor = new Color(r, g, b);
		
		this.x = x;
		this.y = y;
	}
	
	public void creatButton() {
		this.setBackground(myColor);
		this.setBounds(x, y, 10, 10);
	}
	
	public void setColor(int r, int g, int b) {
		myColor = new Color(r, g, b);
		setBackground(myColor);
	}
	
	public Color getColor() {
		return myColor;
	}
}
