package com.indivaragroup;

import com.indivaragroup.exception.validation.emloyee.EmployeeValidation;
import com.indivaragroup.exception.validation.emloyee.EmployeeValidationException;
import com.indivaragroup.inheritance.exam.company.Employee;
import com.indivaragroup.inheritance.exam.company.JuniorEmployee;
import com.indivaragroup.inheritance.exam.company.ManagementEmployee;
import com.indivaragroup.inheritance.exam.company.SeniorEmployee;
import com.indivaragroup.polymorphism.exam.traditional.food.stall.*;
import com.indivaragroup.polymorphism.exam.traditional.food.stall.drink.ColdDrink;
import com.indivaragroup.polymorphism.exam.traditional.food.stall.drink.Drink;
import com.indivaragroup.polymorphism.exam.traditional.food.stall.drink.HotDrink;
import com.indivaragroup.polymorphism.exam.traditional.food.stall.food.Food;
import com.indivaragroup.polymorphism.exam.traditional.food.stall.food.FriedFood;
import com.indivaragroup.polymorphism.exam.traditional.food.stall.food.MeatFood;

import java.util.Scanner;

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
        /*
            5. BUATKAN SAYA VALIDASI UNTUK PENDAFTARAN KARYAWAN DI SUATU ORGANISASI
                * VALIDASI NAMA APABILA KOSONG / MINIMAL CHAR ADALAH 5 CHAR
                * VALIDASI UMUR TIDAK BOLEH DIBAWAH DARI UMUR 20 TAHUN
                * VALIDASI UMUR TIDAK BOLEH LEBIH DARI UMUR 35 TAHUN
                * VALIDASI UMUR APABILA ROLE YANG DILAMAR (JAVA DEVELOPER) TIDAK BOLEH DIBAWAH 20 TAHUN
                * VALIDASI ROLE YG DILAMAR TIDAK BOLEH KOSONG

                NB: GUNAKAN EXCETION CLASS DAN SCANNER INPUT UNTUK INISIASI VARIABLE NYA
                BUAT CLASS REFLECTIONNYA BUAT VALIDASI
         */


        System.out.println("PT JDT 17 MAJU SEJAHTERA MANDIRI");
        System.out.println("================================");

//        JuniorEmployee emp1 =
//                new JuniorEmployee("Verry", 23);
//
//        SeniorEmployee emp2 =
//                new SeniorEmployee("Budi", 27);
//
//        SeniorEmployee emp3 =
//                new SeniorEmployee("Joko", 58);
//
//        ManagementEmployee hrd =
//                new ManagementEmployee("Andi", 45);
//
//        emp1.showInfoEmployee();
//        emp2.showInfoEmployee();
//        emp3.showInfoEmployee();
//        hrd.checkRetirement(emp1);
//        hrd.checkRetirement(emp2);
//        hrd.checkRetirement(emp3);

        String[] names = {
                "Verry",
                "Budi",
                "Joko",
                "Andi",
                "Rizky",
                "Dani"
        };

        // HRD
        ManagementEmployee hrd =
                new ManagementEmployee("Michael", 40);

        int nameIndex = 0;

        // looping umur 20 - 55
        for (int age = 20; age <= 55; age++) {
            Employee employee;
            // looping nama biar muter terus
            String name = names[nameIndex];

            nameIndex++;

            if (nameIndex >= names.length) {
                nameIndex = 0;
            }

            if (age >= 20 && age <= 25) {
                employee =
                        new JuniorEmployee(name, age);
            } else {
                employee =
                        new SeniorEmployee(name, age);
            }

            // tampilkan employee
            employee.showInfoEmployee();
            // HRD check retirement
            hrd.checkRetirement(employee);
            System.out.println();
        }

        // employee retirement
        Employee oldEmployee =
                new SeniorEmployee("Retirement Employee", 56);

        oldEmployee.showInfoEmployee();

        hrd.checkRetirement(oldEmployee);

        // warteg kite


        // FOOD
        Food[] foods = {
                new MeatFood("Catfish", "Fish", "Fried", 12000),

                new MeatFood("Chicken Soup", "Chicken", "Boiled", 18000),
                new MeatFood("Fried Chicken", "Chicken", "Fried", 15000), // Tambahan baru

                new MeatFood("Beef Rendang", "Beef", "Fried", 25000),
                new MeatFood("Beef Soup", "Beef", "Boiled", 22000), // Tambahan baru

                // --- KATEGORI: GORENGAN ---
                new FriedFood("Corn Bakwan", "Bakwan", "Fried", 5000),

                new FriedFood("Stuffed Tofu", "Tofu", "Fried", 4000)
        };

        // DRINK
        Drink[] drinks = {
                // --- KATEGORI: DINGIN ---
                new ColdDrink("Iced Tea", "Cold / Sweet", 5000),
                new ColdDrink("Orange Juice", "Cold / Sweet", 8000),
                new ColdDrink("Iced Americano", "Cold / Less Sweet", 12000),

                // --- KATEGORI: PANAS ---
                new HotDrink("Black Coffee", "Hot / Less Sweet", 7000),
                new HotDrink("Hot Sweet Tea", "Hot / Sweet", 5000),
                new HotDrink("Wedang Jahe", "Hot / Less Sweet", 9000)
        };

        TegalFoodStall stall = new TegalFoodStall();

        // SHOW MENU
        stall.showFoodMenu(foods);
        stall.showDrinkMenu(drinks);

        System.out.println("\n");
        System.out.println("Ini adalah  VALIDASI JDT 17 \n");

        // SCANNER
        Scanner input = new Scanner(System.in);

        try {
            // INPUT NAME
            System.out.print("INPUT NAME : ");
            String name = input.nextLine();

            // VALIDASI NAME
            EmployeeValidation.validateName(name);

            // INPUT AGE
            System.out.print("INPUT AGE : ");
            int age = input.nextInt();

            // VALIDASI AGE
            EmployeeValidation.validateAge(age);

            Employee employee;

            employee = new Employee(name, age);

            // di employee udh ada checker role sebenarnya jadi chill saja
//            if (age <= 25) {
//                employee = new JuniorEmployee(name, age);
//            } else {
//                employee = new SeniorEmployee(name, age);
//            }

            employee.showInfoEmployee();

        } catch (EmployeeValidationException e) {
            System.out.println(
                    "VALIDATION ERROR : "
                            + e.getMessage()
            );

        } catch (Exception e) {
            System.out.println("INVALID INPUT");
        }
    }
}