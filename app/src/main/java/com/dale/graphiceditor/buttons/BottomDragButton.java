package com.dale.graphiceditor.buttons;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JButton;

import com.dale.graphiceditor.GraphicEditorFrame;

public class BottomDragButton extends DragPoint{
	private boolean hasMouse = false;
	private boolean isDragged = false;
	
	BottomDragButton(String name){
		super(name);
		
		addMouseListener(new MouseListener() {
    		@Override
    		public void mouseEntered(MouseEvent e) {
    			hasMouse = true;
//    			isDragged = true;
//    			System.out.println("Entered " + " drawablePanel.getSize: " + drawablePanel.getSize());
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
// 		        System.out.println("Pressed " + "currentMouseX: " + currentMouseX + " e.getY(): " + currentMouseY);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				isDragged = false;
//				System.out.println("Released " + " drawablePanel.getSize: " + drawablePanel.getSize());
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
	}

}
