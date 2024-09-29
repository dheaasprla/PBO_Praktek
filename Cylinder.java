package Exercise1;

/**
 * The Cylinder class is a subclass of Circle with an additional height attribute.
 */
public class Cylinder extends Circle {
    // Private instance variable for height
    private double height;

    // 1st constructor: Default constructor with default radius, color, and height
    public Cylinder() {
        super();  // Calls Circle's no-arg constructor
        height = 1.0;
    }


    public Cylinder(double radius, double height) {
        super(radius);  // Calls Circle's constructor with radius
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);  // Calls Circle's constructor with radius and color
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
