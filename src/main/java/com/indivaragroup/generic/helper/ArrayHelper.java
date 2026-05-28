package com.indivaragroup.generic.helper;

import java.lang.reflect.Array;

public class ArrayHelper {

    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static <T> T takingFirstItem(T[] array) {
        if (array.length == 0) return null;
        return array[0];
    }

    public static void main(String[] args) {
        Integer[] testing = {1, 20, 30, 40, 69, 90};
        String[] name = {"joko", "widowo", "testing"};

        ArrayHelper.printArray(testing);
        System.out.println(ArrayHelper.takingFirstItem(testing));
    }
}
