package com.dale.graphiceditor.panel;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeEvent;

import com.dale.graphiceditor.GraphicEditorFrame;
import com.dale.graphiceditor.SkectchArea;
import com.dale.graphiceditor.buttons.*;

import java.awt.event.*;


public class ResizablePanel extends JPanel {
	public BottomDragButton bottomDragButton = new BottomDragButton("bottom");
	public AngleDragButton angleDragButton = new AngleDragButton("angle");
	public RightDragButton rightDragButton = new RightDragButton("right");	
	private int width, height;
	private Point dragLocation  = new Point();
	DrawablePanel drawablePanel;
	public  ResizablePanel() {
		
		width = this.getWidth();
		height = this.getHeight();
		this.setLayout(null);
		
	}
	public void setSize() {
		this.setBounds(0, 0, GraphicEditorFrame.skectchAreaPanelWidth, GraphicEditorFrame.skectchAreaPanelHeight- 50);
	}
	
	public void makeItResizable() {
		drawablePanel =  new DrawablePanel();
		
		drawablePanel.setSize();
		this.add(drawablePanel);
		this.add(bottomDragButton);
		this.add(rightDragButton);
		this.add(angleDragButton);
		
		if(rightDragButton.hasMouse()) {
			dragLocation = rightDragButton.getDragPoint();
		}
		
		if(bottomDragButton.hasMouse()) {
			dragLocation = bottomDragButton.getDragPoint();
		}
		
		if(angleDragButton.hasMouse()) {
			dragLocation = angleDragButton.getDragPoint();
		}
		
		angleDragButton.addMouseMotionListener(new MouseMotionAdapter() {
	        @Override
	        public void mouseDragged(MouseEvent e) {
	        	drawablePanel.setSize((int)(drawablePanel.getWidth()+(e.getPoint().getX()-dragLocation.getX())),
                        (int)(drawablePanel.getHeight()+(e.getPoint().getY()-dragLocation.getY())));
	        	dragLocation = e.getPoint();
	        }
		});
		;
		
		bottomDragButton.addMouseMotionListener(new MouseMotionAdapter() {
	        @Override
	        public void mouseDragged(MouseEvent e) {
	        	dragLocation = bottomDragButton.getDragPoint();
	        	drawablePanel.setSize(drawablePanel.getWidth(),
	        			(int)(drawablePanel.getHeight()+(e.getPoint().getY()-dragLocation.getY())));
                dragLocation = e.getPoint();
//                bottomDragButton.setLocation(drawablePanel.getWidth(),
//	        			(int)(drawablePanel.getHeight()+(e.getPoint().getY()-dragLocation.getY())));
	        }
		});
		
		rightDragButton.addMouseMotionListener(new MouseMotionAdapter() {
	        @Override
	        public void mouseDragged(MouseEvent e) {
                drawablePanel.setSize((int)(drawablePanel.getWidth()+(e.getPoint().getX()-dragLocation.getX())),
                		drawablePanel.getHeight());
                dragLocation = e.getPoint();  
//                    System.err.println("in" + " getWidth(): "+drawablePanel.getWidth()  +" (e.getPoint().getX()-dragLocation.getX())): " +(e.getPoint().getX()-dragLocation.getX())
//                    +" (int)(getHeight(): "+ (int)drawablePanelgetHeight()+ " (e.getPoint().getY()-dragLocation.getY()): " + (e.getPoint().getY()-dragLocation.getY()));
//                    rightDragButton.setBounds((int)(drawablePanel.getWidth()+(e.getPoint().getX()-dragLocation.getX())), rightDragButton.getY(), rightDragButton.getWidth(), rightDragButton.getWidth());
	        
	        }
		});
		rightDragButton.setDragPoint(dragLocation);
		bottomDragButton.setDragPoint(dragLocation);
		angleDragButton.setDragPoint(dragLocation);
		
	}
	
}
