package com.dale.graphiceditor.frame;

import javax.swing.ImageIcon;
import javax.swing.*;

public class LoadFileFrame extends JFrame {
	public static final ImageIcon ICON_COMPUTER = new ImageIcon("computer.gif");
	public static final ImageIcon ICON_DISK = new ImageIcon("disk.gif");
	public static final ImageIcon ICON_FOLDER = new ImageIcon("folder.gif");
	public static final ImageIcon ICON_EXPANDEDFOLDER = new ImageIcon("expandedfolder.gif");
	protected JTree  m_tree;
	  protected DefaultTreeModel m_model;
	  protected JTextField m_display;
}
