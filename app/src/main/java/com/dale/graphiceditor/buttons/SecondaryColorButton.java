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
		name.setText("��\n2");
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
			MyMouse.currentColor = secondaryRGBColor;
		}
	}
	
	
}
