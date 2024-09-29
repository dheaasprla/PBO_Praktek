package Exercise2;

public class Square extends Rectangle {

    // Konstruktor tanpa argumen
    public Square() {
        super(1.0, 1.0);
    }

    // Konstruktor dengan sisi
    public Square(double side) {
        super(side, side);
    }

    // Konstruktor dengan sisi, color, dan filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter untuk sisi (menggunakan getWidth karena sisi = width = length)
    public double getSide() {
        return getWidth();
    }

    // Setter untuk sisi (mengubah width dan length secara bersamaan)
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override metode toString
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }

    // Override setter untuk width dan length agar tetap menjaga sisi yang sama
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
}

