package com.indivaragroup.polymorphism.exam.traditional.food.stall.food;

//public class FriedFood extends Food {
//    String type;
//    String cookType;
//    int price;
//
//    public FriedFood(String name, String type, String cookType, int price) {
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

public class FriedFood extends Food {

    public FriedFood(String name, String type, String cookType, int price) {
        super(name, type, cookType, price);
    }

    @Override
    public void showMenu() {
        System.out.println(
                "[Fried Food] "
                        + "[" + type + "] "
                        + name
                        + " - "
                        + cookType
                        + " | Price : Rp" + price
        );
    }
}
