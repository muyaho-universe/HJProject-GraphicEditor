package com.dale.graphiceditor.panel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import com.dale.graphiceditor.buttons.*;

public class ColorSelectPanel extends JPanel {
	ArrayList<ColorSelectButtons> colorSelectButtons = new ArrayList<ColorSelectButtons>();
	 
	ColorSelectPanel(){
		this.setLayout(new FlowLayout());
	}
	
	public void createPanel() {
		
		int x, y, z = 0;
		for(y = 0; y < 30; y += 10) {
			z = 0;
			for(x = 0; x < 100; x+= 10) {
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
		this.setBounds(120, 0, 330, 100);
	}
}
