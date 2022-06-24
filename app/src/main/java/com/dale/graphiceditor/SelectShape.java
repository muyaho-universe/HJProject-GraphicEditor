package com.dale.graphiceditor;

import java.awt.*;

import javax.swing.*;

import com.dale.graphiceditor.buttons.*;

public class SelectShape extends HomeMenu {
	
	public void createSelectShape() {
		CircleSelectButton circleSelect = new CircleSelectButton();
		QuadrangleSelectButton quadrangleSelect = new QuadrangleSelectButton();
		LineSelectButton lineSelect = new LineSelectButton();
		PolylineSelectButton polyLine = new PolylineSelectButton();
		
		add(circleSelect);
		add(quadrangleSelect);
		add(lineSelect);
		add(polyLine);
		GridLayout layout = new GridLayout(2,2);
		setLayout(layout);
	}
	
	public void setSize() {
		this.setBounds(GraphicEditorFrame.selectShapePanelX, 
				GraphicEditorFrame.selectShapePanelY, GraphicEditorFrame.selectShapePanelWidth, GraphicEditorFrame.selectShapePanelHeight);
	}
}
