package com.dale.graphiceditor.datapart;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class MyDatas {
	public static ArrayList<Point> startVector = new ArrayList<Point>(); // 시작
	public static ArrayList<Point> endVector = new ArrayList<Point>(); // 끝점
	public static ArrayList<String> mode = new ArrayList<String>();//도형이름 저장
	public static ArrayList<Color> color = new ArrayList<Color>();
	public static ArrayList<Integer> stroke = new ArrayList<Integer>();
	public static  Vector<Vector<Point>> curves = new Vector<Vector<Point>>();
	public static Stack<Object> shapeMemory = new Stack<Object>();
	public static Stack<Color> colorMemory = new Stack<Color>();
	public static Stack<Integer> strokeMemory = new Stack<Integer>();
	public static Stack<Data> shapeRedoMemory = new Stack<Data>();
	public static Stack<Color> colorRedoMemory = new Stack<Color>();
	public static Stack<Integer> strokeRedoMemory = new Stack<Integer>();
	public static ArrayList<Point> sketchMemory = new ArrayList<Point>();
	public static Stack<Data> memo = new Stack<Data>();
	
	
	public static BufferedImage currentImage;
	public static String loadedImage = null;
}
