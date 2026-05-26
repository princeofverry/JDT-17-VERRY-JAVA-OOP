package com.indivaragroup.challenge.scanner.service;

import com.indivaragroup.challenge.scanner.dto.ReceiptDTO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

public class ReceiptGenerator {

    public String generate(
            List<ReceiptDTO> receipts,
            Properties properties
    ) {

        StringBuffer builder =
                new StringBuffer();

        builder.append("\n");
        builder.append("===== RECEIPT =====\n");

        builder.append("Store      : ")
                .append(
                        properties.getProperty(
                                "store.name"
                        )
                )
                .append("\n");

        builder.append("Cashier    : ")
                .append(
                        properties.getProperty(
                                "cashier.name"
                        )
                )
                .append("\n");

        builder.append("Receipt ID : ")
                .append(UUID.randomUUID())
                .append("\n\n");

        BigDecimal grandSubtotal =
                BigDecimal.ZERO;

        BigDecimal grandTax =
                BigDecimal.ZERO;

        BigDecimal grandTotal =
                BigDecimal.ZERO;

        for (ReceiptDTO receipt : receipts) {

            builder.append(
                            receipt.getNameItem()
                    )
                    .append(" x ")
                    .append(
                            receipt.getQuantityItem()
                    )
                    .append(" = ")
                    .append(
                            receipt.getSubTotal()
                    )
                    .append("\n");

            grandSubtotal =
                    grandSubtotal.add(
                            receipt.getSubTotal()
                    );

            grandTax =
                    grandTax.add(
                            receipt.getTax()
                    );

            grandTotal =
                    grandTotal.add(
                            receipt.getTotal()
                    );
        }

        builder.append("\n");

        builder.append("Subtotal   : ")
                .append(grandSubtotal)
                .append("\n");

        builder.append("Tax        : ")
                .append(grandTax)
                .append("\n");

        builder.append("Total      : ")
                .append(grandTotal)
                .append("\n");

        builder.append(
                "\n===================="
        );

        return builder.toString();
    }
}