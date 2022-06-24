package com.dale.graphiceditor.panel;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import com.dale.graphiceditor.GraphicEditorFrame;
import com.dale.graphiceditor.buttons.*;

import java.awt.event.*;


public class ResizablePanel extends JPanel {
	
	private int width, height;
	
	public  ResizablePanel() {
		this.setBounds(0, 0, GraphicEditorFrame.skectchAreaPanelWidth, GraphicEditorFrame.skectchAreaPanelHeight- 50);
		width = this.getWidth();
		height = this.getHeight();
		this.setLayout(null);
		this.setBackground(Color.PINK);
	}
}
