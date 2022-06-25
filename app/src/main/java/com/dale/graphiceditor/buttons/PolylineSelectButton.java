package com.dale.graphiceditor.buttons;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JToggleButton;

public class PolylineSelectButton extends JToggleButton {
	public PolylineSelectButton() {
		super("Z");
	}
	public void setSize() {
		this.setBounds(200, 56, 200, 56);
	}
}
