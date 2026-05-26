package com.indivaragroup.challenge.scanner.service;

import com.indivaragroup.challenge.scanner.validation.ValidationException;
import com.indivaragroup.challenge.scanner.dto.ReceiptDTO;
import com.indivaragroup.challenge.scanner.validation.ReceiptValidation;
import com.indivaragroup.challenge.scanner.model.Item;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class ReceiptService {
    public ReceiptDTO createReceipt()
            throws ValidationException {

        Scanner scanner = new Scanner(System.in);
        String receiptId = UUID.randomUUID().toString();

        System.out.print("INPUT ITEM NAME   : ");
        String itemInput = scanner.nextLine();
        Item item = new Item(itemInput);

        System.out.print("INPUT QUANTITY    : ");

        String quantityInput = scanner.nextLine();

        ReceiptValidation.validateQuantity(quantityInput);

        int quantity = Integer.parseInt(quantityInput);

        System.out.print("INPUT PRICE       : ");

        String priceInput = scanner.nextLine();

        ReceiptValidation.validatePrice(priceInput);

        BigDecimal price = new BigDecimal(priceInput);

        BigDecimal subTotal =
                price.multiply(
                        BigDecimal.valueOf(quantity)
                );

        Random random = new Random();

        int randomTax = random.nextInt(20) + 1;

        BigDecimal taxPercent =
                BigDecimal.valueOf(randomTax)
                        .divide(
                                BigDecimal.valueOf(100)
                        );

        BigDecimal tax =
                subTotal.multiply(taxPercent)
                        .setScale(
                                2,
                                RoundingMode.HALF_UP
                        );

        BigDecimal total = subTotal.add(tax);

        return new ReceiptDTO(
                item.getItemName(),
                quantity,
                price,
                subTotal,
                tax,
                total,
                receiptId,
                randomTax
        );
    }
}
