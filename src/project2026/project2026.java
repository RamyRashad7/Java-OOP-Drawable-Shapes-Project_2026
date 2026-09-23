package project2026;


import javax.swing.*;
import java.io.*;
import java.util.*;

public class project2026 {

    public static void main(String[] args) {

        Drawable[] shapes = null;

        try {
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            int n = sc.nextInt();
            shapes = new Drawable[n];

            for (int i = 0; i < n; i++) {
                String type = sc.next();
                double value = sc.nextDouble();

                if (type.equalsIgnoreCase("circle")) {
                    shapes[i] = (Drawable) new Circle(value) ;
                } else if (type.equalsIgnoreCase("cube")) {
                    shapes[i] = (Drawable) new Cube(value);
                }
            }

            sc.close();

            double sum = 0;
            for (Drawable d : shapes) {
                if (d instanceof Shape) {
                    sum += ((Shape) d).getArea();
                }
            }

            FileWriter fw = new FileWriter("sumAreas.txt");
            fw.write("Sum of Areas = " + sum);
            fw.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // GUI
        JFrame frame = new JFrame("Drawing Shapes");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.add(new DrawPanel(shapes));   
        frame.setVisible(true); 
    }
}
