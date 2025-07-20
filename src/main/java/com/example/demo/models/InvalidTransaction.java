package com.example.demo.models;

public class InvalidTransaction extends Transaction {
    private String errorMessage;

    public InvalidTransaction(String date, Double amount, Double celling, Double remanent, String errorMessage) {
        super(date, amount, celling, remanent);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "InvalidTransaction{" +
                "date='" + getDate() + '\'' +
                ", amount=" + getAmount() +
                ", celling=" + getCelling() +
                ", remanent=" + getRemanent() +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }   

}
