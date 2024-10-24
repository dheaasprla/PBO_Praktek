package Case3;

// *******************************************************************
//Factorials.java
// Reads integers from the user and prints the factorial of each.
// *******************************************************************
import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        String keepGoing = "y";  // variabel untuk melanjutkan perhitungan faktorial
        Scanner scan = new Scanner(System.in);

        // Loop untuk terus meminta input dari pengguna hingga mereka mengetik "n"
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Masukkan bilangan bulat: ");
            int val = scan.nextInt();  // Membaca input pengguna

            // Mencoba untuk menghitung faktorial
            try {
                System.out.println("Faktorial(" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                // Menangkap exception dan mencetak pesan error
                System.out.println(e.getMessage());
            }

            // Meminta pengguna apakah ingin menghitung faktorial lagi
            System.out.print("Ingin menghitung faktorial lagi? (y/n) ");
            keepGoing = scan.next();
        }
    }
}
