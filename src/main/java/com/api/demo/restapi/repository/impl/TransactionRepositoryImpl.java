package com.api.demo.restapi.repository.impl;

import com.api.demo.restapi.model.Transaction;
import com.api.demo.restapi.repository.TransactionRepository;
import com.api.demo.restapi.utils.PaymentUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransactionRepositoryImpl implements TransactionRepository {

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return PaymentUtil.addTransaction(transaction);
    }

    @Override
    public Transaction getTransaction(String transactionId) {
        return PaymentUtil.getTransaction(transactionId);
    }

    @Override
    public List<Transaction> getAllTransactions(String userId) {
        return PaymentUtil.getAllTransactions(userId);
    }
}
