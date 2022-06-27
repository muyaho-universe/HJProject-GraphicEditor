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
	        	bottomDragButton.setX(drawablePanel.getWidth()/2);
                bottomDragButton.setY(drawablePanel.getHeight());
                bottomDragButton.setBounds(bottomDragButton.getX(),bottomDragButton.getY(), 40, 40);
                
                angleDragButton.setX(drawablePanel.getWidth());
                angleDragButton.setY(drawablePanel.getHeight());
                angleDragButton.setBounds(angleDragButton.getX(),angleDragButton.getY(), 40, 40);
                
                rightDragButton.setX(drawablePanel.getWidth());
                rightDragButton.setY(drawablePanel.getHeight()/2);
                rightDragButton.setBounds(rightDragButton.getX(),rightDragButton.getY(), 40, 40);
	        }
		});
		
		bottomDragButton.addMouseMotionListener(new MouseMotionAdapter() {
	        @Override
	        public void mouseDragged(MouseEvent e) {
	        	drawablePanel.setSize(drawablePanel.getWidth(),
	        			(int)(drawablePanel.getHeight()+(e.getPoint().getY()-dragLocation.getY())));
                dragLocation = e.getPoint();
                bottomDragButton.setX(drawablePanel.getWidth()/2);
                bottomDragButton.setY((int)(drawablePanel.getHeight()+(e.getPoint().getY()-dragLocation.getY())));
                bottomDragButton.setBounds(bottomDragButton.getX(),bottomDragButton.getY(), 40, 40);
                
                angleDragButton.setX(drawablePanel.getWidth());
                angleDragButton.setY((int)(drawablePanel.getHeight()+(e.getPoint().getY()-dragLocation.getY())));
                angleDragButton.setBounds(angleDragButton.getX(),angleDragButton.getY(), 40, 40);
                
                rightDragButton.setX(drawablePanel.getWidth());
                rightDragButton.setY((int)(drawablePanel.getHeight()+(e.getPoint().getY()-dragLocation.getY()))/2);
                rightDragButton.setBounds(rightDragButton.getX(),rightDragButton.getY(), 40, 40);
	        }
		});
		
//		rightDragButton.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				rightDragButton.setLocation(dragLocation);
//				
//			}
//			
//		});
		
		rightDragButton.addMouseMotionListener(new MouseMotionAdapter() {
	        @Override
	        public void mouseDragged(MouseEvent e) {
                drawablePanel.setSize((int)(drawablePanel.getWidth()+(e.getPoint().getX()-dragLocation.getX())),
                		drawablePanel.getHeight());
                dragLocation = e.getPoint();  
                bottomDragButton.setX(drawablePanel.getWidth()/2);
                bottomDragButton.setY((int)(drawablePanel.getHeight()+(e.getPoint().getY()-dragLocation.getY())));
                bottomDragButton.setBounds(bottomDragButton.getX(),bottomDragButton.getY(), 40, 40);
                
                angleDragButton.setX(drawablePanel.getWidth());
                angleDragButton.setY((int)(drawablePanel.getHeight()+(e.getPoint().getY()-dragLocation.getY())));
                angleDragButton.setBounds(angleDragButton.getX(),angleDragButton.getY(), 40, 40);
                
                rightDragButton.setX(drawablePanel.getWidth());
                rightDragButton.setY((int)(drawablePanel.getHeight()+(e.getPoint().getY()-dragLocation.getY()))/2);
                rightDragButton.setBounds(rightDragButton.getX(),rightDragButton.getY(), 40, 40);
	        }
		});
		rightDragButton.setDragPoint(dragLocation);
		bottomDragButton.setDragPoint(dragLocation);
		angleDragButton.setDragPoint(dragLocation);
		this.add(rightDragButton);
	}
	public DrawablePanel getDrawing() {
		return drawablePanel;
	}
}
