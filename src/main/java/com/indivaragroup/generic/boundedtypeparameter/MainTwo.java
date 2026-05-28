package com.indivaragroup.generic.boundedtypeparameter;

public class MainTwo {
    // bounded type parameter
    public static <T extends Bentuk> void tampilkanLuas(T bentuk) {

        System.out.println(
                "Luas: " + bentuk.hitungLuas()
        );
    }

    public static <T extends Bentuk> void bandingkan(T a, T b) {
        int hasil = a.compareTo(b);

        if (hasil > 0) {
            System.out.println("Objek pertama lebih besar");
        }
        else if (hasil < 0) {
            System.out.println("Objek kedua lebih besar");
        }
        else {
            System.out.println("Keduanya sama");
        }
    }

    public static void main(String[] args) {

        Lingkaran lingkaran = new Lingkaran(7);

        Persegi persegi = new Persegi(10);

        tampilkanLuas(lingkaran);
        tampilkanLuas(persegi);

        bandingkan(lingkaran, persegi);
    }
}