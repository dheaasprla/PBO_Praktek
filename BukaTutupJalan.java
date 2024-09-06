import java.util.Scanner;

public class BukaTutupJalan {
    public static void main(String[] args) {
        System.out.println("Program Buka Tutup Jalan");
        System.out.println("========================");

        // Membaca input plat nomor mobil
        System.out.print("Masukkan plat nomor 4 mobil (dipisahkan spasi): ");
        Scanner scanner = new Scanner(System.in);
        String platNomor1 = scanner.next().trim();
        String platNomor2 = scanner.next().trim();
        String platNomor3 = scanner.next().trim();
        String platNomor4 = scanner.next().trim();

        // Menggabungkan nomor plat menjadi satu angka besar
        String gabungan = platNomor1 + platNomor2 + platNomor3 + platNomor4;

        // Menampilkan gabungan untuk verifikasi
        System.out.println("Gabungan nomor plat: " + gabungan);

        try {
            // Mengubah gabungan menjadi angka besar
            long gabunganAngka = Long.parseLong(gabungan);

            // Mengurangi hasil gabungan dengan 999999
            long hasilKurang = gabunganAngka - 999999;

            // Menampilkan hasil pengurangan untuk verifikasi
            System.out.println("Hasil pengurangan: " + hasilKurang);

            // Memeriksa apakah hasil pengurangan dibagi 5 sisa bagi 0
            if (hasilKurang % 5 == 0) {
                System.out.println("berhenti");
            } else {
                System.out.println("jalan");
            }
        } catch (NumberFormatException e) {
            // Menangani kasus di mana gabungan terlalu besar
            System.out.println("Error: Gabungan nomor plat terlalu besar.");
        }

        // Menutup scanner
        scanner.close();
    }
}
