package com.dale.graphiceditor.buttons;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import com.dale.graphiceditor.buttons.SecondaryColorButton.SecondaryColor;
import com.dale.graphiceditor.mouse.MyMouse;

public class PrimaryColorButton extends JToggleButton {
	private JPanel primaryColorPanel;
	private JTextField name;
	public Color primaryRGBColor = new Color(0, 0, 0);
	public PrimaryColorButton(String text, boolean selected) {
		super(text, selected);
		this.setLayout(new BorderLayout());
	}
	
	public void setColor(int r, int g, int b) {
		primaryRGBColor = new Color(r, g, b);
		this.setBackground();
	}
	
	public Color getColor() {
		return primaryRGBColor;
	}
	
	private void setBackground() {
		this.setBackground(primaryRGBColor);
	}
	
	public void setSize() {
		this.setBounds(2, 2, 60, 115);
//		this.setBackground();
	}
	
	public void createPrimary() {
		primaryColorPanel = new JPanel();
		name = new JTextField();
		name.setText("��\n1");
		name.setEditable(false);
		name.setEnabled(false);
		primaryColorPanel.setBackground(primaryRGBColor);
		this.add(primaryColorPanel, BorderLayout.CENTER);
		this.add(name, BorderLayout.SOUTH);
		this.addActionListener(new SecondaryColor());
	}	
		
	class SecondaryColor implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			MyMouse.currentColor = primaryRGBColor;
		}
	}
}
