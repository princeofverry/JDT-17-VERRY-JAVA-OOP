package com.indivaragroup.generic.box;

// Generic
public class Box<T> {
    private T value;

    private void printThisValue(){
        System.out.println("Yeah " + value);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        // String
        Box<String> boxOne = new Box<>();
        boxOne.setValue("bruhhhhhh");
        boxOne.printThisValue();

        // Integer
        Box<Integer> boxTwo = new Box<>();
        boxTwo.setValue(2);
        boxTwo.printThisValue();
    }
}


