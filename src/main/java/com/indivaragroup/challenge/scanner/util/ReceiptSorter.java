package com.indivaragroup.challenge.scanner.util;

import com.indivaragroup.challenge.scanner.dto.ReceiptDTO;

import java.util.Comparator;
import java.util.List;

public class ReceiptSorter {

    public static void sortByName(
            List<ReceiptDTO> receipts
    ) {

        receipts.sort(
                Comparator.comparing(
                        ReceiptDTO::getNameItem
                )
        );
    }
}