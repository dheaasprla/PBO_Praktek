package src;

import java.util.Scanner;

public class OperasiString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();
        String B = scanner.next();

        int panjangA = A.length();
        int panjangB = B.length();
        System.out.println(panjangA + panjangB);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String A_Capitalized = A.substring(0, 1).toUpperCase() + A.substring(1);
        String B_Capitalized = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A_Capitalized + " " + B_Capitalized);

        scanner.close();
    }
}
