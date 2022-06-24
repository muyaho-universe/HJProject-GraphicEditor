package com.dale.graphiceditor;

import java.awt.*;

import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.dale.graphiceditor.mouse.*;
import com.dale.graphiceditor.buttons.*;
import com.dale.graphiceditor.panel.*;

public class GraphicEditorFrame extends JFrame{
	static public int monitorWidth;
	static public int monitorHeight;
	static int additionalFunctionPanelWidth; // = monitorWidth;
	static int additionalFunctionPanelHeight; // = monitorHeight * 7 /100;
	static int attributesPanelWidth; // = monitorWidth * 32 / 100;
	static int attributesPanelHeight; // = monitorHeight *15 / 100;
	static int attributesPanelX; // = monitorWidth * 49 / 100
	static int attributesPanelY = 0; // = 0;
	static int selectShapePanelWidth; // = monitorWidth * 4 / 10, 
	static int selectShapePanelHeight; // = monitorHeight*15/100
	static int selectShapePanelX;  // = monitorWidth * 27/ 100
	static int selectShapePanelY = 0; // = 0;
	static int skectchAreaPanelWidth; // = monitorWidth;
	public static int skectchAreaPanelHeight; // = monitorHeight -monitorHeight * 22 /100; (0, 
	static int skectchAreaPanelX = 0;
	static int skectchAreaPanelY ; // = monitorHeight * 22 /100,
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
		attributesPanelX = monitorWidth * 49 / 100;
		selectShapePanelWidth = monitorWidth * 4 / 10; 
		selectShapePanelHeight = monitorHeight*15/100 ;
		selectShapePanelX = monitorWidth * 27/ 100;
		skectchAreaPanelWidth = monitorWidth;
		skectchAreaPanelHeight = monitorHeight -monitorHeight * 22 /100;
		skectchAreaPanelY = monitorHeight * 22 /100;
		toolsPanelWidth = monitorWidth; 
		toolsPanelHeight = monitorHeight * 15 / 100;
		toolsPanelY = monitorHeight * 7 /100;
		drawablePanelWidth= monitorWidth / 2;
		drawablePanelHeight = skectchAreaPanelHeight / 2;
		System.out.println("ÇØ»óµµ : " + resolution.width + " x " + resolution.height);
	}
	
	private void run() {
		 
		JPanel additionalFunctionPanel =  new JPanel();
		JPanel attributesPanel =  new JPanel();
		JPanel selectShapePanel = new JPanel();
//		Container skectchAreaPanel =  new Container();
//		JPanel skectchAreaPanel =  new JPanel();
		ResizablePanel skectchAreaPanel =  new ResizablePanel();
		JPanel toolsPanel =  new JPanel();
				
				
		additionalFunctionPanel.setLayout(null);
		attributesPanel.setLayout(null);
		selectShapePanel.setLayout(null);
		skectchAreaPanel.setLayout(null);
		toolsPanel.setLayout(null);
		
		//START POINT: setting additionalFunctionPanel
		additionalFunctionPanel.setBounds(0, 0, additionalFunctionPanelWidth, additionalFunctionPanelHeight);
		additionalFunctionPanel.setBackground(Color.YELLOW);
		//END POINT
		
		//START POINT: setting toolsPanel
		toolsPanel.setBounds(toolsPanelX, toolsPanelY, toolsPanelWidth,toolsPanelHeight);
		
		toolsPanel.setBackground(Color.BLUE);
		toolsPanel.add(attributesPanel);
		toolsPanel.add(selectShapePanel);
		//END POINT
		
		//START POINT: setting attributesPanel
		attributesPanel.setBounds(attributesPanelX, attributesPanelY, attributesPanelWidth,attributesPanelHeight);
		attributesPanel.setBackground(Color.GREEN);
		//END POINT
		
		//START POINT: setting selectShapePanel
		selectShapePanel.setBounds(selectShapePanelX, selectShapePanelY, selectShapePanelWidth, selectShapePanelHeight);
		selectShapePanel.setBackground(Color.RED);
		//END POINT
		
		//START POINT: setting skectchAreaPanel
		skectchAreaPanel.setBounds(skectchAreaPanelX, skectchAreaPanelY, skectchAreaPanelWidth, skectchAreaPanelHeight);
		skectchAreaPanel.setBackground(Color.PINK);
		//END POINT
				
		//START POINT: setting main frame
		this.setSize(GraphicEditorFrame.monitorWidth, GraphicEditorFrame.monitorHeight*19/20);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.add(toolsPanel);
		this.add(skectchAreaPanel);
		this.add(additionalFunctionPanel);
//		this.add(drawablePanel);
		//END POINT
	}
	
}
