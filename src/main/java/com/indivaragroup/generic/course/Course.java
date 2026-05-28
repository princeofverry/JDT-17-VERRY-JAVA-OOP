package com.indivaragroup.generic.course;

/*
Sebuah platform kursus online ingin membuat sistem sederhana untuk menyimpan nilai
peserta dan menentukan status kelulusan.

Requirement :
1. Buat Generic Class
Buat class:
Course<T>
Class memiliki atribut:
-namaPeserta
-nilai
Gunakan generic untuk tipe data nilai (T).

2. Method dalam Class
Buat method:
void tampilkanData()
Untuk menampilkan data peserta.

3. Logic Penilaian
Buat pengecekan menggunakan if else:
Nilai	Keterangan
>= 85	Excellent
>= 70	Good
>= 50	Remedial
< 50	Failed

REQ:
meminta input jumlah peserta
menggunakan looping untuk input seluruh data peserta
menampilkan seluruh hasil di akhir
hitung rata-rata nilai
hitung jumlah peserta lulus
tampilkan peserta dengan nilai tertinggi

Ketentuan Tambahan
Gunakan:
generic class
array atau ArrayList
looping
nested if boleh digunakan
Nilai menggunakan tipe Integer

Contoh Output
Masukkan jumlah peserta: 3

Peserta 1
Nama: Andi
Nilai: 90

Peserta 2
Nama: Budi
Nilai: 72

Peserta 3
Nama: Citra
Nilai: 45

===== HASIL =====
Nama Peserta : Andi
Nilai         : 90
Status        : Excellent

Nama Peserta : Budi
Nilai         : 72
Status        : Good

Nama Peserta : Citra
Nilai         : 45
Status        : Failed
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Course<T> {
    private String namaPeserta;
    private T nilai;

    public Course(String namaPeserta, T nilai) {
        this.namaPeserta = namaPeserta;
        this.nilai = nilai;
    }

    public String getNamaPeserta() {
        return namaPeserta;
    }

    public T getNilai() {
        return nilai;
    }
    public void tampilkanData() {
        // state nilai
        int n  = (Integer) nilai;

        System.out.println("NAMA PESERTA    : " + namaPeserta);
        System.out.println("NILAI           : " + nilai);

        // checking STATUS
        if (n >= 85) {
            System.out.println("STATUS          : Excellent");
        } else if (n >= 70) {
            System.out.println("STATUS          : Good");
        } else if (n >= 50) {
            System.out.println("STATUS          : Remedial");
        } else {
            System.out.println("STATUS          : Failed");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Course<Integer>> daftarPeserta = new ArrayList<>();

        System.out.print("Masukkan jumlah peserta : ");
        int jumlah = input.nextInt();
        // validasi
        if (jumlah <= 0) {
            System.out.println("MASUKKAN ANGKA DENGAN BENAR");
            return;
        }
        input.nextLine();

        int totalNilai = 0;
        int jumlahLulus = 0;

        // nyatet nilai tertinggi
        Course<Integer> nilaiTertinggi = null;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPESERTA KE-" + (i + 1));

            System.out.print("NAMA    :");
            String nama = input.nextLine();
            if(nama.trim().isEmpty()) {
                System.out.println("NAMA ANDA TIDAK BOLEH KOSONG CING");
                return;
            }

            System.out.print("Nilai    : ");
            // validasi
            if (!input.hasNextInt()) {
                System.out.println("INPUT NILAI HARUS ANGKA");
                return;
            }

            int nilai = input.nextInt();
            // validasi
            if (nilai < 0 || nilai > 100) {
                System.out.println("NILAI HARUS 0 - 100");
                return;
            }
            input.nextLine();

            Course<Integer> peserta = new Course<>(nama, nilai);
            // simpen peserta dengan nilainya
            daftarPeserta.add(peserta);

            totalNilai += nilai;

            if(nilai >= 50) {
                jumlahLulus++;
            }

            if (nilaiTertinggi == null ||
                    nilai > nilaiTertinggi.getNilai()) {
                nilaiTertinggi = peserta;
            }


        }

        System.out.println("\n HASIL \n");

        // showing each personel
        for(Course<Integer> peserta : daftarPeserta) {
            peserta.tampilkanData();
        }

        double rataRata = (double) totalNilai / jumlah;

        System.out.println("NILAI RATA-RATA     : " + rataRata);
        System.out.println("JUMLAH LULUS        : " + jumlahLulus);
        System.out.println("\nPeserta Nilai Tertinggi");
        System.out.println("Nama  : " + nilaiTertinggi.getNamaPeserta());
        System.out.println("Nilai : " + nilaiTertinggi.getNilai());

        input.close();
    }
}
