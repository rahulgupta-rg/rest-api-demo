package com.api.demo.restapi.model;

import java.util.Date;

public class Transaction {

    private String transactionId;

    private Date creationTs;

    private CurrencyCode currencyCode;

    private Double amount;

    private String userId;

    private TransactionStatus transactionStatus;

    private PaymentStatus paymentStatus;

    public Transaction(String transactionId, Date creationTs, CurrencyCode currencyCode, Double amount, String userId, TransactionStatus transactionStatus, PaymentStatus paymentStatus) {
        this.transactionId = transactionId;
        this.creationTs = creationTs;
        this.currencyCode = currencyCode;
        this.amount = amount;
        this.userId = userId;
        this.transactionStatus = transactionStatus;
        this.paymentStatus = paymentStatus;
    }

    public Transaction() {
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getCreationTs() {
        return creationTs;
    }

    public void setCreationTs(Date creationTs) {
        this.creationTs = creationTs;
    }

    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", creationTs=" + creationTs +
                ", currencyCode=" + currencyCode +
                ", amount=" + amount +
                ", userId='" + userId + '\'' +
                ", transactionStatus=" + transactionStatus +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}
