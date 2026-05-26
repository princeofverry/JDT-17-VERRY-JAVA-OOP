package com.indivaragroup.challenge.scanner.validation;

import java.util.regex.Pattern;

public class ReceiptValidation {

    private static final Pattern QUANTITY_REGEX = Pattern.compile("^[1-9][0-9]*$");
    private static final Pattern PRICE_REGEX = Pattern.compile("^\\d+(\\.\\d{1,2})?$");

    public static void validateQuantity(
            String quantity
    ) throws ValidationException {

        if (!QUANTITY_REGEX
                .matcher(quantity)
                .matches()) {

            throw new ValidationException(
                    "INVALID QUANTITY FORMAT"
            );
        }
    }

    public static void validatePrice(
            String price
    ) throws ValidationException {

        if (!PRICE_REGEX
                .matcher(price)
                .matches()) {

            throw new ValidationException(
                    "INVALID PRICE FORMAT"
            );
        }
    }
}