package com.indivaragroup.generic.entry;

public class Entry <K, V>{

    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {

        Entry<String, Integer> temp = new Entry<>("Test Ram 8 GB", 8);
        System.out.println(temp.getValue());
        System.out.println(temp.toString());
    }
}
