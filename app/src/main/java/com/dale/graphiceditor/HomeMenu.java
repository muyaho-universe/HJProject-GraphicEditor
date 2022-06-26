package com.dale.graphiceditor;

import java.awt.Color;

import javax.swing.JPanel;

import com.dale.graphiceditor.panel.DrawablePanel;
import com.dale.graphiceditor.panel.StrokePanel;

public class HomeMenu extends JPanel{
	SelectShape selectShape;
	AttributeArea attribute;
	StrokePanel strokePanel;
	
	HomeMenu(){
		selectShape = new SelectShape();
		attribute = new AttributeArea();
		strokePanel = new StrokePanel();
		
		selectShape.setSize();
		selectShape.setComponents();
		selectShape.createSelectShape();
//		selectShape.setBackground(Color.RED);
		
		attribute.setBackground(Color.GREEN);
		attribute.createAttributeArea();	
		attribute.setSize();
		
		strokePanel.createPanel();
		
		this.add(strokePanel);
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
