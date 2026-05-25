package com.indivaragroup.interfacing.traditional.food.stall;

import com.indivaragroup.polymorphism.exam.traditional.food.stall.drink.Drink;
import com.indivaragroup.polymorphism.exam.traditional.food.stall.food.Food;

public interface TegalFoodStall {

    void showFoodMenu(Food[] foods);

    void showDrinkMenu(Drink[] drinks);
}