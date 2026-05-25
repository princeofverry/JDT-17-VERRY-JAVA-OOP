package com.indivaragroup.polymorphism.exam.traditional.food.stall.food;
//
//public class MeatFood extends Food {
//
//    String type;
//    String cookType;
//    int price;
//
//    public MeatFood(String name, String type, String cookType, int price) {
//        super(name);
//        this.type = type;
//        this.cookType = cookType;
//        this.price = price;
//    }
//
//    @Override
//    public void showMenu() {
//        System.out.println("[" + type + "] "
//                + name + " - "
//                + cookType
//                + " | Price : Rp" + price);
//    }
//}

public class MeatFood extends Food {

    public MeatFood(String name, String type, String cookType, int price) {
        super(name, type, cookType, price);
    }

    @Override
    public void showMenu() {
        System.out.println(
                "[Meat Food] "
                        + "[" + type + "] "
                        + name
                        + " - "
                        + cookType
                        + " | Price : Rp" + price
        );
    }
}
