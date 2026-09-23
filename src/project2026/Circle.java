package project2026;

import java.awt.Graphics;
public  class Circle extends Shape {



    private double radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(double radius) {
        super("Black");
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw(Graphics g) {
        g.drawOval(50, 50, (int) radius * 2, (int) radius * 2);
    }

    @Override
    public String HowToDraw() {
    return "This shape is drawn using Graphics methods";
        }

   @Override
    public double getPerimeter() {
    return 0 ;
        }

    
}
