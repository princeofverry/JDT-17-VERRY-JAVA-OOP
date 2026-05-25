package com.indivaragroup.polymorphism.exam.traditional.food.stall.drink;

public class HotDrink extends Drink {

    public HotDrink(String name, String category, int price) {
        super(name, category, price);
    }

    @Override
    public void showDrink() {
        System.out.println("Hot Drink : "
                + name
                + " | "
                + category
                + " | Rp" + price);
    }
}
