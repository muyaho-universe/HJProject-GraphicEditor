package com.dale.graphiceditor.buttons;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JButton;

import com.dale.graphiceditor.GraphicEditorFrame;

public class BottomDragButton extends DragPoint{
		
	public BottomDragButton(String name){
		super(name);
		super.setX(GraphicEditorFrame.drawablePanelWidth/2);
		super.setY(GraphicEditorFrame.drawablePanelHeight);
    	this.setBounds(super.getX()- 15, super.getY() - 5, 10, 10);
	}

}
