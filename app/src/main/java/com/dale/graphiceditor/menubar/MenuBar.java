package com.dale.graphiceditor.menubar;

import javax.swing.*;

public class MenuBar extends JMenuBar {
	
	public MenuBar() {
	}
	
	public void createMenuBar() {
		Menu menu = new Menu();
		menu.createMenu();
		this.add(menu);
	}
}
