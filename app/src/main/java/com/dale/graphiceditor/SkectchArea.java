package com.dale.graphiceditor;

import java.awt.Color;

import javax.swing.*;

import com.dale.graphiceditor.buttons.AngleDragButton;
import com.dale.graphiceditor.buttons.BottomDragButton;
import com.dale.graphiceditor.buttons.RightDragButton;
import com.dale.graphiceditor.panel.DrawablePanel;
import com.dale.graphiceditor.panel.ResizablePanel;

@SuppressWarnings("serial")
public class SkectchArea extends JPanel {
	public static BottomDragButton bottomDragButton = new BottomDragButton("bottom");
	public static AngleDragButton angleDragButton = new AngleDragButton("angle");
	public static RightDragButton rightDragButton = new RightDragButton("right");	
	
	public SkectchArea() {
		
		ResizablePanel skectchAreaPanel =  new ResizablePanel();
		DrawablePanel drawablePanel =  new DrawablePanel();
		//START POINT: setting skectchAreaPanel GraphicEditorFrame.skectchAreaPanelX, GraphicEditorFrame.skectchAreaPanelY
		
		System.out.println(GraphicEditorFrame.skectchAreaPanelX+" "+ GraphicEditorFrame.skectchAreaPanelY+" "+ 
				GraphicEditorFrame.skectchAreaPanelWidth+" "+ GraphicEditorFrame.skectchAreaPanelHeight);
		skectchAreaPanel.add(bottomDragButton);
		skectchAreaPanel.add(angleDragButton);
		skectchAreaPanel.add(rightDragButton);
		skectchAreaPanel.add(drawablePanel);
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
