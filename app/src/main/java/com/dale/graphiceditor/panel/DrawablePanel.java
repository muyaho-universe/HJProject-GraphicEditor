package com.dale.graphiceditor.panel;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import com.dale.graphiceditor.GraphicEditorFrame;
import com.dale.graphiceditor.SkectchArea;
import com.dale.graphiceditor.buttons.DragPoint;

import java.awt.event.*;

public class DrawablePanel extends JPanel{
	
	private Point dragLocation  = new Point();
	public DrawablePanel() {
		
		this.setBounds(GraphicEditorFrame.drawablePanelX, GraphicEditorFrame.drawablePanelY, GraphicEditorFrame.drawablePanelWidth, GraphicEditorFrame.drawablePanelHeight);
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		this.setMinimumSize(new Dimension(5, 5));
		this.setMaximumSize(new Dimension(GraphicEditorFrame.monitorWidth, GraphicEditorFrame.skectchAreaPanelHeight / 2));	
		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		this.addMouseMotionListener(new MouseMotionAdapter() {
	        @Override
	        public void mouseDragged(MouseEvent e) {
	        	// Buttom Drag
	            if (SkectchArea.bottomDragButton.isDragged()) {
	            	DrawablePanel.this.setPreferredSize(new Dimension(100, 100));
                    
                    dragLocation = e.getPoint();
	            }
	            
	            // Angle Drag
	            if(SkectchArea.angleDragButton.isDragged()) {
	            	if (dragLocation.getX()> getWidth()-10 && dragLocation.getY()>getHeight()-10) {
	            		DrawablePanel.this.setPreferredSize(new Dimension(150, 150));
//	            		DrawablePanel.this.setSize(150, 150);
	                    dragLocation = e.getPoint();
	                }
	            }
	            
	            // Right Drag
	            if(SkectchArea.rightDragButton.isDragged()) {
	            	if (dragLocation.getX()> getWidth()-10 && dragLocation.getY()>getHeight()-10) {
	            		DrawablePanel.this.setPreferredSize(new Dimension(50, 50));
	            		DrawablePanel.this.setSize(50, 50);
//	                    DrawablePanel.this.setSize((int)(getWidth()+(e.getPoint().getX()-dragLocation.getX())), (int)(getHeight()+(e.getPoint().getY()-dragLocation.getY())));
	                    dragLocation = e.getPoint();
	                }
	            }
	        }
		});
	}
}
