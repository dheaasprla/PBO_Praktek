package Akademik;

public class Mahasiswa extends CivitasAkademik {
    private String NIM;

    public Mahasiswa(String NIM, String nama) {
        super(nama);
        this.NIM = NIM;
    }

    public String getNIM() {
        return NIM;
    }
}
