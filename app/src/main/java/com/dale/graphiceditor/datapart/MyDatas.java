package com.dale.graphiceditor.datapart;

import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;

public class MyDatas {
	public static ArrayList<Point> startVector = new ArrayList<Point>(); // ����
	public static ArrayList<Point> endVector = new ArrayList<Point>(); // ����
	public static ArrayList<String> mode = new ArrayList<String>();//�����̸� ����
	public static ArrayList<Color> color = new ArrayList<Color>();
	public static ArrayList<Integer> stroke = new ArrayList<Integer>();
	public static Stack<ArrayList<MyDatas>> forUndoStack = new Stack<ArrayList<MyDatas>>();
	public static Stack<ArrayList<MyDatas>> forRedoStack = new Stack<ArrayList<MyDatas>>();
}
