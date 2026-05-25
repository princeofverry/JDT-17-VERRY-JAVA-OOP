package com.indivaragroup.polymorphism.exam.traditional.food.stall.drink;

import com.indivaragroup.interfacing.traditional.food.stall.DrinkMenu;

public abstract class Drink implements DrinkMenu {

    protected String name;
    protected String category;
    protected int price;

    public Drink(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
}

//public class Drink {
//
//    String name;
//    String category;
//    int price;
//
//    public Drink(String name, String category, int price) {
//        this.name = name;
//        this.category = category;
//        this.price = price;
//    }
//
//    public void showDrink() {
//        System.out.println(name + " | " + category + " | Rp" + price);
//    }
//}