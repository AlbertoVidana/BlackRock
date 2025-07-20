package com.example.demo.models;

import com.example.demo.helper.K;
import com.example.demo.helper.P;
import com.example.demo.helper.Q;

import java.util.List;

public class TemporaryValidationRestrictions extends Transaction {
    private List<Transaction> transactions;
    private List<InvalidTransaction> invalidTransactions;
    private List<Q> listQ;
    private List<P> listP;  
    private List<K> listK;
    private double wage;


    public TemporaryValidationRestrictions(String date, Double amount, Double celling, Double remanent,
                                           List<Transaction> transactions, List<InvalidTransaction> invalidTransactions,
                                           List<Q> listQ, List<P> listP, List<K> listK, double wage) {
        super(date, amount, celling, remanent);
        this.transactions = transactions;
        this.invalidTransactions = invalidTransactions;
        this.listQ = listQ;
        this.listP = listP;
        this.listK = listK;
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
    public List<Q> getListQ() {
        return listQ;
    }
    public void setListQ(List<Q> listQ) {
        this.listQ = listQ;
    }   
    public List<P> getListP() {
        return listP;
    }
    public void setListP(List<P> listP) {
        this.listP = listP;
    }
    public List<K> getListK() {
        return listK;
    }
    public void setListK(List<K> listK) {
        this.listK = listK;
    }
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
}
