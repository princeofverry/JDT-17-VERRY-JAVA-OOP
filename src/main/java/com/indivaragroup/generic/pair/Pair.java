package com.indivaragroup.generic.pair;

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }
    public U getSecond() { return second ;}

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "PASANGAN(" +
                "PERTAMA " + first +
                ", KEDUA " + second +
                "}";
    }

    public static void main(String[] args) {
        Pair<String, Integer> pairOne =  new Pair<String, Integer>("SATU", 1);

        System.out.println(pairOne.getFirst());
        System.out.println(pairOne.getSecond());

        Pair<String, String> hewan = new Pair<>("SAPI", "KOCAK");
        System.out.println(hewan);
    }
}

