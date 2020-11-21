package v1;

import java.awt.*;

public class MyRect {
   private Color color; 
   private int x1, y1, x2, y2;

   public MyRect(Color color, int x1, int y1, int x2, int y2){
       this.color = color;
       this.x1 = x1;
       this.y1 = y1;
       this.x2 = x2;
       this.y2 = y2;
       System.out.println("Creating " + color + " rectangle");
   }

   public void draw(Graphics g){
       g.setColor(color);
       g.fillRect(this.x1, this.y1, this.x2, this.y2);
   }
}
