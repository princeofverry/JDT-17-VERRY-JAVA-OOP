package com.indivaragroup.generic.boundedtypeparameter;

abstract class Bentuk implements Comparable<Bentuk> {
    abstract double hitungLuas();

    @Override
    public int compareTo(Bentuk lain) {
        return Double.compare(this.hitungLuas(), lain.hitungLuas());
    }
}

class Lingkaran extends Bentuk {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }
}

class Persegi extends Bentuk {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}
