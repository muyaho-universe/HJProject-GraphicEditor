package com.dale.graphiceditor.panel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.dale.graphiceditor.GraphicEditorFrame;
import com.dale.graphiceditor.buttons.*;
import com.dale.graphiceditor.mouse.MyMouse;

public class ColorEditPanel extends JPanel {
	public boolean hasMouse = false;
	ColorChooserCallButton colorChooserCall;

	public void createPanel() {
//		ImageIcon img = new ImageIcon("./assets/color_picker.png");
		colorChooserCall = new ColorChooserCallButton("»ö ÆíÁý");
		
		
		colorChooserCall.setSize();
		this.setLayout(null);
		this.add(colorChooserCall);
	}
	public void setSize() {
		this.setBounds(400, 0, 129, GraphicEditorFrame.attributesPanelHeight);
	}
	
	
	
	public JButton getColorChooser() {
		return colorChooserCall;
	}
}
