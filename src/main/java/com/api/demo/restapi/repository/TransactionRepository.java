package com.api.demo.restapi.repository;

import com.api.demo.restapi.model.Transaction;

import java.util.List;

public interface TransactionRepository {

    Transaction createTransaction(Transaction transaction);
    Transaction getTransaction(String transactionId);
    List<Transaction> getAllTransactions(String userId);

}
