package com.indivaragroup.challenge.scanner.util;

import com.indivaragroup.challenge.scanner.dto.ReceiptDTO;
import com.indivaragroup.challenge.scanner.service.ReceiptGenerator;
import com.indivaragroup.challenge.scanner.service.ReceiptService;
import com.indivaragroup.challenge.scanner.validation.ValidationException;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Properties;
import java.util.Scanner;

public class ReceiptUtil {

    public static ReceiptDTO[] collectReceipts(
            Scanner scanner,
            Properties properties
    ) {

        ReceiptDTO[] receipts = new ReceiptDTO[3];
        ReceiptService service = new ReceiptService();
        int index = 0;

        while (true) {

            try {
                ReceiptDTO receipt = service.createReceipt();
                receipts[index] = receipt;
                index++;

            } catch (ValidationException exception) {
                System.out.println("VALIDATION ERROR : " + exception.getMessage());
                continue;

            } catch (Exception exception) {
                System.out.println("ERROR : INVALID INPUT");
                continue;
            }

            if (index == 3) {
                System.out.println("\nMAXIMUM RECEIPT REACHED!");
                break;
            }

            System.out.print("\nCREATE RECEIPT AGAIN Y/N? ");

            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("N")) {
                System.out.println("FINISH!");
                break;
            }
        }

        return receipts;
    }

    public static void printReceipt(
            ReceiptDTO[] receipts,
            Properties properties
    ) {

        String receiptText =
                ReceiptGenerator.generateReceipt(
                        receipts,
                        properties
                );

        System.out.println("\nDECODED RECEIPT:");

        System.out.println(receiptText);

        String encoded =
                Base64.getEncoder()
                        .encodeToString(
                                receiptText.getBytes(
                                        StandardCharsets.UTF_8
                                )
                        );

        System.out.println("\nENCODED RECEIPT:");

        System.out.println(encoded);
    }
}