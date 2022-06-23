package com.dale.graphiceditor;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;
import javax.swing.JButton;

public class DragPoint extends JButton {
	private int x;
	private int y;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DragPoint() { 
		super(); decorate(); 
	} 
    public DragPoint(String text) { 
    	super(text); 
    	if(text.equals("bottom")) {
    		x = GraphicEditorFrame.drawablePanelWidth / 2;
    		y = GraphicEditorFrame.drawablePanelHeight;
    		this.setBounds(x, y, 10, 10);
    		
    		this.addMouseListener(new MouseAdapter(){
    			
				@Override
 		       	public void mousePressed(MouseEvent ev){
 		           x = ev.getX ();
 		           y = ev.getY();
    			}
    			
    		});
//    		this.addMouseMotionListener(new MouseMotionAdapter() {
//    			public void mouseDragged(MouseEvent evt) {
//	                 int newX = evt.getXOnScreen()-  x;
//	                 int newY = evt.getYOnScreen() - y;
//	                 this.setSize(newX, newY); 
//    			}
//    		});
    		this.addMouseListener(null);
    	}
    	if(text.equals("right")) {
    		x = GraphicEditorFrame.drawablePanelWidth ;
    		y = GraphicEditorFrame.drawablePanelHeight/ 2;
    		this.setBounds(x, y, 10, 10);
    	}
    	else {
    		x = GraphicEditorFrame.drawablePanelWidth ;
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
