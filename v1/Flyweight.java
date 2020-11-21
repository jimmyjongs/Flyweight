package v1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class Flyweight extends JFrame{
    JButton startDrawing;

    // intrinsic
    final Color[] shapeColor = {Color.orange, Color.green, Color.blue, Color.gray, Color.red, Color.pink,
    Color.black, Color.yellow, Color.magenta, Color.white};


    public Flyweight(){
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setTitle("Top Text");

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        final JPanel drawPanel = new JPanel();

        this.startDrawing = new JButton("Draw");

        content.add(drawPanel, BorderLayout.CENTER);
        content.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = drawPanel.getGraphics();

                for(int i = 0; i < 100000; ++i){
                    MyRect rect = new MyRect(getRandColor(), getRand(), getRand(), getRand(), getRand());
                    rect.draw(g);
                }
                System.out.println("Done");
            }
        });
        this.add(content);
        this.setVisible(true);
    }

    private Color getRandColor(){
        Random rand = new Random();
        return shapeColor[rand.nextInt(shapeColor.length)];
    }

    private int getRand(){
        return (int)(Math.random()*1000);
    }

    public static void main(String[] args){
        new Flyweight();

    }

    
}
