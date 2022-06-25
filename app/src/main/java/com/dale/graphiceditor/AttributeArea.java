package com.dale.graphiceditor;

import java.awt.Color;

import javax.swing.JPanel;

public class AttributeArea extends JPanel {
	AttributeArea(){
		this.setLayout(null);
		
	}
	
	public void setSize() {
		this.setBounds(GraphicEditorFrame.attributesPanelX, GraphicEditorFrame.attributesPanelY,
				GraphicEditorFrame.attributesPanelWidth, GraphicEditorFrame.attributesPanelHeight);
	}
}
