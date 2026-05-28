package com.indivaragroup.generic.boundedtypeparameter;

public class ContohMultipleBounded {
    public static void main(String[] args) {
        KoleksiBentuk<Lingkaran> koleksi = new KoleksiBentuk<>();
        koleksi.tambah(new Lingkaran(5));
        koleksi.tambah(new Lingkaran(3));
        koleksi.tambah(new Lingkaran(7));

        Lingkaran terbesar = koleksi.terbesar();
        System.out.println("LUAS TERBESAR " + terbesar.hitungLuas());
    }
}