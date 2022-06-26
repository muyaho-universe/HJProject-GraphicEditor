package com.dale.graphiceditor.buttons;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import com.dale.graphiceditor.mouse.MyMouse;

public class SecondaryColorButton extends JToggleButton {
	private JPanel secondaryColorPanel;
	private JTextField name;
	private boolean isSelected = false;
	
	public Color secondaryRGBColor = new Color(255, 255, 255);
	public SecondaryColorButton() {
		this.setLayout(new BorderLayout());
		
	}
	
	public void setColor(Color color) {
		secondaryRGBColor = color;
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
		this.addActionListener(new SecondaryColor());
	}	
		
	class SecondaryColor implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			isSelected = true;
			MyMouse.currentColor = secondaryRGBColor;
		}
	}
	
	public boolean isSelected () {
		return isSelected;
	}
	
	public void setUnselected() {
		isSelected = false;
	}
	
	
}
