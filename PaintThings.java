package StudiKasus2;

import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        Rectangle deck = new Rectangle(20, 35);  // Persegi panjang dengan panjang 20 dan lebar 35
        Sphere bigBall = new Sphere(15);  // Bola dengan radius 15
        Cylinder tank = new Cylinder(10, 30);  // Tabung dengan radius 10 dan tinggi 30

        // Menghitung jumlah cat yang diperlukan untuk setiap bentuk
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);


        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
