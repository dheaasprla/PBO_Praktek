package Exercise2;

public class TestShapes {
    public static void main(String[] args) {
        // Menguji kelas Shape
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        // Menguji kelas Circle
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(5.0);
        System.out.println(circle2);

        Circle circle3 = new Circle(7.0, "yellow", true);
        System.out.println(circle3);

        // Menguji kelas Rectangle
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(4.0, 5.0);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle(3.0, 6.0, "purple", false);
        System.out.println(rectangle3);

        // Menguji kelas Square
        Square square1 = new Square();
        System.out.println(square1);

        Square square2 = new Square(6.0);
        System.out.println(square2);

        Square square3 = new Square(8.0, "pink", true);
        System.out.println(square3);
    }
}
