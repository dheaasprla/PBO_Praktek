import java.util.Scanner;

public class GajiAgent {
    public static void main(String[] args) {
        int gj_Pokok = 500000;
        int hargaItem = 50000;
        double gj_Akhir = gj_Pokok;

        System.out.println("Program Perhitungan Gaji Agent Penjualan");
        System.out.println("========================================");
        System.out.println("Harga setiap item: Rp. 50.000,00");
        System.out.println("Gaji Pokok: Rp. 500.000,00");
        System.out.print("Masukkan jumlah penjualan bulan ini: ");

        Scanner scanner = new Scanner(System.in);
        int jml_Penjualan = scanner.nextInt();
        int tot_Penjualan = jml_Penjualan * hargaItem;

        if (jml_Penjualan >= 80) {
            gj_Akhir += tot_Penjualan * 0.35;
        } else if (jml_Penjualan >= 40) {
            gj_Akhir += tot_Penjualan * 0.25;
        } else if (jml_Penjualan < 15) {
            int selisih = 15 - jml_Penjualan;
            double denda = selisih * hargaItem * 0.15;
            gj_Akhir -= denda;
        } else {
            gj_Akhir += tot_Penjualan * 0.10;
        }

        System.out.println("========================================");
        System.out.println("Gaji yang diterima bulan ini: Rp. " + (int) gj_Akhir);
        System.out.println("========================================");

        scanner.close();
    }
}
