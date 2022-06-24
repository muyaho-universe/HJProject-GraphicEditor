package com.dale.graphiceditor;

import java.awt.Color;

import javax.swing.JPanel;

import com.dale.graphiceditor.buttons.*;
import com.dale.graphiceditor.menubar.MenuBar;

public class AdditionalFunctions extends JPanel {
	public MenuBar menuBar;
	AdditionalFunctions(){
		setLayout(null);
		setBackground(Color.BLACK);
	}
	
	public void setSize() {
		setBounds(0, GraphicEditorFrame.additionalFunctionPanelHeight / 2, GraphicEditorFrame.additionalFunctionPanelWidth- 100, GraphicEditorFrame.additionalFunctionPanelHeight / 2);
	}
	public void setDoButtons() {
		RedoButton redo = new RedoButton();
		UndoButton undo = new UndoButton();
		this.add(redo);
		this.add(undo);
	}
	
	public void setMenuBar() {
		menuBar = new MenuBar();
		menuBar.createMenuBar();
		this.add(menuBar);
	}
}
