package com.dale.graphiceditor;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import com.dale.graphiceditor.buttons.*;
import com.dale.graphiceditor.menubar.MenuBar;

public class AdditionalFunctions extends JPanel {
	public MenuBar menuBar;
	AdditionalFunctions(){
		setLayout(new FlowLayout());
//		setBackground(Color.BLACK);
	}
	
	public void setSize() {
		setBounds(0, 0 , GraphicEditorFrame.additionalFunctionPanelWidth, GraphicEditorFrame.additionalFunctionPanelHeight);
	}
	
	
	public void setMenuBar() {
		menuBar = new MenuBar();
		menuBar.createMenuBar();
		this.add(menuBar);
	}
}
