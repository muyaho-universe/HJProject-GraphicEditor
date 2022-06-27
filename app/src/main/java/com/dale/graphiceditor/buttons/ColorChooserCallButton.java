package com.dale.graphiceditor.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import com.dale.graphiceditor.mouse.MyMouse;
import com.dale.graphiceditor.*;


public class ColorChooserCallButton extends JButton {
	private Color chooseColor = new Color(0, 0, 0);
	
	public ColorChooserCallButton(String text) {
		super(text);
	}
	
	public void createButton() {
		this.addActionListener(new MenuActionListener());
		
	}
	class MenuActionListener implements ActionListener {
		JColorChooser chooser = new JColorChooser();
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String cmd = e.getActionCommand();
			if(cmd.equals("»ö ÆíÁý")){
				Color selectedColor = chooser.showDialog(null, "Color", Color.RED);
				
				if(selectedColor != null) {
					MyMouse.currentColor = selectedColor;
					
				}
			}
		}
	}
	public void setSize() {
		this.setBounds(0, 0, 115, 115);
	}
}
