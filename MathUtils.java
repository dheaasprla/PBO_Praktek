package Case3;

// ****************************************************************
// MathUtils.java
// Menyediakan fungsi utilitas matematika statis.
//
// ****************************************************************

public class MathUtils {

    //-------------------------------------------------------------
    // Mengembalikan faktorial dari argumen yang diberikan.
    //-------------------------------------------------------------
    public static int factorial(int n) {
        // Jika bilangan negatif, lemparkan IllegalArgumentException
        if (n < 0) {
            throw new IllegalArgumentException("Bilangan negatif tidak diizinkan");
        }

        // Jika bilangan lebih dari 16, lemparkan IllegalArgumentException (Overflow)
        if (n > 16) {
            throw new IllegalArgumentException("Overflow, nilai terlalu besar");
        }

        int fac = 1;  // Variabel untuk menyimpan hasil faktorial
        // Loop untuk menghitung faktorial
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;  // Mengembalikan hasil faktorial
    }
}
