package com.dale.graphiceditor.buttons;

import com.dale.graphiceditor.GraphicEditorFrame;

public class RightDragButton extends DragPoint {
	
	
	public RightDragButton(String name){
		super(name);
		super.setX(GraphicEditorFrame.drawablePanelWidth);
		super.setY(GraphicEditorFrame.drawablePanelHeight / 2);
    	this.setBounds(super.getX(),super.getY(), 40, 40);
	}
	
}
