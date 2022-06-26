package com.dale.graphiceditor.frame;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.event.ChangeListener;

public class StrokeSelectFrame extends JFrame {
	static final int MIN_FONT = 0;
	static final int MAX_FONT = 50;
	static final int CURR_FONT = 5;
	
	JSlider slider = new JSlider(JSlider.HORIZONTAL, MIN_FONT, MAX_FONT, 5);
	//thickness.addChangeListener(this);
	JLabel l = new JLabel();
	
	public StrokeSelectFrame() {
		 this.setTitle("굵기 고르기");
	     this.setLocation(400, 200);
	     this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 
	     
	     pack();
		 setVisible(true);
	     slider.setPaintLabels(true);
	     slider.setPaintTicks(true);
	     slider.setPaintTrack(true);
	     slider.setMajorTickSpacing(10);
	     slider.setMinorTickSpacing(CURR_FONT);
	     
	     SelectBar.tsize = slider.getValue();
	     
	     slider.addChangeListener(new MyChangeListener());
	     
	     l.setText("슬라이더를 움직이세요 : " +  SelectBar.tsize);
         l.setBounds(20,20,150,40);
         this.add(l, BorderLayout.NORTH);
         //System.out.println(SelectBar.tsize);
         this.add(slider, BorderLayout.CENTER);
         this.setSize(300,300);
         this.setVisible(true);
	     
	}
	 class MyChangeListener implements ChangeListener{

         @Override
         public void stateChanged(ChangeEvent e) {
            // TODO Auto-generated method stub
        	 SelectBar.tsize = slider.getValue();
              l.setText("슬라이더를 움직이세요 : "+ SelectBar.tsize);
              //System.out.println(SelectBar.tsize);
         }
       }
	
	public void changing() {

		
	}

}
