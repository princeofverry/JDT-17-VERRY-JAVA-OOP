package com.indivaragroup.challenge.scanner.dto;

import java.math.BigDecimal;

public class ReceiptDTO {
    String nameItem;
    int quantityItem;
    // perubahan big decimal challenge
    BigDecimal priceItem;
    BigDecimal subTotal;
    BigDecimal tax;
    BigDecimal total;

    String receiptId;
    int taxPercent;

    public ReceiptDTO(String nameItem, int quantityItem, BigDecimal priceItem, BigDecimal subTotal, BigDecimal tax, BigDecimal total, String receiptId, int taxPercent) {
        this.nameItem = nameItem;
        this.quantityItem = quantityItem;
        this.priceItem = priceItem;
        this.subTotal = subTotal;
        this.tax = tax;
        this.total = total;
        this.receiptId = receiptId;
        this.taxPercent = taxPercent;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public int getQuantityItem() {
        return quantityItem;
    }

    public void setQuantityItem(int quantityItem) {
        this.quantityItem = quantityItem;
    }

    public BigDecimal getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(BigDecimal priceItem) {
        this.priceItem = priceItem;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public int getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(int taxPercent) {
        this.taxPercent = taxPercent;
    }
}
