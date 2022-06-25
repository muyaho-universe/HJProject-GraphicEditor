package com.dale.graphiceditor;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


import com.dale.graphiceditor.mouse.*;
import com.dale.graphiceditor.buttons.*;
import com.dale.graphiceditor.panel.*;

public class GraphicEditorFrame extends JFrame{
	static public int monitorWidth;
	static public int monitorHeight;
	static int additionalFunctionPanelWidth; // = monitorWidth;
	static int additionalFunctionPanelHeight; // = monitorHeight * 7 /100;
	public static int attributesPanelWidth; // = monitorWidth * 32 / 100;
	public static int attributesPanelHeight; // = monitorHeight *15 / 100;
	public static int attributesPanelX; // = monitorWidth * 49 / 100
	public static int attributesPanelY = 0; // = 0;
	static int selectShapePanelWidth; // = monitorWidth * 4 / 10, 
	static int selectShapePanelHeight; // = monitorHeight*15/100
	static int selectShapePanelX;  // = monitorWidth * 27/ 100
	static int selectShapePanelY = 0; // = 0;
	public static int skectchAreaPanelWidth; // = monitorWidth;
	public static int skectchAreaPanelHeight; // = monitorHeight -monitorHeight * 22 /100; (0, 
	public static int skectchAreaPanelX = 0;
	public static int skectchAreaPanelY ; // = monitorHeight * 22 /100,
	static int toolsPanelWidth; //= monitorWidth, 
	static int toolsPanelHeight; // = monitorHeight*15/100
	static int toolsPanelX = 0;
	static int toolsPanelY; // = monitorHeight * 7 /100
	static public int drawablePanelWidth; //= monitorWidth / 2, 
	static public int drawablePanelHeight; // = skectchAreaPanelHeight / 2
	static public int drawablePanelX = 5;
	static public int drawablePanelY = 5;

	static private String title = "Graphic Editor";
	private int x;
    private int y;
    
    
	MyMouse myMouse = new MyMouse();
	
	
	
	public static void main(String[] args) {
		GraphicEditorFrame mainFrame = new GraphicEditorFrame();
		mainFrame.run();
	}
	
	GraphicEditorFrame(){
		super(GraphicEditorFrame.title);
		Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
		
		monitorWidth = resolution.width;
		monitorHeight = resolution.height;
		additionalFunctionPanelWidth = monitorWidth;
		additionalFunctionPanelHeight = monitorHeight * 7 /100;
		attributesPanelWidth = monitorWidth * 32 / 100;
		attributesPanelHeight = monitorHeight *15 / 100;
		attributesPanelX = monitorWidth * 40/ 100;
		selectShapePanelWidth = monitorWidth * 29 / 100; 
		selectShapePanelHeight = monitorHeight*15/100 ;
		selectShapePanelX = monitorWidth * 21/ 100;
		skectchAreaPanelWidth = monitorWidth;
		skectchAreaPanelHeight = monitorHeight -monitorHeight * 22 /100;
		skectchAreaPanelY = monitorHeight * 22 /100;
		toolsPanelWidth = monitorWidth; 
		toolsPanelHeight = monitorHeight * 15 / 100;
		toolsPanelY = monitorHeight * 7 /100;
		drawablePanelWidth= monitorWidth / 2;
		drawablePanelHeight = skectchAreaPanelHeight / 2;
		System.out.println("ÇØ»óµµ : " + resolution.width + " x " + resolution.height);
		setSize(GraphicEditorFrame.monitorWidth, GraphicEditorFrame.monitorHeight*19/20);
	}
	
	private void run() {
		JPanel mainPanel = new JPanel();		
		AdditionalFunctions additionalFunctionPanel =  new AdditionalFunctions();
		JPanel attributesPanel =  new JPanel();
		JPanel selectShapePanel = new JPanel();
		HomeMenu toolsPanel =  new HomeMenu();
				
		mainPanel.setLayout(null);		

//		attributesPanel.setLayout(null);
		selectShapePanel.setLayout(null);

		toolsPanel.setLayout(null);
		
		mainPanel.setBounds(0, 0, monitorWidth, monitorHeight);
		mainPanel.setBackground(new Color(125, 0, 0));
		//START POINT: setting additionalFunctionPanel
		additionalFunctionPanel.setSize();
		additionalFunctionPanel.setMenuBar();
		//END POINT
		
		//START POINT: setting toolsPanel

		toolsPanel.createHomeMenu();
		//END POINT
		
		//START POINT: setting attributesPanel
//		attributesPanel.setBounds(attributesPanelX, attributesPanelY, attributesPanelWidth,attributesPanelHeight);
		//END POINT
		
		//START POINT: setting selectShapePanel
		

		//END POINT
		
		//START POINT: setting skectchAreaPanel
		SkectchArea skectchArea = new SkectchArea();
		
		System.out.println(GraphicEditorFrame.skectchAreaPanelX+" "+ GraphicEditorFrame.skectchAreaPanelY+" "+ 
				GraphicEditorFrame.skectchAreaPanelWidth+" "+ GraphicEditorFrame.skectchAreaPanelHeight);
		skectchArea.setSize();
		//END POINT
				
		//START POINT: setting main frame
		
		mainPanel.add(toolsPanel);
		mainPanel.add(additionalFunctionPanel);
		mainPanel.add(skectchArea);
		
		this.setJMenuBar(additionalFunctionPanel.menuBar);
		this.add(mainPanel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		//END POINT
	}
	
}
