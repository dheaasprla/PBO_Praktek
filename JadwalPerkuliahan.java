package Akademik;

public class JadwalPerkuliahan {
    private String hari;
    private String waktu;
    private String ruangan;
    private String mataKuliah;
    private Dosen dosenPengampu;

    public JadwalPerkuliahan(String hari, String waktu, String ruangan, String mataKuliah, Dosen dosenPengampu) {
        this.hari = hari;
        this.waktu = waktu;
        this.ruangan = ruangan;
        this.mataKuliah = mataKuliah;
        this.dosenPengampu = dosenPengampu;
    }

    public String getHari() {
        return hari;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getRuangan() {
        return ruangan;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public Dosen getDosenPengampu() {
        return dosenPengampu;
    }
}
