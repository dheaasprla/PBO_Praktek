package Exercise1;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {
    // Private instance variables
    private double radius;
    private String color;

    // 1st constructor: Constructs a Circle instance with default radius and color
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // 2nd constructor: Constructs a Circle instance with the given radius and default color
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    // 3rd constructor: Constructs a Circle instance with the given radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Returns the area of this circle
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Returns a self-descriptive string of this instance in the form of Circle[radius=?,color=?]
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
