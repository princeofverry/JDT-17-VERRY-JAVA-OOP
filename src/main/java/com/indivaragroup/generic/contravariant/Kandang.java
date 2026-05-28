package com.indivaragroup.generic.contravariant;

import com.indivaragroup.generic.covariant.Hewan;

public class Kandang<T> {
    private T penghuni;

    public Kandang(T penghuni) {
        this.penghuni = penghuni;
    }

    public void setPenghuni(T penghuni) {
        this.penghuni = penghuni;
    }

    public T getPenghuni() { return penghuni; }

    public static void main(String[] args) {
        com.indivaragroup.generic.contravariant.Hewan hewan = new com.indivaragroup.generic.contravariant.Hewan();
        hewan.nama = "Hewan Umum";

        Kandang<com.indivaragroup.generic.contravariant.Hewan> kandangHewan= new Kandang<>(hewan);

        lihatKandang(kandangHewan);
    }

    static void lihatKandang(Kandang <? super Kucing> kandang) {
        Kucing kucing = new Kucing();
        kucing.nama = "Meong";
        kucing.warna = "hijau";

        kandang.setPenghuni(kucing);

        // object
        Object obj = kandang.getPenghuni();

        System.out.println("Penghuni : " + obj);
    }
}
