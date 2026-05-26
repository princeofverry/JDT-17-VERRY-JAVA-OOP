package com.indivaragroup.challenge.scanner.model;

import com.indivaragroup.challenge.scanner.validation.ValidationException;

public class Item {

    private String itemName;

    public Item(String itemName)
            throws ValidationException {

        validate(itemName);
        this.itemName = itemName;
    }

    private void validate(String itemName)
            throws ValidationException {

        if (itemName == null
                || itemName.trim().isEmpty()) {

            throw new ValidationException(
                    "ITEM NAME CANNOT BE EMPTY"
            );
        }
    }

    public String getItemName() {
        return itemName;
    }
}