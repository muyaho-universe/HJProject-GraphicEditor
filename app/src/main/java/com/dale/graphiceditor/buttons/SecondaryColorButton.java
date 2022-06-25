package com.dale.graphiceditor.buttons;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SecondaryColorButton extends JButton {
	private JPanel secondaryColorPanel;
	private JTextField name;
	public Color secondaryRGBColor = new Color(255, 255, 255);
	public SecondaryColorButton() {
		this.setLayout(new BorderLayout());
		
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
	public void createSecondary() {
		secondaryColorPanel = new JPanel();
		name = new JTextField();
		name.setText("»ö\n2");
		name.setEditable(false);
		name.setEnabled(false);
		secondaryColorPanel.setBackground(secondaryRGBColor);
		this.add(secondaryColorPanel, BorderLayout.CENTER);
		this.add(name, BorderLayout.SOUTH);
		
	}
}
