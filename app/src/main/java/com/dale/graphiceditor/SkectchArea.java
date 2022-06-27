package com.dale.graphiceditor;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.awt.image.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.dale.graphiceditor.buttons.AngleDragButton;
import com.dale.graphiceditor.buttons.BottomDragButton;
import com.dale.graphiceditor.buttons.RightDragButton;
import com.dale.graphiceditor.datapart.MyDatas;
import com.dale.graphiceditor.panel.DrawablePanel;
import com.dale.graphiceditor.panel.ResizablePanel;

@SuppressWarnings("serial")
public class SkectchArea extends JPanel  {
	
	
	public SkectchArea() {
		
		ResizablePanel skectchAreaPanel =  new ResizablePanel();
	
		//START POINT: setting skectchAreaPanel GraphicEditorFrame.skectchAreaPanelX, GraphicEditorFrame.skectchAreaPanelY
		
		System.out.println(GraphicEditorFrame.skectchAreaPanelX+" "+ GraphicEditorFrame.skectchAreaPanelY+" "+ 
				GraphicEditorFrame.skectchAreaPanelWidth+" "+ GraphicEditorFrame.skectchAreaPanelHeight);
		skectchAreaPanel.makeItResizable();
		
		skectchAreaPanel.setSize();
		
		
		
		skectchAreaPanel.setBackground(Color.BLUE);
		this.add(skectchAreaPanel);
		this.setBackground(Color.CYAN);
		
		this.setLayout(null);
		
		//END POINT
	}
	public void setSize() {
		this.setBounds(GraphicEditorFrame.skectchAreaPanelX, GraphicEditorFrame.skectchAreaPanelY,
				GraphicEditorFrame.skectchAreaPanelWidth, GraphicEditorFrame.skectchAreaPanelHeight);
	}
	
	
}
