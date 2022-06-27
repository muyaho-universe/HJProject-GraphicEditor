package com.dale.graphiceditor.datapart;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class Data {
   private Object shape;
   private Color color;
   private int stroke;
   private ArrayList<Point> sketch;

   public Data(Object shape, Color color, int stroke) {
      this.shape = shape;
      this.color = color;
      this.stroke = stroke;
      this.sketch = null;
   }

   public Data(ArrayList<Point> ske, Color color, int stroke) {
      this.shape = null;
      this.color = color;
      this.stroke = stroke;
      this.sketch = ske;
   }
   
   
   
   public Object getShape() {
	   return shape;
   }
   
   public Color getColor() {
	   return color;
   }
   
   public int getStroke() {
	   return stroke;
   }
   
   public ArrayList<Point> getSketch() {
	   return sketch;
   }
   
}
