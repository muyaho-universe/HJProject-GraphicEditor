package com.dale.graphiceditor.panel;

import javax.swing.JPanel;

import com.dale.graphiceditor.buttons.StrokeSelectButton;

public class StrokePanel extends JPanel {
	StrokeSelectButton strokeSelectButton;
	public StrokePanel(){
		strokeSelectButton = new StrokeSelectButton();
	}
	
	public void createPanel() {
		this.setBounds(250, 0, 100, 162);
		this.setLayout(null);
		strokeSelectButton.createButton();
		strokeSelectButton.setSize();
		
		this.add(strokeSelectButton);
	}
}
