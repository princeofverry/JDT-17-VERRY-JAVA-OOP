package com.indivaragroup.inheritance.exam.company;

import com.indivaragroup.interfacing.company.EmployeeAction;

import java.math.BigDecimal;
//
//public class Employee {
//    protected String name;
//    protected int age;
//    protected BigDecimal salary;
//    protected String position;
//
//    public Employee(String name, int age) {
//        this.name = name.toUpperCase();
//        this.age = age;
//
//        if (age >= 20 && age <= 25) {
//            this.position = "JUNIOR STAFF";
//            this.salary = new BigDecimal("5000000");
//        } else if (age > 25 && age <= 35) {
//            this.position = "MIDDLE TO SENIOR";
//            this.salary = new BigDecimal("12000000");
//        } else if (age > 55){
//            this.position = "MUST BE RETIREMENT";
//            this.salary = new BigDecimal("20000000");
//        } else {
//            this.position = " ";
//            this.salary = new BigDecimal(0);
//        }
//    }
//
//    public void showInfoEmployee() {
//        String formattedSalary = String.format("%,d", salary.longValue());
//
//        System.out.println("#####################");
//        System.out.println("NAME: " + name);
//        System.out.println("AGE: " + age + " YEARS OLD");
//        System.out.println("POSITION: " + position);
//        System.out.println("SALARY: Rp." + formattedSalary);
//        System.out.println("#####################");
//
//        if (age > 55) {
//            System.out.println("HEAD HRD : PLEASE RETIRE");
//        }
//    }
//}


public class Employee implements EmployeeAction {

    protected String name;
    protected int age;
    protected BigDecimal salary;
    protected String position;

    public Employee(String name, int age) {
        this.name = name.toUpperCase();
        this.age = age;

        if (age >= 20 && age <= 25) {
            this.position = "JUNIOR STAFF";
            this.salary = new BigDecimal("5000000");

        } else if (age > 25 && age <= 35) {
            this.position = "MIDDLE TO SENIOR";
            this.salary = new BigDecimal("12000000");

        } else if (age > 55) {
            this.position = "MUST BE RETIREMENT";
            this.salary = new BigDecimal("20000000");

        } else {
            this.position = "-";
            this.salary = new BigDecimal("0");
        }
    }

    @Override
    public void showInfoEmployee() {

        String formattedSalary = String.format("%,d", salary.longValue());

        System.out.println("#####################");
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age + " YEARS OLD");
        System.out.println("POSITION: " + position);
        System.out.println("SALARY: Rp." + formattedSalary);
        System.out.println("#####################");
    }
}
