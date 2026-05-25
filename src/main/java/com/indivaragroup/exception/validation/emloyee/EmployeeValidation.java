package com.indivaragroup.exception.validation.emloyee;

import com.indivaragroup.inheritance.exam.company.Employee;

import java.lang.reflect.Field;

public class EmployeeValidation {

    public static void validateName(String name)
            throws EmployeeValidationException {

        if (name == null || name.trim().isEmpty()) {
            throw new EmployeeValidationException(
                    "NAME CANNOT BE EMPTY"
            );
        }

        if (name.length() < 5) {
            throw new EmployeeValidationException(
                    "MINIMAL NAME MUST BE 5 CHARACTERS"
            );
        }
    }

    public static void validateAge(int age)
            throws EmployeeValidationException {

        if (age < 20) {
            throw new EmployeeValidationException(
                    "AGE CANNOT BELOW 20 YEARS OLD"
            );
        }

        if (age > 35) {
            throw new EmployeeValidationException(
                    "AGE CANNOT MORE THAN 35 YEARS OLD"
            );
        }
    }
}