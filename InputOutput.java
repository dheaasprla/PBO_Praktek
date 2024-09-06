import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        // Menghilangkan karakter yang bukan huruf alfabet dan membagi string
        String[] tokens = s.split("[^A-Za-z]+");

        // Menghitung jumlah token dan mencetaknya
        System.out.println(tokens.length);

        // Mencetak setiap token pada baris baru
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
