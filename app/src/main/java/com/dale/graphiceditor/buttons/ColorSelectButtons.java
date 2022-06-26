package com.dale.graphiceditor.buttons;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JToggleButton;

public class ColorSelectButtons extends JToggleButton {
	Color myColor;
	int x, y;
	public ColorSelectButtons(int x, int y, int r, int g, int b){
		myColor = new Color(r, g, b);
		System.out.println(myColor);
		this.x = x;
		this.y = y;
	}
	
	public void creatButton() {
		this.setBackground(myColor);
		this.setBounds(x+25, y, 25, 25);
	}
	
	public void setColor(int r, int g, int b) {
		myColor = new Color(r, g, b);
		setBackground(myColor);
	}
	
	public Color getColor() {
		return myColor;
	}
}
