package com.indivaragroup.generic.covariant;

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
        Kucing kucingOne = new Kucing();
        kucingOne.nama = "meong";
        kucingOne.warna = "kuning";
        Kandang<Kucing> kandangKuncing = new Kandang<>(kucingOne);
        lihatKandang(kandangKuncing);

    }

    static void lihatKandang(Kandang<? extends Hewan> kandang) {
        Hewan h = kandang.getPenghuni();
        System.out.println("Penghuni: "+  h.nama);
//        kandang.setPenghuni(new Hewan());
    }
}
