package project2026;

import java.awt.Graphics;

public class Cube extends ThreeDShape {

    private double side;

    public Cube() {
        super();
        this.side = 0;
    }

    public Cube(double side) {
        super("Black");
        this.side = side;
    }

    public Cube(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(200, 200, (int) side, (int) side);
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
