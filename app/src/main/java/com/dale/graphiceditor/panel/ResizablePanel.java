package com.dale.graphiceditor.panel;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import com.dale.graphiceditor.buttons.*;

import java.awt.event.*;


public class ResizablePanel extends JPanel {
	
	private Point dragLocation  = new Point();
	private String[] locations = {"bottom", "right",  "angle"};
	BottomDragButton bottomDragButton = new BottomDragButton("bottom");
	AngleDragButton angleDragButton = new AngleDragButton("angle");
	RightDragButton rightDragButton = new RightDragButton("right");
	
	DrawablePanel canvas = new DrawablePanel();
	
	public  ResizablePanel() {
		System.out.println("Made!");
		this.add(angleDragButton);
		this.add(bottomDragButton);
		this.add(rightDragButton);
		canvas.setOpaque(false);
		canvas.setBounds(0, 0, this.getWidth()-40, this.getHeight()-40);
		canvas.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		add(canvas);
		this.setLayout(null);
		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		
		this.addMouseMotionListener(new MouseMotionAdapter() {
	        @Override
	        public void mouseDragged(MouseEvent e) {
	        	// Buttom Drag
	            if (bottomDragButton.isDragged()) {
	                if (dragLocation.getX()> getWidth()-10 && dragLocation.getY()>getHeight()-10) {
	                    System.err.println("in");
	                    setSize((int)(getWidth()+(e.getPoint().getX()-dragLocation.getX())),
	                            (int)(getHeight()+(e.getPoint().getY()-dragLocation.getY())));
	                    dragLocation = e.getPoint();
	                }
	            }
	            
	            // Angle Drag
	            if(angleDragButton.isDragged()) {
	            	if (dragLocation.getX()> getWidth()-10 && dragLocation.getY()>getHeight()-10) {
	                    System.err.println("in");
	                    setSize((int)(getWidth()+(e.getPoint().getX()-dragLocation.getX())),
	                            (int)(getHeight()+(e.getPoint().getY()-dragLocation.getY())));
	                    dragLocation = e.getPoint();
	                }
	            }
	            
	            // Right Drag
	            if(rightDragButton.isDragged()) {
	            	if (dragLocation.getX()> getWidth()-10 && dragLocation.getY()>getHeight()-10) {
	                    System.err.println("in");
	                    setSize((int)(getWidth()+(e.getPoint().getX()-dragLocation.getX())),
	                            (int)(getHeight()+(e.getPoint().getY()-dragLocation.getY())));
	                    dragLocation = e.getPoint();
	                }
	            }
	        }
		});
		
		this.setOpaque(false);
		
	}
}
