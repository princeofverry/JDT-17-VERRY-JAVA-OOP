//package com.indivaragroup.inheritance.exam.company;
//
//public class ManagementEmployee extends Employee{
//
//    public ManagementEmployee(String name, int age) {
//        super(name, age);
//    }
//
//    public void checkRetirement(Employee employee) {
//
//        if (employee.age > 55) {
//            System.out.println(employee.name + " > 55 YEARS OLD");
//            System.out.println("HEAD HRD SUGGEST TO RETIREMENT");
//        } else {
//            System.out.println(employee.name + " NOT RETIREMENT YET");
//        }
//    }
//}

package com.indivaragroup.inheritance.exam.company;

import com.indivaragroup.interfacing.company.ManagementAction;

public class ManagementEmployee extends Employee implements ManagementAction {

    public ManagementEmployee(String name, int age) {
        super(name, age);
    }

    @Override
    public void checkRetirement(Employee employee) {

        if (employee.age > 55) {

            System.out.println(employee.name + " > 55 YEARS OLD");
            System.out.println("HEAD HRD SUGGEST TO RETIREMENT");

        } else {

            System.out.println(employee.name + " NOT RETIREMENT YET");
        }
    }
}