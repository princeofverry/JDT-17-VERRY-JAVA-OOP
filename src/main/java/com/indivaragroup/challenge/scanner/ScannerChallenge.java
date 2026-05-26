package com.indivaragroup.challenge.scanner;

import com.indivaragroup.challenge.scanner.dto.ReceiptDTO;
import com.indivaragroup.challenge.scanner.service.ConfigService;
import com.indivaragroup.challenge.scanner.service.ReceiptGenerator;
import com.indivaragroup.challenge.scanner.service.ReceiptService;
import com.indivaragroup.challenge.scanner.util.Base64Util;
import com.indivaragroup.challenge.scanner.util.ReceiptSorter;
import com.indivaragroup.challenge.scanner.validation.ValidationException;
import java.util.*;

public class ScannerChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ReceiptDTO> receipts = new ArrayList<>();
        ReceiptService receiptService = new ReceiptService();
        ReceiptGenerator generator = new ReceiptGenerator();
        Properties properties = ConfigService.loadProperties();
        if (properties == null) {
            return;
        }

        int limit = 0;

        while (true) {
            try {
                ReceiptDTO receipt = receiptService.createReceipt();
                receipts.add(receipt);
                limit++;
            } catch (ValidationException exception) {
                System.out.println("VALIDATION ERROR : " + exception.getMessage());
            } catch (Exception exception) {
                System.out.println("ERROR : INVALID INPUT");
            }

            if (limit == 3) {
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

        ReceiptSorter.sortByName(receipts);

        String receiptText =
                generator.generate(
                        receipts,
                        properties
                );

        System.out.println("\nDECODED RECEIPT:");

        System.out.println(receiptText);

        System.out.println("\nENCODED RECEIPT:");

        System.out.println(Base64Util.encode(receiptText));
    }
}
