package com.indivaragroup.inheritance.exam.company;

public class ManagementEmployee extends Employee{

    public ManagementEmployee(String name, int age) {
        super(name, age);
    }

    public void checkRetirement(Employee employee) {

        if (employee.age > 55) {

            System.out.println(employee.name + " > 55 YEARS OLD");
            System.out.println("HEAD HRD SUGGEST TO RETIREMENT");

        } else {

            System.out.println(employee.name + " NOT RETIREMENT YET");
        }
    }
}
