package com.dale.graphiceditor.buttons;

import java.awt.Dimension;

import javax.swing.*;

public class LineSelectButton extends JToggleButton{
	public LineSelectButton() {
		super("/");
	}
	
	public void setSize() {
		this.setBounds(0, 0, 200, 56);
	}
}
