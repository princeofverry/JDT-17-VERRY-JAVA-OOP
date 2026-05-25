package com.indivaragroup.inheritance.exam.company;

import java.math.BigDecimal;

public class Employee {
    String name;
    int age;
    BigDecimal salary;
    String position;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;

        if (age >= 20 && age <= 25) {
            this.position = "JUNIOR STAFF";
            this.salary = new BigDecimal("5000000");

        } else if (age > 25 && age <= 35) {
            this.position = "MIDDLE TO SENIOR";
            this.salary = new BigDecimal("12000000");

        } else if (age > 35 && age <= 55) {
            this.position = "HEAD DIVISION";
            this.salary = new BigDecimal("20000000");

        } else {
            this.position = "HEAD HRD";
            this.salary = new BigDecimal("30000000");
        }
    }

    public void showInfoEmployee() {
        String formattedSalary = String.format("%,d", salary.longValue());

        System.out.println("#####################");
        System.out.println("NAME: " + name.toUpperCase());
        System.out.println("AGE: " + age + " YEARS OLD");
        System.out.println("POSITION: " + position);
        System.out.println("SALARY: Rp." + formattedSalary);
        System.out.println("#####################");

        if (age > 55) {
            System.out.println("HEAD HRD : PLEASE RETIRE");
        }
    }
}
