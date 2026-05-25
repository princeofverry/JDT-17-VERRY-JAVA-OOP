package com.indivaragroup.polymorphism.exam.traditional.food.stall;

/*
    1. Saya punya warung tegal di sini saya harus menampilka
       * menu makanan - ini minimal 5 makanan kl bisa ada kategoriya :
         - Daging
         - Gorengan
         Sub kategori
         - Ikan     - ayam
         - Sapi     - Bakwan
         - Tahu
         Sub kategori
         - goreng
         - rebus
       * menu minuman - ini ada kategorinya dingin / panas / manis / kurang manis
         1. 1-3 aneka minuman - 1- 5 kategori minumannya

    2. Dari menu makanan harus saya harus info harganya berdasarkan sub kategori
       * sub aneka kategorinya

       nb: buat kan class dgn metode polymorphism

 */

import com.indivaragroup.polymorphism.exam.traditional.food.stall.drink.Drink;
import com.indivaragroup.polymorphism.exam.traditional.food.stall.food.Food;
public class TegalFoodStall implements com.indivaragroup.interfacing.traditional.food.stall.TegalFoodStall {

    @Override
    public void showFoodMenu(Food[] foods) {
        System.out.println("===== FOOD MENU =====");

        for (Food food : foods) {
            food.showMenu();
        }
    }

    @Override
    public void showDrinkMenu(Drink[] drinks) {
        System.out.println("\n===== DRINK MENU =====");

        for (Drink drink : drinks) {
            drink.showDrink();
        }
    }
}