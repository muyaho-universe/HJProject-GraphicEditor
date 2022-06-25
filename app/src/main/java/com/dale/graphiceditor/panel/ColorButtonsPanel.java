package com.dale.graphiceditor.panel;

import javax.swing.*;

import com.dale.graphiceditor.GraphicEditorFrame;
import com.dale.graphiceditor.buttons.*;

public class ColorButtonsPanel extends JPanel{
	PrimaryColorButton primaryColor;
	SecondaryColorButton secondaryColor;
	ColorSelectPanel colorSelectPanel;
	
	public ColorButtonsPanel(){
		this.setLayout(null);
	}
	
	public void setComponents() {
		primaryColor = new PrimaryColorButton();
		secondaryColor = new SecondaryColorButton();
		colorSelectPanel = new ColorSelectPanel();
		
		primaryColor.setSize();
		secondaryColor.setSize();
		colorSelectPanel.setSize();
		colorSelectPanel.createPanel();
		
		this.add(primaryColor);
		this.add(secondaryColor);
		this.add(colorSelectPanel);	
	}
	public void setSize() {
		this.setBounds(0, 0,
				120, 115);
	}
}
