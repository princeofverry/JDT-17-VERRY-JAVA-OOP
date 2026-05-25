package com.indivaragroup.polymorphism.exam.traditional.food.stall.food;

import com.indivaragroup.interfacing.traditional.food.stall.FoodMenu;

public abstract class Food implements FoodMenu {

    protected String name;
    protected String type;
    protected String cookType;
    protected int price;

    public Food(String name, String type, String cookType, int price) {
        this.name = name;
        this.type = type;
        this.cookType = cookType;
        this.price = price;
    }
}


//public class Food {
//    String name;
//
//    public Food(String name) {
//        this.name = name;
//    }
//
//    public void showMenu() {
//        System.out.println("Food menu");
//    }
//}