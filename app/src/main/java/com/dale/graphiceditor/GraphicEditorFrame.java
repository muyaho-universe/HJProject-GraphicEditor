package com.dale.graphiceditor;

import java.awt.*;

import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


import com.dale.graphiceditor.mouse.*;
import com.dale.graphiceditor.buttons.*;
import com.dale.graphiceditor.datapart.MyDatas;
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
	SkectchArea skectchArea;
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
		System.out.println("해상도 : " + resolution.width + " x " + resolution.height);
		setSize(GraphicEditorFrame.monitorWidth, GraphicEditorFrame.monitorHeight*19/20);
	}
	
	private void run() {
		JPanel mainPanel = new JPanel();		
		AdditionalFunctions additionalFunctionPanel =  new AdditionalFunctions();
//		AttributeArea attributesPanel =  new AttributeArea();
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

		//END POINT
		
		//START POINT: setting selectShapePanel
		

		//END POINT
		
		//START POINT: setting skectchAreaPanel
		skectchArea = new SkectchArea();
		
		System.out.println(GraphicEditorFrame.skectchAreaPanelX+" "+ GraphicEditorFrame.skectchAreaPanelY+" "+ 
				GraphicEditorFrame.skectchAreaPanelWidth+" "+ GraphicEditorFrame.skectchAreaPanelHeight);
		skectchArea.setSize();
		//END POINT
				
		//START POINT: setting main frame
		
//		mainPanel.add(attributesPanel);
		mainPanel.add(toolsPanel);
		
		mainPanel.add(skectchArea);
		this.setJMenuBar(additionalFunctionPanel.menuBar);
		additionalFunctionPanel.setSize();
		
		additionalFunctionPanel.menuBar.getMenu().getLoadFileMenuItem().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileDialog fileDialogOpen = new FileDialog(GraphicEditorFrame.this, "파일 열기", FileDialog.LOAD);
                fileDialogOpen.setVisible(true);
                String filePath = fileDialogOpen.getDirectory() + fileDialogOpen.getFile();
                if(filePath.contains(".png")) {
                	try {
                		MyDatas.isLoaded =true;
                		MyDatas.loadedImage = ImageIO.read(new File(filePath));
                		GraphicEditorFrame.this.getSketchArea().getResizable().getDrawing().repaint();
                     } catch (IOException ex) {
                          // handle exception...
                     }
                }
                
            }
        });
		
		UndoButton undo = new UndoButton();
		RedoButton redo = new RedoButton();
		
		undo.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.print(MyDatas.memo.size());
				// TODO Auto-generated method stub
				if(MyDatas.memo.size() > 0) {
					MyDatas.shapeRedoMemory.push(MyDatas.memo.pop());
//					MyDatas.sketchMemory.remove(MyDatas.shapeRedoMemory.size()-1);
					GraphicEditorFrame.this.getSketchArea().getResizable().getDrawing().setStartAndEndPointNull();
					GraphicEditorFrame.this.getSketchArea().getResizable().getDrawing().repaint();
					System.out.print("dkdkdk");
				}
			}
		});
		redo.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.print(MyDatas.shapeRedoMemory.size());
				// TODO Auto-generated method stub
				if(MyDatas.shapeRedoMemory.size() > 0) {
					MyDatas.memo.push(MyDatas.shapeRedoMemory.pop());

					GraphicEditorFrame.this.getSketchArea().getResizable().getDrawing().repaint();
					System.out.print("dkdkdk");
				}
			}
		});
		additionalFunctionPanel.add(undo);
		additionalFunctionPanel.add(redo);
		mainPanel.add(additionalFunctionPanel);
		this.add(mainPanel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		//END POINT
	}
	
	public SkectchArea getSketchArea() {
		return skectchArea;
	}
}
