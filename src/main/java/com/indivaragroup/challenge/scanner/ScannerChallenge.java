package com.indivaragroup.challenge.scanner;

import com.indivaragroup.challenge.scanner.dto.ReceiptDTO;
import com.indivaragroup.challenge.scanner.util.ConfigUtil;
import com.indivaragroup.challenge.scanner.util.ReceiptUtil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Properties;
import java.util.Scanner;

public class ScannerChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Properties properties = ConfigUtil.loadProperties();
        if (properties == null) {
            return;
        }

        ReceiptDTO[] receipts =
                ReceiptUtil.collectReceipts(
                        scanner,
                        properties
                );

        Arrays.sort(
                receipts,
                Comparator.nullsLast(
                        Comparator.comparing(
                                ReceiptDTO::getNameItem
                        )
                )
        );

        ReceiptUtil.printReceipt(
                receipts,
                properties
        );
    }
}