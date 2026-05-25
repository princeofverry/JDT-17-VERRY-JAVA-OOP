package com.indivaragroup;

import com.indivaragroup.inheritance.exam.company.JuniorEmployee;
import com.indivaragroup.inheritance.exam.company.ManagementEmployee;
import com.indivaragroup.inheritance.exam.company.SeniorEmployee;

public class Main {
    public static void main(String[] args) {

        // 1. buatkan struktur organisasi dalam sebuah perusahaan pt JDT 17 MAJU
        //    SEJAHTERA MANDIRI
        //    Meliputi karyawan lengkap dengan nama, umur, gaji, dan posisi
        // 2. Secara struktur organisasinya karyawan harus digolongkan berdasarkan umurnya
        //    EG: kalau umurnya masih masih muda 20 - 25 _ ini posisi junior. Kalau 25 - 35
        //    posisi middle to senior
        // 3. Secara level dan struktur organisasi harus bisa mentargetkan gaji nya
        //    berdasarkan level / posisi, tambahan klo ada karyawan diatas umur 55. bilang possi
        //    head hrd suruh pensiun
        // 4. buatkn class inheritance / extends dan objeknya dr poin 1 - 3
        // NP : Nama attribute, tipe data harus benar:
        // 1. Kalo duit (big decimal) kalo diprint bentuk gajinya (10,000,000)
        // 2. ama orang dibuat uppercase ini bisa make (object) .toUpperCase()


        System.out.println("PT JDT 17 MAJU SEJAHTERA MANDIRI");
        System.out.println("================================");

        JuniorEmployee emp1 =
                new JuniorEmployee("Verry", 23);

        SeniorEmployee emp2 =
                new SeniorEmployee("Budi", 27);

        SeniorEmployee emp3 =
                new SeniorEmployee("Joko", 58);

        ManagementEmployee hrd =
                new ManagementEmployee("Andi", 45);

        emp1.showInfoEmployee();
        emp2.showInfoEmployee();
        emp3.showInfoEmployee();

        hrd.checkRetirement(emp1);

        hrd.checkRetirement(emp2);

        hrd.checkRetirement(emp3);

    }
}