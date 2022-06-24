package com.dale.graphiceditor.menubar;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class Menu extends JMenu{
	Menu(){
		super("ÆÄÀÏ");
	}
	
	public void createMenu() {
		SaveFileMenuItem saveFileMenuItem = new SaveFileMenuItem();
		LoadFileMenuItem loadFileMenuItem = new LoadFileMenuItem();
		
		this.add(saveFileMenuItem);
		this.add(loadFileMenuItem);
	}
}
