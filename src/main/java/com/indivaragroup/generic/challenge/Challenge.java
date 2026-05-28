package com.indivaragroup.generic.challenge;


public class Challenge {

    /*
        buatkan class dan functionnya dmn dia akan membedakan tipe data dan
        dia akan menggunakan 1 parameter generic (parameter array), yang penting dia bisa membedakan jenis tipe data yang akan masuk ke method .
        kalua string dia akan print print namanya doang
        kalua number dia kalkulasi nambah nambah aja
        kalua Boolean dia akan di negasi
     */

    public static <T> void processArray(T[] array) {

        // checking array null / zero
        if (array == null || array.length == 0) {
            System.out.println("ARRAY KOSONG!");
            return;
        }

        // taking the first item on array
        Object firstItem = array[0];

        // if string
        if (firstItem instanceof String) {
            System.out.println("STRING PROCESS");
            for (T item : array) {
                System.out.println("STRING : " + item);
            }
        }

        // if number
        else if (firstItem instanceof Number) {
            System.out.println("NUMBER PROCESS");
            int total = 0;

            for (T item : array) {
                Number number = (Number) item;
                int before = total;
                total += ((Number) item).intValue();
                System.out.println(before + " + " + item +" = " + total);
            }

            System.out.println("Total : " + total);
        }
        // if boolean
        else if (firstItem instanceof Boolean) {
            System.out.println("BOOLEAN PROCESS");

            for (T item : array) {
                Boolean flag = (boolean) item;
                System.out.println(item + " -> " + !flag);
            }
        }
        else {
            System.out.println("UNKNOWN TYPE DATA!");
        }

    }

    // process string
//    private static void processString(String[] array) {
//        System.out.println("STRING PROCESS");
//
//        for (String item : array) {
//            System.out.println("STRING : " + item + " ");
//        }
//    }
//
//    // process number
//    private static void processNumber(Number[] array) {
//        System.out.println("NUMBER PROCESS");
//
//        int total = 0;
//
//        for (Number item : array) {
//            int before = total;
//            total += item.intValue();
//            System.out.println(before + " + " + item +" = " + total);
//        }
//
//        System.out.println("Total : " + total);
//    }
//
//    // !boolean
//    private static void processBoolean(Boolean[] array) {
//        System.out.println("BOOLEAN PROCESS");
//
//
//        for (Boolean item : array) {
//            System.out.println(item + " -> " + !item);
//        }
//    }

    public static void main(String[] args) {
        String[] names = {
                "Verry",
                "Budi",
                "Andi"
        };

        Integer[] numbers = {
                10,
                20,
                30
        };

        Boolean[] flags = {
                true,
                false,
                true
        };

        Challenge.processArray(names);
        System.out.println();
        Challenge.processArray(numbers);
        System.out.println();
        Challenge.processArray(flags);
    }
}
