package com.dale.graphiceditor;

import java.awt.Color;

import javax.swing.JPanel;

import com.dale.graphiceditor.panel.*;

public class AttributeArea extends JPanel {
	ColorButtonsPanel colorButtonsPanel;
	AttributeArea(){
		this.setLayout(null);
		
	}
	
	public void createAttributeArea() {
		colorButtonsPanel = new ColorButtonsPanel();
		
	}
	
	public void setSize() {
		this.setBounds(GraphicEditorFrame.attributesPanelX , GraphicEditorFrame.attributesPanelY,
				GraphicEditorFrame.attributesPanelWidth  , GraphicEditorFrame.attributesPanelHeight);
	}
}
