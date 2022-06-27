package com.dale.graphiceditor.menubar;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.swing.JFrame;

import javax.swing.JMenuItem;

import com.dale.graphiceditor.datapart.MyDatas;

public class SaveFileMenuItem extends JMenuItem implements ActionListener{
	SaveFileMenuItem(){
		super("파일 저장");
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\kimda\\OneDrive\\바탕 화면\\drawing.png");
		if (!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		try {
			ImageIO.write(MyDatas.currentImage, "png", file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
