package com.dale.graphiceditor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GraphicEditorFrame extends JFrame{
	static int monitorWidth;
	static int monitorHeight;
	static private String title = "Graphic Editor";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicEditorFrame mainFrame = new GraphicEditorFrame();
		mainFrame.run(mainFrame);
	}
	
	GraphicEditorFrame(){
		super(GraphicEditorFrame.title);
		Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
		monitorWidth = resolution.width;
		monitorHeight = resolution.height;
		System.out.println("ÇØ»óµµ : " + resolution.width + " x " + resolution.height);
	}
	
	private void run(GraphicEditorFrame mainFrame) {
		Panel additionalFunctionPanel =  new Panel();
		Panel attributesPanel =  new Panel();
		Panel selectShapePanel = new Panel();
		Panel skectchAreaPanel =  new Panel();
		Panel toolsPanel =  new Panel();
		
		additionalFunctionPanel.setLayout(null);
		attributesPanel.setLayout(null);
		selectShapePanel.setLayout(null);
		skectchAreaPanel.setLayout(null);
		
		//START POINT: setting additionalFunctionPanel
		additionalFunctionPanel.setBounds(0, 0, monitorWidth, monitorHeight * 7 /100);
		additionalFunctionPanel.setBackground(Color.BLACK);
		//END POINT
		
		//START POINT: setting toolsPanel
		toolsPanel.setBounds(0, monitorHeight * 7 /100, monitorWidth, monitorHeight*15/100);
		toolsPanel.setBackground(Color.BLUE);
		toolsPanel.add(attributesPanel);
		toolsPanel.add(selectShapePanel);
		//END POINT
		
//		//START POINT: setting attributesPanel
		attributesPanel.setBounds(monitorWidth * 49 / 100, 0, monitorWidth * 32 / 100, monitorHeight*15/100);
		attributesPanel.setBackground(Color.GREEN);
//		//END POINT
//		
//		//START POINT: setting attributesPanel
//		attributesPanel.setBounds(0, monitorHeight * 7 /100, monitorWidth, monitorHeight*15/100);
//		attributesPanel.setBackground(Color.BLUE);
//		//END POINT
		
		//START POINT: setting toolsPanel
		skectchAreaPanel.setBounds(0, monitorHeight * 22 /100, monitorWidth, monitorHeight -monitorHeight * 22 /100);
		skectchAreaPanel.setBackground(Color.PINK);
		//END POINT
		
		//START POINT: setting main frame
		mainFrame.setSize(GraphicEditorFrame.monitorWidth, GraphicEditorFrame.monitorHeight*19/20);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		mainFrame.add(toolsPanel);
		mainFrame.add(skectchAreaPanel);
		mainFrame.add(additionalFunctionPanel);
		//END POINT
	}
	
	
	
}
