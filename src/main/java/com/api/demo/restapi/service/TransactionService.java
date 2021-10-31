package com.api.demo.restapi.service;

import com.api.demo.restapi.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Transaction transaction);
    Transaction getTransaction(String transactionId);
    List<Transaction> getAllTransactions(String userId);
}
