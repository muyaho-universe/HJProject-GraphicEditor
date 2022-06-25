package com.dale.graphiceditor.buttons;

import java.awt.Color;

import javax.swing.JButton;

public class SecondaryColorButton extends JButton {
	public Color secondaryRGBColor = new Color(0, 0, 0);
	public SecondaryColorButton() {
		super("»ö\n2");
	}
	
	public void setColor(int r, int g, int b) {
		secondaryRGBColor = new Color(r, g, b);
	}
	
	public Color getColor() {
		return secondaryRGBColor;
	}
	
	private void setBackground() {
		this.setBackground(secondaryRGBColor);
	}
	
	public void setSize() {
		this.setBounds(60, 2, 60, 115);
	}
}
