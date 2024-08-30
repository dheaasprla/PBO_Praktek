import java.util.Scanner;

public class WD2Soal1 {
    public static void main(String[] args) {
        Scanner pemindai = new Scanner(System.in);
        int T = pemindai.nextInt(); // Jumlah test case

        for (int i = 0; i < T; i++) {
            try {
                long n = pemindai.nextLong();
                System.out.println(n + " dapat dimuat dalam:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(pemindai.next() + " tidak dapat dimuat di mana pun.");
            }
        }

        pemindai.close();
    }
}
