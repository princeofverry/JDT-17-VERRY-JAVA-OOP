package com.indivaragroup.exception.validation.emloyee;

import com.indivaragroup.inheritance.exam.company.Employee;

import java.lang.reflect.Field;

public class EmployeeValidation {

    public static void validate(Employee employee)
            throws IllegalAccessException,
            EmployeeValidationException {

        Field[] fields =
                employee.getClass()
                        .getSuperclass()
                        .getDeclaredFields();

        for (Field field : fields) {

            field.setAccessible(true);

            String fieldName = field.getName();

            Object value = field.get(employee);

            // VALIDATE NAME
            if (fieldName.equals("name")) {

                String name = (String) value;

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

            // VALIDATE AGE
            if (fieldName.equals("age")) {

                int age = (int) value;

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
    }
}