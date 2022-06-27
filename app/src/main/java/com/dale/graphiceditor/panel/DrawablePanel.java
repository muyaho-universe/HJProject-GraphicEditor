package com.dale.graphiceditor.panel;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.MouseInputAdapter;

import com.dale.graphiceditor.GraphicEditorFrame;
import com.dale.graphiceditor.SkectchArea;
import com.dale.graphiceditor.buttons.DragPoint;
import com.dale.graphiceditor.datapart.*;
import com.dale.graphiceditor.mouse.*;

import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class DrawablePanel extends JPanel {
	private boolean hasMouse = false;
	private boolean isDrawing = false;
	private ArrayList<Point> startVector = new ArrayList<Point>();
	private ArrayList<Point> endVector = new ArrayList<Point>();
	
	private Point startPoint = null;
	private Point endPoint = null;
	private BufferedImage image;
	
	Point a = new Point(0, 0);
	Point b = new Point(0, 0);
	Line2D.Double line;
	Rectangle2D.Double rectangle;
	Ellipse2D.Double ellipse;
	
	public DrawablePanel() {
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		this.setMinimumSize(new Dimension(5, 5));
		this.setMaximumSize(new Dimension(GraphicEditorFrame.monitorWidth, GraphicEditorFrame.skectchAreaPanelHeight / 2));	
//		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		this.addMouseListener(new MyMouseListener());
		this.addMouseMotionListener(new MyMouseListener());
		
//		this.addMouseMotionListener(null)
	}
	
	public void setSize() {
		this.setBounds(GraphicEditorFrame.drawablePanelX, GraphicEditorFrame.drawablePanelY, GraphicEditorFrame.drawablePanelWidth, GraphicEditorFrame.drawablePanelHeight);
	}
	
	public class MyMouseListener extends MouseInputAdapter {
	      int count = 0;
	      @Override
	      public void mousePressed(MouseEvent e) {
	    	  startPoint = e.getPoint(); // 클릭한부분을 시작점으로
	    	  a.setLocation(0, 0);
	          b.setLocation(0, 0);
	          System.out.println("무야호~");
	         a.setLocation(e.getX(), e.getY());
	      }
	      
	      @Override
	      public void mouseReleased(MouseEvent e) {
	    	  System.out.println("이야호~");
	         Shape shape;
	         endPoint = e.getPoint(); // 드래그 한부분을 종료점으로
	         Graphics g = getGraphics();
	         Graphics2D g2 = (Graphics2D) g;
	         g2.setColor(MyMouse.currentColor);
	         float[] dash = new float[] { 10, 5, 5, 5 };
	         // g2.setStroke(new BasicStroke(5,0,BasicStroke.JOIN_MITER,1.0f,dash, 0));
	         g2.setStroke(new BasicStroke(MyMouse.currentStroke));
	         int twoDx = Math.min(startPoint.x, endPoint.x);
	         int twoDy = Math.min(startPoint.y, endPoint.y);
	         int absX = Math.abs(startPoint.x - endPoint.x);
	         int absY = Math.abs(startPoint.y - endPoint.y);
	         if (MyMouse.currentMode.equals("Line")) {
	            shape = new Line2D.Double(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
	            //g2.draw(shape);
	            MyDatas.memo.add(new Data(shape, MyMouse.currentColor, MyMouse.currentStroke));
	            repaint();
	         }
	         if (MyMouse.currentMode.equals("Quadrangle")) {
	            shape = new Rectangle2D.Double(twoDx, twoDy, absX, absY);
	            //g2.draw(shape);
	            MyDatas.memo.add(new Data(shape, MyMouse.currentColor, MyMouse.currentStroke));
	            repaint();
	         }
	         if (MyMouse.currentMode.equals("Circle")) {
	            shape = new Ellipse2D.Double(twoDx, twoDy, absX, absY);
	            //g2.draw(shape);
	            MyDatas.memo.add(new Data(shape, MyMouse.currentColor, MyMouse.currentStroke));
	            repaint();
	         }
	         if (MyMouse.currentMode.equals("Polyline")) {
	        	 MyDatas.memo.add(new Data(MyDatas.sketchMemory, MyMouse.currentColor, MyMouse.currentStroke));

//	            repaint();
	            //sketchMemory.clear();
	         }
	         
	         
//	         if (Buttons.erase == true) {
//	            memo.add(new Data(MyDatas.sketchMemory, Color.WHITE, 30));
//	            
//	         }

//	         shapeRedoMemory.clear();
//	         colorRedoMemory.clear();
//	         strokeRedoMemory.clear();
	         
	         try {
	 			MyDatas.currentImage = new Robot().createScreenCapture(new Rectangle(DrawablePanel.this.getLocationOnScreen().x, DrawablePanel.this.getLocationOnScreen().y,DrawablePanel.this.getWidth(), DrawablePanel.this.getHeight()));
	 			System.out.println(MyDatas.currentImage);
	 		} catch (AWTException e1) {
	 			// TODO Auto-generated catch block
	 			e1.printStackTrace();
	 		}
	      }
	      
	      @Override
	      public void mouseDragged(MouseEvent e) {
	    	 System.out.println("야호~");
	         endPoint = e.getPoint();
	         Graphics g = getGraphics();
	         Graphics2D g2 = (Graphics2D) g;
	         g2.setColor(MyMouse.currentColor);
	         float[] dash = new float[] { 10, 5, 5, 5 };
	         // g2.setStroke(new BasicStroke(5,0,BasicStroke.JOIN_MITER,1.0f,dash, 0));
	         g2.setStroke(new BasicStroke(MyMouse.currentStroke));
	         int twoDx = Math.min(startPoint.x, endPoint.x);
	         int twoDy = Math.min(startPoint.y, endPoint.y);
	         int absX = Math.abs(startPoint.x - endPoint.x);
	         int absY = Math.abs(startPoint.y - endPoint.y);
	         if (MyMouse.currentMode.equals("Line")) {
	            repaint();
	            g2.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
	            return;
	         }
	         if (MyMouse.currentMode.equals("Quadrangle")) {
	            repaint();
	            g2.drawRect(twoDx, twoDy, absX, absY);
	            return;
	         }
	         if (MyMouse.currentMode.equals("Circle")) {
	            repaint();
	            g2.drawOval(twoDx, twoDy, absX, absY);
	            return;
	         }
	         if (MyMouse.currentMode.equals("Polyline")) {// sketch
	            if (b.x != 0 && b.y != 0) {
	               a.x = b.x;
	               a.y = b.y;
	            }
	            b.setLocation(e.getX(), e.getY());
	            g2.drawLine(a.x, a.y, b.x, b.y);
	            MyDatas.sketchMemory.add(new Point(e.getX(),e.getY()));
	         }
//	         if (Buttons.erase == true) { // 지우개
//	            if (b.x != 0 && b.y != 0) {
//	               a.x = b.x;
//	               a.y = b.y;
//	            }
//	            b.setLocation(e.getX(), e.getY());
//	            g2.drawLine(a.x, a.y, b.x, b.y);
//	            MyDatas.sketchMemory.add(new Point(e.getX(),e.getY()));
//	            g2.setColor(Color.WHITE);
//	            g2.setStroke(new BasicStroke(30));
//	            g2.drawLine(a.x, a.y, b.x, b.y);
//	            
//	            MyDatas.sketchMemory.add(new Point(e.getX(),e.getY()));
//	         }
	      }

	      public void mouseMoved(MouseEvent e) { // 지우개 
	         Graphics g = getGraphics();
	         Graphics2D g2 = (Graphics2D) g;
//	         if (Buttons.erase == true) {
//	            repaint();
//	            g2.setColor(Color.BLACK);
//	            g2.setStroke(new BasicStroke(30));
//	            line = new Line2D.Double(e.getPoint().x, e.getPoint().y, e.getPoint().x, e.getPoint().y);
//	            g2.draw(line);
//
//	         }
	      }
	   }
	
	public void paintComponent(Graphics g){
	    super.paintComponent(g); // 부모 페인트호출
		Graphics2D g2 = (Graphics2D) g.create();
		if(MyDatas.isLoaded) {
			g.drawImage(MyDatas.loadedImage, 0, 0, this);
			
//			MyDatas.memo.add(null);
		}
		if (!MyDatas.memo.isEmpty()) {
			if(MyDatas.isLoaded) {
				g.drawImage(MyDatas.loadedImage, 0, 0, this);
				
//				MyDatas.memo.add(null);
			}
	         for (int i = 0; i < MyDatas.memo.size(); i++) {
	            
	            g2.setColor(MyDatas.memo.get(i).getColor());
	            g2.setStroke(new BasicStroke(MyDatas.memo.get(i).getStroke()));
	            if (MyDatas.memo.get(i).getShape() == null) {
	               for (int j = 0; j < MyDatas.memo.get(i).getSketch().size()-1; j++) {
	                  //System.out.println(memo.get(i).sketch.get(j).x + " " + memo.get(i).sketch.get(j).y);
	                  g2.drawLine(MyDatas.memo.get(i).getSketch().get(j).x, MyDatas.memo.get(i).getSketch().get(j).y, MyDatas.memo.get(i).getSketch().get(j+1).x, MyDatas.memo.get(i).getSketch().get(j+1).y);
	               }
	            } else {
	               g2.draw((Shape) MyDatas.memo.get(i).getShape());
	               
	            }
//	               System.out.println(memo.get(i).getColor());
	         }
		}
		if(startPoint != null) {
			g2.setStroke(new BasicStroke(MyMouse.currentStroke));
			g2.setColor(MyMouse.currentColor);
			
			if(MyMouse.currentMode.equals("Line")) g2.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);	
			else if(MyMouse.currentMode.equals("Quadrangle")) g.drawRect(Math.min(startPoint.x, endPoint.x), Math.min(startPoint.y, endPoint.y),Math.abs(endPoint.x - startPoint.x),Math.abs(endPoint.y - startPoint.y));
			else if(MyMouse.currentMode.equals("Circle")) g.drawOval(Math.min(startPoint.x, endPoint.x), Math.min(startPoint.y, endPoint.y),Math.abs(endPoint.x - startPoint.x),Math.abs(endPoint.y - startPoint.y));
			else if(MyMouse.currentMode.equals("PolyLine")) {
				for(int i =0; i<MyDatas.sketchMemory.size()-1; i++) {
					g2.drawLine(MyDatas.sketchMemory.get(i).x, MyDatas.sketchMemory.get(i).y, MyDatas.sketchMemory.get(i+1).x, MyDatas.sketchMemory.get(i+1).y);
					
				}
				MyDatas.sketchMemory.clear();
			}
	//			else if(GraphicEditor.tool.equals("Eraser")) {
	//				for(int i =0; i<pointArrayList.size()-1; i++) {
	//					g2.setColor(Color.WHITE);
	//					g.drawLine(pointArrayList.get(i).x, pointArrayList.get(i).y, pointArrayList.get(i+1).x, pointArrayList.get(i+1).y);
	//				}
	//			}
		}
		
		
        
		
	}
	
	
	public void setStartAndEndPointNull() {
		startPoint = null;
		endPoint = null;
	}
}
