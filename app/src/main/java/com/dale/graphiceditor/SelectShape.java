package com.dale.graphiceditor;

import java.awt.*;

import javax.swing.*;

import com.dale.graphiceditor.buttons.*;

public class SelectShape extends JPanel {
	
	public void createSelectShape() {
		GridLayout layout = new GridLayout(2, 2);
		this.setLayout(layout);
	}
	
	public void setSize() {
		this.setBounds(GraphicEditorFrame.selectShapePanelX, 
				GraphicEditorFrame.selectShapePanelY, GraphicEditorFrame.selectShapePanelWidth, GraphicEditorFrame.selectShapePanelHeight);
	}
	
	public void setComponents() {
		CircleSelectButton circleSelect = new CircleSelectButton();
		QuadrangleSelectButton quadrangleSelect = new QuadrangleSelectButton();
		LineSelectButton lineSelect = new LineSelectButton();
		PolylineSelectButton polyLine = new PolylineSelectButton();
		
		circleSelect.setBackground(new Color(123, 123, 132));
		quadrangleSelect.setBackground(new Color(0, 123, 132));
		lineSelect.setBackground(new Color(123, 123, 0));
		polyLine.setBackground(new Color(123, 0, 132));
		
		circleSelect.setSize();
		quadrangleSelect.setSize();
		lineSelect.setSize();
		polyLine.setSize();
		
		this.add(circleSelect);
		this.add(quadrangleSelect);
		this.add(lineSelect);
		this.add(polyLine);
	}
}
