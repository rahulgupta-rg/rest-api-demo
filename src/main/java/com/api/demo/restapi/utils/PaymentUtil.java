package com.api.demo.restapi.utils;

import com.api.demo.restapi.model.Transaction;
import com.api.demo.restapi.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PaymentUtil {

    private static List<Transaction> transactions = new ArrayList<>();

    private static List<User> users = new ArrayList<>();

    public static Transaction addTransaction(Transaction transaction) {
        Optional<User> user1 = users.stream().filter(user -> user.getUserId().equals(transaction.getUserId())).findFirst();
        User u = user1.get();
        u.getTransactions().add(transaction);
        transactions.add(transaction);
        return transaction;
    }

    public static Transaction getTransaction(String transactionId) {
        Optional<Transaction> result = transactions
                .stream()
                .filter(transaction -> transaction.getTransactionId().equals(transactionId)).findFirst();
        return result.get();
    }

    public static List<Transaction> getAllTransactions(String userId) {
        List<Transaction> result = transactions
                .stream()
                .filter(transaction -> transaction.getUserId().equals(userId)).collect(Collectors.toList());
        return result;
    }

    public static User createUser(User user) {
        users.add(user);
        return user;
    }

    public static User getUser(String userId) {
        return users.stream().filter(user -> user.getUserId().equals(userId)).findFirst().get();
    }

    public static Boolean isAuthenticated(String userId, String password) {
        Optional<User> userResult = users.stream()
                .filter(user -> user.getUserId().equals(userId) && user.getPassword().equals(password)).findFirst();
        return userResult.isPresent();
    }


}
