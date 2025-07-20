package com.example.demo.repositories;

import com.example.demo.models.InvalidTransaction;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class InvalidTransactionRepository {
    private List<InvalidTransaction> invalidTransactionsList = new ArrayList<>();

    public InvalidTransactionRepository() {
        // Initialize with some dummy invalid transactions for testing
        // invalidTransactionsList.add(new InvalidTransaction("2023-10-01", 110.0, 200.0, 90.0, "Invalid amount"));
        // invalidTransactionsList.add(new InvalidTransaction("2023-10-12 20:15", 250.00, 300.00, 50.00, "Celling exceeded"));
    }

    public List<InvalidTransaction> addInvalidTransaction(List<InvalidTransaction> invalidTransaction) {
        for (InvalidTransaction transaction : invalidTransaction) {
            long i = (long) Math.ceil(transaction.getAmount());
            long result = ((i + 99) / 100);
            transaction.setCelling(result * 100.0);
            transaction.setRemanent(transaction.getCelling() - transaction.getAmount());
            transaction.setErrorMessage("Transaction error due to :");
            invalidTransactionsList.add(transaction);
        }
        return invalidTransactionsList;
    }

    public List<InvalidTransaction> getAll() {
        return invalidTransactionsList;
    }

}
