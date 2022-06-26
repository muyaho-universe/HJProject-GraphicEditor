package com.dale.graphiceditor.panel;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.event.MouseInputAdapter;

import com.dale.graphiceditor.GraphicEditorFrame;
import com.dale.graphiceditor.SkectchArea;
import com.dale.graphiceditor.buttons.DragPoint;
import com.dale.graphiceditor.datapart.MyDatas;
import com.dale.graphiceditor.mouse.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Vector;

public class DrawablePanel extends JPanel{
	private boolean hasMouse = false;
	private boolean isDrawing = false;
	private ArrayList<Point> startVector = new ArrayList<Point>();
	private ArrayList<Point> endVector = new ArrayList<Point>();
	
	private Point startPoint = null;
	private Point endPoint = null;
	
	public DrawablePanel() {
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		this.setMinimumSize(new Dimension(5, 5));
		this.setMaximumSize(new Dimension(GraphicEditorFrame.monitorWidth, GraphicEditorFrame.skectchAreaPanelHeight / 2));	
		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		this.addMouseListener(new MyMouseListener());
//		this.addMouseMotionListener(null)
	}
	
	public void setSize() {
		this.setBounds(GraphicEditorFrame.drawablePanelX, GraphicEditorFrame.drawablePanelY, GraphicEditorFrame.drawablePanelWidth, GraphicEditorFrame.drawablePanelHeight);
	}
	
	public class MyMouseListener extends MouseInputAdapter {
		
		Graphics g = getGraphics();
		Graphics2D g2 = (Graphics2D) g;
		
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			if(MyMouse.currentMode.equals("Line")) {
				endPoint = e.getPoint();
				repaint();
			}
			else if(MyMouse.currentMode.equals("Polyline")) {
				MyDatas.curves.get(MyDatas.curves.size()-1).add(new Point(e.getX(), e.getY()));
				repaint(0,0,getWidth(), getHeight());
				
			}
			else if(MyMouse.currentMode.equals("Circle")) {
				endPoint = e.getPoint();
				repaint();
			}
			else if(MyMouse.currentMode.equals("Quadrangle")) {
				endPoint = e.getPoint();
				repaint();
			}
		}

		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		public void mousePressed(MouseEvent e){
			if(MyMouse.currentMode.equals("Polyline")) {
				var newCurve = new Vector<Point>();
				newCurve.add(new Point(e.getX(), e.getY()));
				MyDatas.curves.add(newCurve);
//				curveStroke.add(SelectBar.tsize);
//				curves.add(new Point(e.getX(), e.getY()));
			}
			else {
				MyDatas.mode.add(MyMouse.currentMode);
				MyDatas.stroke.add(MyMouse.currentStroke);
				MyDatas.color.add(MyMouse.currentColor);
				if(MyMouse.currentMode.equals("Line")) {
					startPoint = e.getPoint();
					MyDatas.startVector.add(e.getPoint()); // 클릭한부분을 시작점으로
				}
				else if(MyMouse.currentMode.equals("Circle")) {
					startPoint = e.getPoint();
					MyDatas.startVector.add(e.getPoint()); // 클릭한부분을 시작점으로
				}
				else if(MyMouse.currentMode.equals("Quadrangle")) {
					startPoint = e.getPoint();
					MyDatas.startVector.add(e.getPoint()); // 클릭한부분을 시작점으로
				}
			}
		}
		public void mouseReleased(MouseEvent e){
			if(MyMouse.currentMode.equals("Line")) {
				MyDatas.endVector.add(e.getPoint()); // 드래그 한부분을 종료점으로
				endPoint = e.getPoint();
				repaint(); // 다시그려라
			}
			else if(MyMouse.currentMode.equals("Circle")) {
				MyDatas.endVector.add(e.getPoint()); // 드래그 한부분을 종료점으로
				endPoint = e.getPoint();
				repaint(); // 다시그려라
			}
			else if(MyMouse.currentMode.equals("Quadrangle")) {
				MyDatas.endVector.add(e.getPoint()); // 드래그 한부분을 종료점으로
				endPoint = e.getPoint();
				repaint(); // 다시그려라
			}
//			for(int i = 0; i < stroke.size(); i++) {
//				System.out.println(stroke.get(i));
//			}
		}
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g); // 부모 페인트호출
		Graphics2D g2 = (Graphics2D) g.create();		
		
	} 

}
