package com.indivaragroup.generic.boundedtypeparameter;

public class KotakAngka <T extends Number>{

    private T data;

    public double nilaiDouble() {
        return data.doubleValue();
    }

    public static void main(String[] args) {
        KotakAngka<Integer> kotakOne = new KotakAngka<>();
        KotakAngka<Double> kotakTwo = new KotakAngka<>();

//        KotakAngka<String> kotakTiga = new KotakAngka<String>(); // gonna be error
    }
}
