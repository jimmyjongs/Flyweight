package v2;

import java.awt.*;

public class MyRect {
   private Color color = Color.black;
   private int x1, y1, x2, y2;

   public MyRect(Color color){
       // intrinsic 
       this.color = color;
       System.out.println("Creating " + color. + " rectangle");
   }

   public void draw(Graphics g, int x1, int y1, int x2, int y2){
       g.setColor(color);
       g.fillRect(x1, y1, x2, y2);
   }

}
