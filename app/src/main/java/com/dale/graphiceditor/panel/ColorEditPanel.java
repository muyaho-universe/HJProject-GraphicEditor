package com.dale.graphiceditor.panel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.dale.graphiceditor.GraphicEditorFrame;

public class ColorEditPanel extends JPanel implements ChangeListener{
	public boolean hasMouse = false;
	JColorChooser colorChooser = new JColorChooser();

	public void createPanel() {
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				hasMouse = true;
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				hasMouse = false;
			}
			
		});
	}
	public void setSize() {
		this.setBounds(540, 0, 70, GraphicEditorFrame.attributesPanelHeight);
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}
}
