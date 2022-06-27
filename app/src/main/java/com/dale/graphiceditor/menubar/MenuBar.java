package com.dale.graphiceditor.menubar;

import javax.swing.*;

public class MenuBar extends JMenuBar {
	private Menu menu;
	public MenuBar() {
	}
	
	public void createMenuBar() {
		menu = new Menu();
		menu.createMenu();
		this.add(menu);
		
	}
	public Menu getMenu() {
		return menu;
	}
}
