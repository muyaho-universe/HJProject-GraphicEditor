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
    	if(text.equals("bottom")) {
    		
    		x = GraphicEditorFrame.drawablePanelWidth /2;
        	y = GraphicEditorFrame.drawablePanelHeight;
        	this.setBounds(x, y, 10, 10);
        	
        	this.addMouseListener(new MouseListener() {
        		@Override
        		public void mouseEntered(MouseEvent e) {
        			hasMouse = true;
//        			isDragged = true;
//        			System.out.println("Entered " + " drawablePanel.getSize: " + drawablePanel.getSize());
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
//	 		        System.out.println("Pressed " + "currentMouseX: " + currentMouseX + " e.getY(): " + currentMouseY);
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					isDragged = false;
//					System.out.println("Released " + " drawablePanel.getSize: " + drawablePanel.getSize());
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
        	
        	System.out.println("Dragged: " + hasMouse + " newX " + newX + " newY " );
        }
    	
    	if(text.equals("right")) {
    		x = GraphicEditorFrame.drawablePanelWidth;
        	y = GraphicEditorFrame.drawablePanelHeight / 2;
        	this.setBounds(x, y, 10, 10);
    	}
    	
    	if(text.equals("angle")) {
    		x = GraphicEditorFrame.drawablePanelWidth;
        	y = GraphicEditorFrame.drawablePanelHeight;
        	this.setBounds(x, y, 10, 10);
    	}
    	
    	decorate(); 
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
    	setBorderPainted(true); 
    	setOpaque(false); 
    }
    
    @Override 
    protected void paintComponent(Graphics g) {
		Color c=new Color(255,247,242); //���� ����
		Color o=new Color(247,99,12); //���ڻ� ����
		
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
		
		graphics.fillRoundRect(0, 0, width, height, 10, 10);
		
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
}