package com.api.demo.restapi.controller;

import com.api.demo.restapi.model.Transaction;
import com.api.demo.restapi.service.impl.TransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class TransactionController {

    @Autowired
    private TransactionServiceImpl transactionService;

    @PostMapping(path = "/transaction")
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        System.out.println("Request received Create Transaction: " +transaction+ System.currentTimeMillis());
        return transactionService.createTransaction(transaction);
    }

    @GetMapping(path = "/transaction")
    public Transaction getTransaction( @RequestParam String transactionId) {
        System.out.println("Request received Get Transaction: " +transactionId+", "+ System.currentTimeMillis());
        return transactionService.getTransaction(transactionId);
    }

    @GetMapping(path = "/transactions")
    public List<Transaction> getTransactions(@RequestParam String userId) {
        System.out.println("Request received All transactions for user id: " +userId+", "+ System.currentTimeMillis());
        return transactionService.getAllTransactions(userId);
    }
}
