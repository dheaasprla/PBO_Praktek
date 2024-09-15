package com.polban.jtk.sales;

public class Product {
    private String namaProduk;
    private double harga;
    private int stok;

    public Product(String namaProduk, double harga, int stok) {  // Pastikan nama konstruktor sesuai dengan nama kelas
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter untuk nama produk
    public String getNamaProduk() {
        return namaProduk;
    }

    // Getter untuk harga dengan format agar tidak muncul notasi ilmiah
    public String getHarga() {
        return String.format("%.2f", harga);
    }

    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak valid!");
        }
    }

    public int getStok() {
        return stok;
    }

    // Menambah stok produk
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        } else {
            System.out.println("Jumlah stok tidak valid!");
        }
    }

    // menjual produk
    public void jualProduk(int kuantitas) {
        if (kuantitas > 0 && kuantitas <= stok) {
            stok -= kuantitas;
            System.out.println(kuantitas + " " + namaProduk + " terjual.");
        } else {
            System.out.println("Jumlah stok tidak cukup untuk penjualan.");
        }
    }
}
