package com.indivaragroup.generic.comparatorinterface;

public class Product {
    String nama;
    double harga;

    public Product(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return nama + " (RP" + harga + ")";
    }
}
