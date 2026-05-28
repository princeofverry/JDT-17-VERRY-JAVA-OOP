package com.indivaragroup.generic.erasure;

import java.util.ArrayList;
import java.util.List;

public class ContohProblemTypeErasure {
    public static void main(String[] args) {

        // menggunakan raw type tanpa generic
        List daftarRaw = new ArrayList();
        daftarRaw.add("halo");
        daftarRaw.add(1000); // bisa error

        // compile OK, tapi runtime ERROR
        String teks = (String) daftarRaw.get(1); // class cast exception ERROR!

        List<String> daftarAman = new ArrayList<>();
        daftarAman.add("Halo");

        String teksAman = daftarAman.get(0);
        System.out.println(teksAman);
    }
}
