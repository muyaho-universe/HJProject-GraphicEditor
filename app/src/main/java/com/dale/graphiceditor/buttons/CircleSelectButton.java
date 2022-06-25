package com.dale.graphiceditor.buttons;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JToggleButton;

public class CircleSelectButton extends JToggleButton {
	public CircleSelectButton() {
		super("¡Û");
	}
	
	public void setSize() {
		this.setBounds(0, 56, 200, 56);
	}
}
