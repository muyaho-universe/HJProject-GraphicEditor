package com.dale.graphiceditor.panel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.dale.graphiceditor.GraphicEditorFrame;

public class ColorEditPanel extends JPanel {
	public boolean hasMouse = false;
	JColorChooser colorChooser = new JColorChooser();

	public void createPanel() {
		
	}
	public void setSize() {
		this.setBounds(540, 0, 70, GraphicEditorFrame.attributesPanelHeight);
	}
	
}
