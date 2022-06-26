package com.dale.graphiceditor.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.dale.graphiceditor.mouse.MyMouse;

public class StrokeSelectFrame extends JFrame {
	private final int MIN_FONT = 0;
	private final int MAX_FONT = 50;
	private final int CURR_FONT = 5;
	private int stroke;
	private boolean setVisible = true;
	
	JSlider slider = new JSlider(JSlider.HORIZONTAL, MIN_FONT, MAX_FONT, 5);
	//thickness.addChangeListener(this);
	JLabel label = new JLabel();
	JButton ok = new JButton("확인");
	JButton cancel = new JButton("취소");
	JPanel buttonPanel = new JPanel();
	public StrokeSelectFrame(boolean setVisible) {
		 this.setTitle("굵기 고르기");
	     this.setLocation(400, 200);
	     this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 this.setVisible = setVisible;	     
	     pack();
	     setVisible(this.setVisible);
	     slider.setPaintLabels(true);
	     slider.setPaintTicks(true);
	     slider.setPaintTrack(true);
	     slider.setMajorTickSpacing(10);
	     slider.setMinorTickSpacing(CURR_FONT);
	     
	     buttonPanel.setSize(40, 5);
	     buttonPanel.setLayout(new FlowLayout());
	     ok.setSize(20, 5);
	     ok.addActionListener(new OKAction());
	     cancel.setSize(20, 5);
	     cancel.addActionListener(new CancelAction());
	     
	     MyMouse.currentStroke = slider.getValue();
	     
	     slider.addChangeListener(new MyChangeListener());
	     
	     label.setText("슬라이더를 움직이세요 : " +   MyMouse.currentStroke);
	     label.setBounds(20,20,150,40);
         this.add(label, BorderLayout.NORTH);
         //System.out.println(SelectBar.tsize);
         this.add(slider, BorderLayout.CENTER);
         
         buttonPanel.add(ok);
         buttonPanel.add(cancel);
         
         this.add(buttonPanel, BorderLayout.SOUTH);
         this.setSize(300,300);
         
	     
	}
	 class MyChangeListener implements ChangeListener{

         @Override
         public void stateChanged(ChangeEvent e) {
            // TODO Auto-generated method stub
        	 stroke = slider.getValue();
        	 label.setText("슬라이더를 움직이세요 : "+ slider.getValue());
              //System.out.println(SelectBar.tsize);
         }
       }
	
	 public void createVisible() {
		 
	 }
	class OKAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			MyMouse.currentStroke = slider.getValue();
			StrokeSelectFrame.this.hide();
		}
		
	}
	
	class CancelAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			StrokeSelectFrame.this.hide();
		}
		
	}

}
