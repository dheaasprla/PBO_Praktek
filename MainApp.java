package com.polban.jtk.salesjar;

import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class MainApp {
    public static void main(String[] args) {
        // Load the JAR file into the classpath
        Product laptop = new Product("Laptop", 14000000, 10);
        Sales penjualanLaptop = new Sales(laptop);

        penjualanLaptop.jualProduk(3);
        penjualanLaptop.tambahStokProduk(5);
        penjualanLaptop.perbaruiHargaProduk(14900000);
        penjualanLaptop.perbaruiHargaProduk(-500000); // Test invalid price
    }
}
