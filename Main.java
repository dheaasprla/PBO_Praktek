import Akademik.Mahasiswa;
import Akademik.Dosen;
import Akademik.JadwalPerkuliahan;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
    static ArrayList<Dosen> dosenList = new ArrayList<>();
    static ArrayList<JadwalPerkuliahan> jadwalList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        // Tambahkan data dummy mahasiswa, dosen, dan jadwal
        tambahDataDummy();

        do {
            System.out.println("\n=== AKADEMIK ===");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Tampilkan Jadwal Perkuliahan");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanMahasiswa();
                    break;
                case 2:
                    tampilkanDosen();
                    break;
                case 3:
                    tampilkanJadwal();
                    break;
                case 0:
                    System.out.println("Keluar program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 0);
    }

    // Tambahkan data dummy
    public static void tambahDataDummy() {
        // Data Mahasiswa
        mahasiswaList.add(new Mahasiswa("231511033", "Ahmad Fauzan Naji"));
        mahasiswaList.add(new Mahasiswa("231511035", "Alya Gustiani"));
        mahasiswaList.add(new Mahasiswa("231511037", "Bandyaga A. Sugandi"));
        mahasiswaList.add(new Mahasiswa("231511039", "Daiva Raditya P."));
        mahasiswaList.add(new Mahasiswa("231511040", "Dhea Dria Spralia"));
        mahasiswaList.add(new Mahasiswa("231511043", "Erina Dwi Yanti"));
        mahasiswaList.add(new Mahasiswa("231511046", "Febytha Putri N."));
        mahasiswaList.add(new Mahasiswa("231511047", "Firgianathyas Siti"));
        mahasiswaList.add(new Mahasiswa("231511050", "Indah Ratu P"));
        mahasiswaList.add(new Mahasiswa("231511063", "Yani Rahmawati"));


        // Data Dosen
        dosenList.add(new Dosen("KO061N", "Zulkifli Arsyad"));
        dosenList.add(new Dosen("KO001N", "Ade Chandra Nugraha"));
        dosenList.add(new Dosen("KO052N", "Yadhi Aditya P."));
        dosenList.add(new Dosen("KO075N", "Siti Dwi Setiarini"));
        dosenList.add(new Dosen("KO013N", "Yudi Whidiyasana"));
        dosenList.add(new Dosen("KO009N", "Santi Sundari"));
        dosenList.add(new Dosen("KO078N", "Trisna Gelar A"));
        dosenList.add(new Dosen("KO060N", "Ade Hodijah"));
        dosenList.add(new Dosen("KO074N", "Muhammad Riqzqi S"));
        dosenList.add(new Dosen("KO003N", "Bambang Wisnuadhi"));
        dosenList.add(new Dosen("KO079N", "Wendi Wirasta"));
        dosenList.add(new Dosen("KO005N", "Didik Suwito Pribadi"));

        // Tambahkan jadwal perkuliahan
        jadwalList.add(new JadwalPerkuliahan("Senin", "08:40 - 10:40", "D105-kelas", "Komputer Grafik (T)", dosenList.get(4)));
        jadwalList.add(new JadwalPerkuliahan("Senin", "10:40 - 12:20", "D105-kelas", "Perankat Rekayasa Perangkat Lunak (T)", dosenList.get(5)));
        jadwalList.add(new JadwalPerkuliahan("Senin", "13:00 - 15:30", "D102-lab MT", "Komputer Grafik (P)", dosenList.get(6)));
        jadwalList.add(new JadwalPerkuliahan("Selasa", "07:00 - 12:20", "D106-lab SDB", "Basic Data (P)", dosenList.get(7)));
        jadwalList.add(new JadwalPerkuliahan("Selasa", "13:00 - 14:40", "D101-kelas", "Aljabar Linear (T)", dosenList.get(8)));
        jadwalList.add(new JadwalPerkuliahan("Rabu", "07:00 - 16:40", "D116-lab PJBL-2", "Proyek 3", dosenList.get(9)));
        jadwalList.add(new JadwalPerkuliahan("Rabu", "07:00 - 16:40", "D116-lab PJBL-2", "Proyek 3", dosenList.get(10)));
        jadwalList.add(new JadwalPerkuliahan("Rabu", "07:00 - 16:40", "D116-lab PJBL-2", "Proyek 3", dosenList.get(11)));
        jadwalList.add(new JadwalPerkuliahan("Kamis", "07:00 - 08:40", "D105-kelas", "Basic Data (T)", dosenList.get(1)));
        jadwalList.add(new JadwalPerkuliahan("Kamis", "08:00 - 10:40", "D105-kelas", "Pemrograman Berorientasi Objek (T)", dosenList.get(0)));
        jadwalList.add(new JadwalPerkuliahan("Kamis", "10:40 - 13:50", "D116-lab PJBL-2", "Pemrograman Berorientasi Objek (P)", dosenList.get(0)));
        jadwalList.add(new JadwalPerkuliahan("Kamis", "13:50 - 16:40", "D108-kelas", "Matematika diskrit II (T)", dosenList.get(4)));
        jadwalList.add(new JadwalPerkuliahan("Jumat", "07:50 - 14:40", "D116-lab PJBL-2", "Perankat Rekayasa Perangkat Lunak (3)", dosenList.get(3)));
    }

    // Menampilkan data mahasiswa
    public static void tampilkanMahasiswa() {
        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa mhs : mahasiswaList) {
            System.out.println("NIM: " + mhs.getNIM() + ", Nama: " + mhs.getNama());
        }
    }

    // Menampilkan data dosen
    public static void tampilkanDosen() {
        System.out.println("\nData Dosen:");
        for (Dosen dosen : dosenList) {
            System.out.println("Kode Dosen: " + dosen.getKodeDosen() + ", Nama: " + dosen.getNama());
        }
    }

    // Menampilkan jadwal perkuliahan
    public static void tampilkanJadwal() {
        System.out.println("\nJadwal Perkuliahan:");
        System.out.println("+------------+------------+------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
        System.out.printf("| %-10s | %-25s | %-30s | %-40s | %-50s |%n", "Hari", "Waktu", "Ruangan", "Mata Kuliah", "Dosen Pengampu");
        System.out.println("+------------+------------+------------+----------------------+----------------------+----------------------+----------------------+----------------------+");

        for (JadwalPerkuliahan jadwal : jadwalList) {
            System.out.printf("| %-10s | %-25s | %-30s | %-40s | %-50s |%n",
                    jadwal.getHari(), jadwal.getWaktu(), jadwal.getRuangan(), jadwal.getMataKuliah(), jadwal.getDosenPengampu().getNama());
            System.out.println("+------------+------------+------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
        }
    }
}
