package com.dale.graphiceditor.datapart;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class Data {
   Object shape;
   Color color;
   int stroke;
   ArrayList<Point> sketch;

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
//      for (int i = 0; i < sketch.size(); i++) {
//         System.out.println(sketch.get(i));
//      }
      //
//      for (int i = 0; i < ske.size(); i++)
//         this.sketch.add(ske.get(i));
   }
}
