package com.dale.graphiceditor;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.dale.graphiceditor.buttons.ColorSelectButtons;
import com.dale.graphiceditor.mouse.MyMouse;
import com.dale.graphiceditor.panel.*;

public class AttributeArea extends JPanel {
	ArrayList<ColorSelectButtons> colorSelectButtons = new ArrayList<ColorSelectButtons>();
	ColorButtonsPanel colorButtonsPanel;
	ColorSelectPanel colorSelectPanel;
	ColorEditPanel colorEditPanel;
	
	ButtonGroup buttonGroup;
	Container container;
	private Color selectedColor;
		
	AttributeArea(){
		this.setLayout(null);
	}
	
	public void createAttributeArea() {
		colorButtonsPanel = new ColorButtonsPanel();
		colorSelectPanel = new ColorSelectPanel();
		colorEditPanel = new ColorEditPanel();
				
		colorButtonsPanel.setComponents();
		colorButtonsPanel.setSize();
		
		colorSelectPanel.setSize();
		
		colorEditPanel.createPanel();
		colorEditPanel.setSize();
				
		colorEditPanel.getColorChooser().addActionListener(new MenuActionListener());
		this.add(colorSelectPanel);
		this.add(colorButtonsPanel);
		this.add(colorEditPanel);
		
		buttonGroup = new ButtonGroup();
		container = new Container();
		
		int x, y, z = 0;
		for(y = 0; y < 75; y += 25) {
			z = 0;
			for(x = 0; x < 250; x+= 25) {
				ColorSelectButtons colorSelect = new ColorSelectButtons(x, y, 255 - y*3, 255 - x, 255 - z);
				colorSelect.creatButton();
				colorSelect.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						selectedColor = colorSelect.getColor();
					}
					
				});
				colorSelect.addChangeListener(new ChangeListener() {

					@Override
					public void stateChanged(ChangeEvent e) {
						// TODO Auto-generated method stub
						if(colorButtonsPanel.getPrimaryColor().isSelected()) {
							colorButtonsPanel.setPrimaryRGB(selectedColor);

						}
						if(colorButtonsPanel.getSecondaryColor().isSelected()) {
							colorButtonsPanel.setSecondaryRGB(selectedColor);
			
						}
					}
				});
				colorSelectButtons.add(colorSelect);
				z += 25;
							
			}
		}
		for(ColorSelectButtons c : colorSelectButtons) {
			buttonGroup.add(c);
			container.add(c);
		}
		
		
		container.setBounds(0, 0, 280, 100);
		colorSelectPanel.add(container);
	}
	
	public void setSize() {
		this.setBounds(GraphicEditorFrame.attributesPanelX+130 , GraphicEditorFrame.attributesPanelY,
				GraphicEditorFrame.attributesPanelWidth +130 , GraphicEditorFrame.attributesPanelHeight);
		System.out.println(GraphicEditorFrame.attributesPanelWidth  +" "+ GraphicEditorFrame.attributesPanelHeight);
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
					colorButtonsPanel.setPrimaryRGB(selectedColor);
				}
			}
		}
	}
}
