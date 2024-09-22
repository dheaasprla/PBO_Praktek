package Akademik;

public class Dosen extends CivitasAkademik {
    private String kodeDosen;

    public Dosen(String kodeDosen, String nama) {
        super(nama);
        this.kodeDosen = kodeDosen;
    }

    public String getKodeDosen() {
        return kodeDosen;
    }
}
