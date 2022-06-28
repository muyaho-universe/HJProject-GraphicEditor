package com.dale.graphiceditor.panel;

import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

import com.dale.graphiceditor.GraphicEditorFrame;
import com.dale.graphiceditor.buttons.*;

public class ColorButtonsPanel extends JPanel{
	PrimaryColorButton primaryColor;
	SecondaryColorButton secondaryColor;
	ColorSelectPanel colorSelectPanel;
	ButtonGroup buttonGroup;
	Container container;
	public ColorButtonsPanel(){
		this.setLayout(null);
	}
	
	public void setComponents() {
		primaryColor = new PrimaryColorButton("»ö1");
		secondaryColor = new SecondaryColorButton();
		colorSelectPanel = new ColorSelectPanel();
		buttonGroup = new ButtonGroup();
		container = new Container();
		
		primaryColor.setSize();
		primaryColor.createPrimary();
		secondaryColor.setSize();
		secondaryColor.createSecondary();
		colorSelectPanel.setSize();
		colorSelectPanel.createPanel();
		buttonGroup.add(primaryColor);
//		buttonGroup.add(secondaryColor);
		container.add(primaryColor);
//		container.add(secondaryColor);
		container.setBounds(0, 0, 200, 200);
		this.add(container);
		
//		this.add(colorSelectPanel);	
	}
	public void setSize() {
		this.setBounds(0, 0,
				120, 115);
	}
	
	
	public void setSecondaryRGB(Color color) {
		secondaryColor.setColor(color);
	}
	
	public void setPrimaryRGB(Color color) {
		primaryColor.setColor(color);
	}
	
	public PrimaryColorButton getPrimaryColor() {
		return primaryColor;
	}
	
	public SecondaryColorButton getSecondaryColor() {
		return secondaryColor;
	}
	public JToggleButton getSelectedButton() {
		if(primaryColor.isSelected()) {
			return primaryColor;
		}
		else {
			return secondaryColor;
		}
	}
}
