package com.dale.graphiceditor.panel;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import com.dale.graphiceditor.GraphicEditorFrame;
import com.dale.graphiceditor.SkectchArea;
import com.dale.graphiceditor.buttons.DragPoint;
import com.dale.graphiceditor.mouse.*;
import java.awt.event.*;

public class DrawablePanel extends JPanel{
	private boolean hasMouse = false;
	private boolean isDrawing = false;
	
	public DrawablePanel() {
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		this.setMinimumSize(new Dimension(5, 5));
		this.setMaximumSize(new Dimension(GraphicEditorFrame.monitorWidth, GraphicEditorFrame.skectchAreaPanelHeight / 2));	
		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		this.addMouseListener(new DrawInPanel());
	}
	
	public void setSize() {
		this.setBounds(GraphicEditorFrame.drawablePanelX, GraphicEditorFrame.drawablePanelY, GraphicEditorFrame.drawablePanelWidth, GraphicEditorFrame.drawablePanelHeight);
	}
	
	class DrawInPanel implements MouseListener, MouseMotionListener{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			if(hasMouse) {
				isDrawing = true;
				System.out.println("그리자~~" + MyMouse.currentColor);
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			isDrawing = false;
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			hasMouse = true;
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			hasMouse = false;
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			if(isDrawing) {
				
			}
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
//	public void paintComponent(Graphics g){
//        super.paintComponent(g); // 부모 페인트호출
//        Graphics2D g2d = (Graphics2D) g.create();
//          
//        if(sv.size() != 0){
//           for(int i=0;i<se.size();i++){ 
//              //넣은 리스트 크기만큼
//              Point sp = sv.get(i); // 시작점
//              Point ep = se.get(i); // 끝점
//              String on = name.get(i); // 이름
//              Color tmp = co.get(i); // 색깔
//              Integer s = st.get(i);//굵기
//              //꺼내서 도형 그려주기
//              
//              g2d.setColor(tmp); //Lines' Color is set here
//              g2d.setStroke(new BasicStroke(s));
//              if(on.equals("rect")) {
//                 g2d.drawRect(Math.min(sp.x,ep.x), Math.min(sp.y,ep.y), Math.abs(sp.x-ep.x), Math.abs(sp.y-ep.y));
//              }
//              else if(on.equals("line")) {
//                 g2d.drawLine(sp.x, sp.y, ep.x, ep.y);
//              }
//              else if(on.equals("circle")) {
//                 g2d.drawOval(Math.min(sp.x, ep.x), Math.min(sp.y, ep.y),Math.abs(sp.x- ep.x),Math.abs(sp.y - ep.y));
//              }
//              
//              else if(on.equals("pen")) {
//
//                 if(index>=0) {
//                    System.out.println("index는"+index);
//                 for(int j=0; j<for_pen.get(index).size()-1; j++) {
//                       Point tmp_a =null;
//                       Point tmp_b =null;
//                       b = for_pen.get(index).get(j);
//                       a = for_pen.get(index).get(j+1);
//                       
//                       g2d.drawLine(b.x,b.y,a.x,a.y);
//                    }
//                    index--;
//                 }
//
//                 
//              }
//              
//              
//           }
//        }
//        
//        //마우스로 클릭하면서 연속적으로 그려지는 도형
//        if(startP != null) {
//           g2d.setColor(ColorChooser.color);
//           g2d.setStroke(new BasicStroke(Button_stroke.stroke));
//           //라인그리기
//           if(sl==true) {
//              g2d.drawLine(startP.x, startP.y, endP.x, endP.y);
//           }
//           //사각형 그리기
//           else if(ss==true) {
//              g2d.drawRect(Math.min(startP.x,endP.x), Math.min(startP.y,endP.y), Math.abs(startP.x-endP.x), Math.abs(startP.y-endP.y));//그리다
//           }
//           //원 그리기
//           else if(sc==true) {
//              
//              g2d.drawOval(Math.min(startP.x,endP.x), Math.min(startP.y,endP.y), Math.abs(startP.x-endP.x), Math.abs(startP.y-endP.y));//그리다
//        
//           }
//        }
//     }

}
