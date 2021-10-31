package com.api.demo.restapi.service.impl;

import com.api.demo.restapi.model.Transaction;
import com.api.demo.restapi.repository.impl.TransactionRepositoryImpl;
import com.api.demo.restapi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepositoryImpl transactionRepository;

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.createTransaction(transaction);
    }

    @Override
    public Transaction getTransaction(String transactionId) {
        return transactionRepository.getTransaction(transactionId);
    }

    @Override
    public List<Transaction> getAllTransactions(String userId) {
        return transactionRepository.getAllTransactions(userId);
    }
}
