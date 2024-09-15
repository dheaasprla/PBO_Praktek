package com.polban.jtk.inventory;

public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    // Getter untuk stok
    public int getStok() {
        return stok;
    }

    // Method khusus untuk menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Jumlah penambahan harus positif.");
        }
    }

    // Getter untuk nama_barang
    public String getNamaBarang() {
        return nama_barang;
    }
}
