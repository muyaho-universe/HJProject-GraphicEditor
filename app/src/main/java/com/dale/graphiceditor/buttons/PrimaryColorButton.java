package com.dale.graphiceditor.buttons;

import java.awt.Color;

import javax.swing.JButton;

public class PrimaryColorButton extends JButton {
	public Color primaryRGBColor = new Color(0, 0, 0);
	public PrimaryColorButton() {
		super("»ö\n1");
	}
	
	public void setColor(int r, int g, int b) {
		primaryRGBColor = new Color(r, g, b);
	}
	
	public Color getColor() {
		return primaryRGBColor;
	}
	
	private void setBackground() {
		this.setBackground(primaryRGBColor);
	}
	
	public void setSize() {
		this.setBounds(2, 2, 60, 115);
	}
}
