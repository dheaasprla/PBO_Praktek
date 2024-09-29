package Exercise1;

/**
 * The TestCylinder class contains the main method to test the Circle and Cylinder classes.
 */
public class TestCylinder {
    public static void main(String[] args) {
        // Test Circle class
        Circle circle1 = new Circle(5.0, "blue");
        System.out.println("Circle 1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Color: " + circle1.getColor());
        System.out.println("Area: " + circle1.getArea());
        System.out.println(circle1.toString());

        // Test Cylinder class
        Cylinder cylinder1 = new Cylinder(5.0, 10.0, "green");
        System.out.println("\nCylinder 1:");
        System.out.println("Radius: " + cylinder1.getRadius());
        System.out.println("Height: " + cylinder1.getHeight());
        System.out.println("Color: " + cylinder1.getColor());
        System.out.println("Surface Area: " + cylinder1.getArea()); // Surface area of the cylinder
        System.out.println("Volume: " + cylinder1.getVolume()); // Volume of the cylinder
        System.out.println(cylinder1.toString()); // Output the toString() from Cylinder
    }
}

