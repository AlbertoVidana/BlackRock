package com.example.demo.repositories;

import com.example.demo.models.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepository {
    private List<Transaction> transactionsList = new ArrayList<>();

      public TransactionRepository(){//List<Transaction> transactionsList) {
        //this.transactionsList = transactionsList;
        // Add some dummy transactions for testing
        // //transactionsList.add(new Transaction("2023-10-01", 110.0, 200.0, 90.0));
        // transactionsList.add(new Transaction("2023-10-12 20:15", 250.00, 300.00, 50.00));
        // transactionsList.add(new Transaction("2023-02-28 15:49", 375.00, 400.00, 25.00));
        // transactionsList.add(new Transaction("2023-07-01 21:59", 620.00, 700.00, 80.00));
        // transactionsList.add(new Transaction("2023-11-12 08:09", 480.00, 500.00, 20.00));
    }

    public List<Transaction> enrichTransactions(List<Transaction> transactions) {
        Map<String, Integer> map = new HashMap<>();
        for (Transaction transaction : transactions) {
            map.put(transaction.getDate(), map.getOrDefault(transaction.getDate(), 0) + 1);
            if (map.get(transaction.getDate()) > 1) {
                System.out.println("Duplicate transaction found for date: " + transaction.getDate());
                // TODO: transaction.setValid(false);
            }
            long i = (long) Math.ceil(transaction.getAmount());
            long result = ((i + 99) / 100);
            transaction.setCelling(result * 100.0);
            transaction.setRemanent(transaction.getCelling() - transaction.getAmount());
        }
        transactionsList.addAll(transactions);
        return transactionsList;
    }
    public List<Transaction> getAll() {
        System.out.println("*********** Fetching all transactions *********** ");
        return transactionsList;
    }
}
