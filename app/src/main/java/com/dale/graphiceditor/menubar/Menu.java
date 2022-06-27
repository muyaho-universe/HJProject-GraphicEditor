package com.dale.graphiceditor.menubar;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class Menu extends JMenu{
	LoadFileMenuItem loadFileMenuItem;
	SaveFileMenuItem saveFileMenuItem;
	Menu(){
		super("ÆÄÀÏ");
	}
	
	public void createMenu() {
		saveFileMenuItem = new SaveFileMenuItem();
		loadFileMenuItem = new LoadFileMenuItem();
		
		this.add(saveFileMenuItem);
		this.add(loadFileMenuItem);
	}
	
	
	
	public LoadFileMenuItem getLoadFileMenuItem() {
		return loadFileMenuItem;
	}
	
	public SaveFileMenuItem getSaveFileMenuItem() {
		return saveFileMenuItem;
	}
}
