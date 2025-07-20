package com.example.demo.models;

import java.util.List;

public class ValidInvalid {
    private List<Transaction> valid;
    private List<InvalidTransaction> invalid;

    public ValidInvalid(List<InvalidTransaction> invalid, List<Transaction> valid) {
        this.invalid = invalid;
        this.valid = valid;
    }
    public List<Transaction> getValid() {
        return valid;
    }
    public void setValid(List<Transaction> valid) {
        this.valid = valid;
    }
    public List<InvalidTransaction> getInvalid() {
        return invalid;
    }
    public void setInvalid(List<InvalidTransaction> invalid) {
        this.invalid = invalid;
    }
}
