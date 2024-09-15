package com.polban.jtk.sales;

public class Sales {
    private Product produk;

    public Sales(Product produk) {
        this.produk = produk;
    }

    public void jualProduk(int kuantitas) {
        System.out.println("Memproses penjualan...");
        produk.jualProduk(kuantitas);
        System.out.println("Stok setelah penjualan: " + produk.getStok());
    }

    public void tambahStokProduk(int kuantitas) {
        System.out.println("Menambah stok...");
        produk.tambahStok(kuantitas);
        System.out.println("Stok setelah penambahan: " + produk.getStok());
    }

    public void perbaruiHargaProduk(double hargaBaru) {
        System.out.println("Memperbarui harga produk...");
        produk.setHarga(hargaBaru);
        System.out.println("Harga baru: " + produk.getHarga());
    }
}
