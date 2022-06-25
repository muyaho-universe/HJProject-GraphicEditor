package com.dale.graphiceditor;

import java.awt.*;

import javax.swing.*;

import com.dale.graphiceditor.buttons.*;

public class SelectShape extends JPanel {
	Container container;
	ButtonGroup buttonGroup;
	CircleSelectButton circleSelect;
	QuadrangleSelectButton quadrangleSelect;
	LineSelectButton lineSelect;
	PolylineSelectButton polyLine;
	
	public void createSelectShape() {
		GridLayout layout = new GridLayout(2, 2);
		this.setLayout(null);
	}
	
	public void setSize() {
		this.setBounds(GraphicEditorFrame.selectShapePanelX, 
				GraphicEditorFrame.selectShapePanelY, GraphicEditorFrame.selectShapePanelWidth, GraphicEditorFrame.selectShapePanelHeight);
	}
	
	public void setComponents() {
		buttonGroup = new ButtonGroup();
		container = new Container();
		
		circleSelect = new CircleSelectButton();
		quadrangleSelect = new QuadrangleSelectButton();
		lineSelect = new LineSelectButton("/", true);
		polyLine = new PolylineSelectButton();
		
		circleSelect.setBackground(new Color(123, 123, 132));
		quadrangleSelect.setBackground(new Color(0, 123, 132));
		lineSelect.setBackground(new Color(123, 123, 0));
		polyLine.setBackground(new Color(123, 0, 132));
		
		circleSelect.setSize();
		quadrangleSelect.setSize();
		lineSelect.setSize();
		polyLine.setSize();
		
		buttonGroup.add(circleSelect);
		buttonGroup.add(quadrangleSelect);
		buttonGroup.add(lineSelect);
		buttonGroup.add(polyLine);
		
		container.add(polyLine);
		container.add(circleSelect);
		container.add(quadrangleSelect);
		container.add(lineSelect);
		container.setBounds(0, 0, 560, 163);
		
		this.add(container);
	}
}
