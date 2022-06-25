package com.dale.graphiceditor.panel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.dale.graphiceditor.GraphicEditorFrame;
import com.dale.graphiceditor.buttons.*;

public class ColorEditPanel extends JPanel {
	public boolean hasMouse = false;
	ColorChooserCallButton colorChooserCall;

	public void createPanel() {
//		ImageIcon img = new ImageIcon("./assets/color_picker.png");
		colorChooserCall = new ColorChooserCallButton("»ö ÆíÁý");
		colorChooserCall.createButton();
		colorChooserCall.setSize();
		this.setLayout(null);
		this.add(colorChooserCall);
	}
	public void setSize() {
		this.setBounds(400, 0, 129, GraphicEditorFrame.attributesPanelHeight);
	}
	
}
