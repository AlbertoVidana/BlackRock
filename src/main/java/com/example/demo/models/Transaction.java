package com.example.demo.models;

public class Transaction {
    private String date;
    private Double amount;
    private Double celling;
    private Double remanent;

    public Transaction() {
        // Default constructor
    }

    public Transaction(String date, Double amount, Double celling, Double remanent) {
        this.date = date;
        this.amount = amount;
        this.celling = celling;
        this.remanent = remanent;
    }

    public String getDate() {
        return date;
    }   
    public void setDate(String date) {
        this.date = date;
    }
    public Double getAmount() {
        return amount;  
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Double getCelling() {
        return celling;
    }
    public void setCelling(Double celling) {
        this.celling = celling;
    }
    public Double getRemanent() {
        return remanent;
    }
    public void setRemanent(Double remanent) {
        this.remanent = remanent;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date='" + date + '\'' +
                ", amount=" + amount +
                ", celling=" + celling +
                ", remanent=" + remanent +
                '}'; 
    }
}
