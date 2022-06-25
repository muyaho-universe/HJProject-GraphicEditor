package com.dale.graphiceditor.panel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import com.dale.graphiceditor.buttons.*;

public class ColorSelectPanel extends JPanel {
	ArrayList<ColorSelectButtons> colorSelectButtons = new ArrayList<ColorSelectButtons>();
	ColorEditPanel colorEditPanel; 
	public ColorSelectPanel(){
		this.setLayout(null);
	}
	
	public void createPanel() {
		colorEditPanel = new ColorEditPanel();
		colorEditPanel.setSize();
		colorEditPanel.createPanel();
		int x, y, z = 0;
		for(y = 0; y < 75; y += 25) {
			z = 0;
			for(x = 0; x < 250; x+= 25) {
				ColorSelectButtons colorSelect = new ColorSelectButtons(x, y, 255 - y, 255 - x, 255 - z);
				colorSelect.creatButton();
				z += 20;
				colorSelectButtons.add(colorSelect);
			}
		}
		for(ColorSelectButtons c: colorSelectButtons) {
			this.add(c);
		}
		
	}
	
	public void setSize() {
		this.setBounds(120, 0, 280, 100);
	}
}
