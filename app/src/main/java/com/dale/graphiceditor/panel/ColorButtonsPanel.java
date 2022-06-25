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
		
		this.add(primaryColor);
		this.add(secondaryColor);
		this.add(colorSelectPanel);	
	}
	public void setSize() {
		this.setBounds(GraphicEditorFrame.attributesPanelX + 80, GraphicEditorFrame.attributesPanelY,
				GraphicEditorFrame.attributesPanelWidth - 70, GraphicEditorFrame.attributesPanelHeight);
	}
}
