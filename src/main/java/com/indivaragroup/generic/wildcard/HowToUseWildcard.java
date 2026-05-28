package com.indivaragroup.generic.wildcard;

import java.util.List;

public class HowToUseWildcard {
    static void cetakSemua(List<?> daftar) {
        for (Object item : daftar) {
            System.out.println(item);
        }
    }

    static void cetakKotak(Kotak<?> kotak) {
        System.out.println("Isi Kotak: " + kotak.getData());
    }

    public static void main(String[] args) {
        List<String> namaDaftar = List.of("Budi", "Wowok", "Cok");
        cetakSemua(namaDaftar);

        List<Integer> angkaDaftar = List.of(1, 2, 3);
        cetakSemua(angkaDaftar);

        cetakKotak(new Kotak<>("HalOW"));
        cetakKotak(new Kotak<>(99));
    }
}
