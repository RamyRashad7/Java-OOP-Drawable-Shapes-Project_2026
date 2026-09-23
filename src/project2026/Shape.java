package project2026;
   import java.util.Date;


public abstract class Shape implements Drawable {
    private Date dateCreated;
    protected String color;

    public Shape() {
        this.color = "Black";
    }

    public Shape(String color) {
        this.color = color;
    }

    
    public Shape(Date dateCreated, String color) {
        this.dateCreated = dateCreated;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
