package com.dale.graphiceditor.panel;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import com.dale.graphiceditor.buttons.DragPoint;

import java.awt.event.*;


public class ResizablePanel extends JPanel {
	
	private Point dragLocation  = new Point();
	private String[] locations = {"bottom", "right",  "angle"}; 
	DragPoint[] points = new DragPoint[3];
	DrawablePanel canvas = new DrawablePanel();
	
	public  ResizablePanel() {
		canvas.setBounds(0, 0, this.getWidth()-5, this.getHeight()-5);
		canvas.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		add(canvas);
		
		for(int i = 0; i < 3; i ++) {
			points[i] = new DragPoint(locations[i]);
			this.add(points[i]);
		}
		
//		setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
//		setPreferredSize(new Dimension(500, 500));
		
		addMouseMotionListener(new MouseMotionAdapter() {
	        @Override
	        public void mouseDragged(MouseEvent e) {
	            if (drag) {
	                if (dragLocation.getX()> getWidth()-10 && dragLocation.getY()>getHeight()-10) {
	                    System.err.println("in");
	                    setSize((int)(getWidth()+(e.getPoint().getX()-dragLocation.getX())),
	                            (int)(getHeight()+(e.getPoint().getY()-dragLocation.getY())));
	                    dragLocation = e.getPoint();
	                }
	            }
	        }
		});
	}
}
