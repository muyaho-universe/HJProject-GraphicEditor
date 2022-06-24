package com.dale.graphiceditor.buttons;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JButton;

import com.dale.graphiceditor.GraphicEditorFrame;

public class AngleDragButton extends DragPoint {
	public AngleDragButton(String name){
		super(name);
		super.setX(GraphicEditorFrame.drawablePanelWidth);
		super.setY(GraphicEditorFrame.drawablePanelHeight);
    	this.setBounds(super.getX() - 15, super.getY()- 15, 10, 10);
	}
}
