package com.indivaragroup.javaclass.service;

import java.util.*;

public class ScannerService {

    public void testScanner() {
        System.out.println("Masukkan apapun!");
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();

        int hours = date.getHours();
        int minutes = date.getMinutes();
        int second = date.getSeconds();

        String doSomething = scanner.nextLine();

        System.out.println("input = output = " + doSomething + " waktu: " + hours + ":" + minutes + ":" + second);

        scanner.close();
    }


    public static void main(String[] args) {
//        ScannerService scannerw = new ScannerService();
//
//        scannerw.testScanner();

        for(int i = 0; i < 10; i++) {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
        }

        String query = "Captur3 Th3 Fl4g";

        String encode = Base64.getEncoder().encodeToString(query.getBytes());
        System.out.println(encode);

        String decode = new String(Base64.getDecoder().decode(encode));
        System.out.println(decode);

        Random random = new Random();

        for(int i = 0; i < 100; i++) {
            var value = random.nextInt(10);
            System.out.println(value);
        }
    }

}
