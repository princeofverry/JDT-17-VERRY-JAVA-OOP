package com.indivaragroup.polymorphism.exam.traditional.food.stall.drink;

public class ColdDrink extends Drink{
    public ColdDrink(String name, String category, int price) {
        super(name, category, price);
    }

    @Override
    public void showDrink() {
        System.out.println("Cold Drink : "
                + name
                + " | "
                + category
                + " | Rp" + price);
    }
}
