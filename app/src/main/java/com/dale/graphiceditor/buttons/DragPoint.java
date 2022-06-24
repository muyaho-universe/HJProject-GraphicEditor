package com.dale.graphiceditor.buttons;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
import javax.swing.JButton;

import com.dale.graphiceditor.GraphicEditorFrame;

public class DragPoint extends JButton {
	private int x;
	private int y;
	private int newX;
	private int newHeight;
	private String buttonName;
	private boolean hasMouse = false;
	private boolean isDragged = false;
	private int currentMouseX, currentMouseY;
	private static final long serialVersionUID = 1L;
	

	public DragPoint() { 
		super(); 
		decorate(); 
	} 
	
    public DragPoint(String text) { 
    	super(text);
    	    			
		this.addMouseListener(new MouseListener() {
    		@Override
    		public void mouseEntered(MouseEvent e) {
    			hasMouse = true;
        		System.out.println("Entered " + text);
    		}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				if(hasMouse) {
					isDragged = true;
				}			
	 		    System.out.println("Pressed " + text + " isDragged " + isDragged);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				isDragged = false;
				System.out.println("Released " + text + " isDragged " + isDragged);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				if(!isDragged) {
					hasMouse = false;
					System.out.println("Exits ");
				}
			}
    	});
		this.setBackground(new Color(224, 224, 224));	
    	this.decorate(); 
    } 
    
    public DragPoint(Action action) { 
    	super(action); 
    	decorate(); 
    } 
    public DragPoint(Icon icon) { 
    	super(icon); 
    	decorate(); 
    } 
    public DragPoint(String text, Icon icon) { 
    	super(text, icon); 
    	decorate(); 
    } 
    
    protected void decorate() { 
    	
    	setBorderPainted(false); 
    	setOpaque(false);
    }
    
    @Override 
    protected void paintComponent(Graphics g) {
		Color c=new Color(255,247,242); //배경색 결정
		Color o=new Color(247,99,12); //글자색 결정
		
		int width = getWidth(); 
		int height = getHeight(); 
		
		Graphics2D graphics = (Graphics2D) g; 
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
		
		if (getModel().isArmed()) { 
			graphics.setColor(c.darker()); 
		} 
		else if (getModel().isRollover()) { 
			graphics.setColor(c.brighter()); 
		} 
		else { 
			graphics.setColor(c); 
		} 
		
		graphics.fillRoundRect(0, 0, 10, 10, 10, 10);
		
		FontMetrics fontMetrics = graphics.getFontMetrics(); 
		Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds(); 
		
		int textX = (width - stringBounds.width) / 2; 
		int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent(); 
		
		graphics.setColor(o); 
		graphics.setFont(getFont()); 
		graphics.drawString(getText(), textX, textY); 
		graphics.dispose(); 
	 	super.paintComponent(g); 
    }
    
    public void setX(int x) {
		this.x =x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y =y;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean isDragged() {
		return isDragged;
	}
}
