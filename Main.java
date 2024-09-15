package com.polban.jtk.sales;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 14000000, 10); //objek produk dengan stok awal 10
        Sales penjualanLaptop = new Sales(laptop);
        penjualanLaptop.jualProduk(3);
        penjualanLaptop.tambahStokProduk(5); //menambahkan produk
        penjualanLaptop.perbaruiHargaProduk(14900000); //perbaharui harga produk
        penjualanLaptop.perbaruiHargaProduk(-500000); //input harga negatif

    }
}
