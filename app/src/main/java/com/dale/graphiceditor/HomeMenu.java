package com.dale.graphiceditor;

import java.awt.Color;

import javax.swing.JPanel;

public class HomeMenu extends JPanel{
	SelectShape selectShape;
	AttributeArea attribute;
	HomeMenu(){
		selectShape = new SelectShape();
		attribute = new AttributeArea();
		
		selectShape.setSize();
		selectShape.setComponents();
		selectShape.setBackground(Color.RED);
		
		attribute.setBackground(Color.GREEN);
		attribute.createAttributeArea();	
		attribute.setSize();
		this.setLayout(null);
		this.add(selectShape);
		this.add(attribute);
	}
	
	public void createHomeMenu() {
		this.setBounds(GraphicEditorFrame.toolsPanelX, GraphicEditorFrame.toolsPanelY, 
				GraphicEditorFrame.toolsPanelWidth,GraphicEditorFrame.toolsPanelHeight);
		System.out.println("1234: "+GraphicEditorFrame.toolsPanelWidth);
	}

}
