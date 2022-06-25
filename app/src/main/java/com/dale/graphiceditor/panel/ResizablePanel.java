package com.dale.graphiceditor.panel;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import com.dale.graphiceditor.GraphicEditorFrame;
import com.dale.graphiceditor.SkectchArea;
import com.dale.graphiceditor.buttons.*;

import java.awt.event.*;


public class ResizablePanel extends JPanel {
	
	private int width, height;
	private Point dragLocation  = new Point();
	
	public  ResizablePanel() {
		
		width = this.getWidth();
		height = this.getHeight();
		this.setLayout(null);
		
	}
	public void setSize() {
		this.setBounds(0, 0, GraphicEditorFrame.skectchAreaPanelWidth, GraphicEditorFrame.skectchAreaPanelHeight- 50);
	}
	
	public void makeItResizable() {
		this.addMouseMotionListener(new MouseMotionAdapter() {
	        @Override
	        public void mouseDragged(MouseEvent e) {
	        	// Buttom Drag
	            if (SkectchArea.bottomDragButton.isDragged()) {
	            	ResizablePanel.this.setPreferredSize(new Dimension(100, 100));
                    
                    dragLocation = e.getPoint();
	            }
	            
	            // Angle Drag
	            if(SkectchArea.angleDragButton.isDragged()) {
	            	if (dragLocation.getX()> getWidth()-10 && dragLocation.getY()>getHeight()-10) {
	            		ResizablePanel.this.setPreferredSize(new Dimension(150, 150));
	            		ResizablePanel.this.setSize(150, 150);
	                    dragLocation = e.getPoint();
	                }
	            }
	            
	            // Right Drag
	            if(SkectchArea.rightDragButton.isDragged()) {
	            	if (dragLocation.getX()> getWidth()-10 && dragLocation.getY()>getHeight()-10) {
//	            		ResizablePanel.this.setPreferredSize(new Dimension(50, 50));
//	            		ResizablePanel.this.setSize(50, 50);
	            		ResizablePanel.this.setSize((int)(getWidth()+(e.getPoint().getX()-dragLocation.getX())), (int)(getHeight()+(e.getPoint().getY()-dragLocation.getY())));
	                    dragLocation = e.getPoint();
	                }
	            }
	        }
		});
	}
}
