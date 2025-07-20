package com.example.demo.models;

import com.example.demo.models.Transaction;
import com.example.demo.models.InvalidTransaction;
import java.util.List;

public class Validator {
    private double wage;
    private List<Transaction> transactions;
    private List<InvalidTransaction> invalidTransactions;

    public Validator(double wage, List<Transaction> transactions, List<InvalidTransaction> invalidTransactions) {
        this.wage = wage;
        this.transactions = transactions;
        this.invalidTransactions = invalidTransactions;
    }
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
    public void setTransactions(List<Transaction> transactions) {   
        this.transactions = transactions;
    }

    public List<InvalidTransaction> getInvalidTransactions() {
        return invalidTransactions;
    }
    public void setInvalidTransactions(List<InvalidTransaction> invalidTransactions) {
        this.invalidTransactions = invalidTransactions;
    }

}
