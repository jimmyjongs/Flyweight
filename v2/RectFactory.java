package v2;
import java.util.HashMap;
import java.awt.Color;

// where the magic happens
public class RectFactory {
    private static final HashMap<Color, MyRect> rectColor = new HashMap<Color, MyRect>();

    public static MyRect getRect(Color color){
        MyRect rect = (MyRect)(rectColor.get(color));

        // queries hashmapu for existing rect with color obj
        // if doesn't exist, create one, return it
        if(rect == null){

            rect = new MyRect(color);
            rectColor.put(color, rect);
            
        }
      
        return rect;
    }
    
}
