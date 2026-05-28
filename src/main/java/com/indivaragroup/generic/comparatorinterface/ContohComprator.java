package com.indivaragroup.generic.comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContohComprator {

    public static void main(String[] args) {

        List<Product> daftar = new ArrayList<>();

        daftar.add(new Product("Laptop", 1500000));
        daftar.add(new Product("Mouse", 150000));
        daftar.add(new Product("Keyboard", 15000));

        // Comparator berdasarkan harga with lambda
        Comparator<Product> urutHarga = (p1, p2) -> Double.compare(p1.harga, p2.harga);

        Collections.sort(daftar, urutHarga);

        System.out.println("Urutan berdasarkan harga:");
        daftar.forEach(System.out::println);

        // Comparator berdasarkan nama lambda
        daftar.sort(Comparator.comparing(p -> p.nama));

        System.out.println("\nUrutan berdasarkan nama:");
        daftar.forEach(System.out::println);
    }
}