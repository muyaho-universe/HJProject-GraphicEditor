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
				System.out.println("�׸���~~" + MyMouse.currentColor);
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
//        super.paintComponent(g); // �θ� ����Ʈȣ��
//        Graphics2D g2d = (Graphics2D) g.create();
//          
//        if(sv.size() != 0){
//           for(int i=0;i<se.size();i++){ 
//              //���� ����Ʈ ũ�⸸ŭ
//              Point sp = sv.get(i); // ������
//              Point ep = se.get(i); // ����
//              String on = name.get(i); // �̸�
//              Color tmp = co.get(i); // ����
//              Integer s = st.get(i);//����
//              //������ ���� �׷��ֱ�
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
//                    System.out.println("index��"+index);
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
//        //���콺�� Ŭ���ϸ鼭 ���������� �׷����� ����
//        if(startP != null) {
//           g2d.setColor(ColorChooser.color);
//           g2d.setStroke(new BasicStroke(Button_stroke.stroke));
//           //���α׸���
//           if(sl==true) {
//              g2d.drawLine(startP.x, startP.y, endP.x, endP.y);
//           }
//           //�簢�� �׸���
//           else if(ss==true) {
//              g2d.drawRect(Math.min(startP.x,endP.x), Math.min(startP.y,endP.y), Math.abs(startP.x-endP.x), Math.abs(startP.y-endP.y));//�׸���
//           }
//           //�� �׸���
//           else if(sc==true) {
//              
//              g2d.drawOval(Math.min(startP.x,endP.x), Math.min(startP.y,endP.y), Math.abs(startP.x-endP.x), Math.abs(startP.y-endP.y));//�׸���
//        
//           }
//        }
//     }

}
