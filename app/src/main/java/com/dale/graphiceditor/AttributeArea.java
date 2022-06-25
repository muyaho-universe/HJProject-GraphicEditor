package com.dale.graphiceditor;

import java.awt.Color;

import javax.swing.JPanel;

import com.dale.graphiceditor.panel.*;

public class AttributeArea extends JPanel {
	ColorButtonsPanel colorButtonsPanel;
	ColorSelectPanel colorSelectPanel;
	ColorEditPanel colorEditPanel;
		
	AttributeArea(){
		this.setLayout(null);
	}
	
	public void createAttributeArea() {
		colorButtonsPanel = new ColorButtonsPanel();
		colorSelectPanel = new ColorSelectPanel();
		colorEditPanel = new ColorEditPanel();
				
		colorButtonsPanel.setComponents();
		colorButtonsPanel.setSize();
		
		colorSelectPanel.createPanel();
		colorSelectPanel.setSize();
		
		colorEditPanel.createPanel();
		colorEditPanel.setSize();
		colorEditPanel.setBackground(Color.DARK_GRAY);
		
		
		this.add(colorSelectPanel);
		this.add(colorButtonsPanel);
		this.add(colorEditPanel);
	}
	
	public void setSize() {
		this.setBounds(GraphicEditorFrame.attributesPanelX+130 , GraphicEditorFrame.attributesPanelY,
				GraphicEditorFrame.attributesPanelWidth +130 , GraphicEditorFrame.attributesPanelHeight);
		System.out.println(GraphicEditorFrame.attributesPanelWidth  +" "+ GraphicEditorFrame.attributesPanelHeight);
	}
}
