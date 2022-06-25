package com.dale.graphiceditor.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StrokeSelectButton extends JButton {
	JPopupMenu jPopupMenu; 
	JMenuItem stroke1;
	JMenuItem stroke2;
	JMenuItem stroke3;
	JMenuItem stroke4;
	
	public StrokeSelectButton() {
		super("º±±Ω±‚ º±≈√");
		jPopupMenu = new JPopupMenu();
	}
	
	public void createButton() {
		this.addActionListener(new PopupActionListener());
		stroke1 = new JMenuItem("±Ω±‚ 1");
		stroke2 = new JMenuItem("±Ω±‚ 2");
		stroke3 = new JMenuItem("±Ω±‚ 3");
		stroke4 = new JMenuItem("±Ω±‚ 4");
		
		jPopupMenu.add(stroke1);
		jPopupMenu.add(stroke2);
		jPopupMenu.add(stroke3);
		jPopupMenu.add(stroke4);
	}
	
	class PopupActionListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			jPopupMenu.setVisible(true);
			
		}
	}
	
	public void setSize() {
		this.setBounds(0, 0, 100, 162);
	}
}
