package com.dale.graphiceditor.panel;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.*;


public class ResizablePanel extends JPanel {
	 private boolean drag = false;
	    private Point dragLocation  = new Point();

	    public  ResizablePanel() {
	        setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
	        setPreferredSize(new Dimension(500, 500));
	        final JFrame f = new JFrame("Test");
	        addMouseListener(new MouseAdapter() {
	            @Override
	            public void mousePressed(MouseEvent e) {
	                drag = true;
	                dragLocation = e.getPoint();
	            }

	            @Override
	            public void mouseReleased(MouseEvent e) {
	                drag = false;
	            }
	        });
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
	        f.getContentPane().setLayout(new BorderLayout());
	        f.getContentPane().add(this,BorderLayout.CENTER);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.pack();
	        f.setVisible(true);
	    }

}
