package com.indivaragroup.generic.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mahasiswa implements Comparable<Mahasiswa>{
    private String nama;
    private double ipk;

    public Mahasiswa(String nama, double ipk) {
        this.nama = nama;
        this.ipk = ipk;
    }

    public String getNama() { return nama; }
    public double getIpk() { return ipk; }

    @Override
    public int compareTo(Mahasiswa lain) {
        return Double.compare(this.ipk, lain.ipk);
    }

    @Override
    public String toString() {
        return nama + " (IPK : " + ipk + ")";
    }

    public static void main(String[] args) {
        // Membuat object mahasiswa
        Mahasiswa m1 = new Mahasiswa("Verry", 3.75);
        Mahasiswa m2 = new Mahasiswa("Budi", 3.20);
        Mahasiswa m3 = new Mahasiswa("Sinta", 3.90);

        // Menyimpan ke dalam list
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        daftarMahasiswa.add(m1);
        daftarMahasiswa.add(m2);
        daftarMahasiswa.add(m3);

        // Sebelum sorting
        System.out.println("Sebelum sorting:");
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(m);
        }

        // Sorting berdasarkan compareTo()
        Collections.sort(daftarMahasiswa);

        // Setelah sorting
        System.out.println("\nSetelah sorting berdasarkan IPK:");
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(m);
        }
    }
}
