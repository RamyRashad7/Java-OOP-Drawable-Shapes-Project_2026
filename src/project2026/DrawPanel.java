package project2026;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private Drawable[] shapes;

    public DrawPanel(Drawable[] shapes) {
        this.shapes = shapes;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (shapes == null) return;

        Graphics2D g2 = (Graphics2D) g;
     
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);

        int x = 180; 
        int y = 80;  
        for (Drawable d : shapes) {

   
            if (d instanceof Circle) {
                Circle c = (Circle) d;

                int r = (int) c.getRadius();
                int diameter = r * 2;

              
                RadialGradientPaint paint = new RadialGradientPaint(
                        new Point(x + r / 2, y + r / 2), 
                        r * 1.5f,                        
                        new float[]{0f, 1f},           
                        new Color[]{
                                Color.WHITE,          
                                Color.GRAY             
                        }
                );

             
                g2.setPaint(paint);

              
                g2.fillOval(x, y, diameter, diameter);

               
                g2.setColor(Color.BLACK);
                g2.drawOval(x, y, diameter, diameter);

                y += diameter + 70;
            }

            else if (d instanceof Cube) {
                Cube c = (Cube) d;

                int s = (int) c.getSide();
                int depth = 30; 

                
                g2.drawRect(x, y, s, s);

            
                g2.drawRect(x + depth, y - depth, s, s);

               
                g2.drawLine(x, y, x + depth, y - depth);
                g2.drawLine(x + s, y, x + s + depth, y - depth);
                g2.drawLine(x, y + s, x + depth, y + s - depth);
                g2.drawLine(x + s, y + s, x + s + depth, y + s - depth);

                
                y += s + 90;
            }
        }
    }
}
