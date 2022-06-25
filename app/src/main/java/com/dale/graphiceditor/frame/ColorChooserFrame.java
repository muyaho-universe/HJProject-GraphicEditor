package com.dale.graphiceditor.frame;

import java.awt.Color;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.*;


public class ColorChooserFrame extends JFrame implements ChangeListener{
	
	private boolean colorChange = true;
	Color choosenColor = new Color(0, 0, 0);
	
	JColorChooser colorChooser = new JColorChooser();
	
	 @Override
	   public void stateChanged(ChangeEvent e) {
	      // TODO Auto-generated method stub
		 choosenColor = colorChooser.getColor();
	      colorChange = true;
	      //System.out.print("\""+Integer.toHexString(color.getRGB())+"\", ");
	   }

	
	public ColorChooserFrame(){
	      setTitle("색상 고르기");
	      setLocation(400, 200);
	      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	      
	      colorChooser.getColorModel();
	      
	      add(colorChooser);
	      pack();
	      setVisible(true);
	}
	
	public Color getChangedColor() {
		return choosenColor;
	}
	

}
