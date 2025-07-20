package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.InvalidTransaction;
import com.example.demo.models.TemporaryValidationRestrictions;
import com.example.demo.models.Transaction;
import com.example.demo.models.ValidInvalid;
import com.example.demo.repositories.TransactionRepository;
import com.example.demo.repositories.InvalidTransactionRepository;
import com.example.demo.models.Validator;
import com.example.demo.repositories.TemporaryValidationRestrictionRepository;

import java.util.List;

@RestController
@RequestMapping("/blackrock/challenge/v1/transactions")
public class TransactionController {

    @Autowired
    private TransactionRepository transaccionRepository;

    @Autowired
    private InvalidTransactionRepository invalidTransactionRepository;

    @Autowired
    private TemporaryValidationRestrictionRepository temporaryValidationRestrictionRepository;

    @PostMapping("/parse")
    public ResponseEntity<List<?>> getParse(@RequestBody List<Transaction> transactions) {
        if (transactions == null || transactions.isEmpty()) {
            //TODO: Change null to an empty list or a specific error message
            System.out.println("*********** No transactions to parse *********** ");
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        // TODO: validate one by one and add to a list of errors
        // for (Transaction transaction : transactions) {
        //     if (transaction.getDate() == null || transaction.getAmount() == null ||
        //         transaction.getCelling() == null || transaction.getRemanent() == null) {
        //         return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        //     }
        // }
        transaccionRepository.enrichTransactions(transactions);
        return new ResponseEntity<>(transaccionRepository.getAll(), HttpStatus.OK);
    }

    @GetMapping("/validator")
    public ResponseEntity<ValidInvalid> validator(@RequestBody Validator validator) {
        System.out.println("*********** validator *********** ");
        if (validator.getWage() <= 0 || validator.getTransactions() == null || validator.getTransactions().isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        transaccionRepository.enrichTransactions(validator.getTransactions());
        ValidInvalid validInvalid = new ValidInvalid(invalidTransactionRepository.getAll(), transaccionRepository.getAll());
        return new ResponseEntity<>(validInvalid, HttpStatus.OK);
    }

    @GetMapping("/filter")
    public ResponseEntity<ValidInvalid> filter(@RequestBody TemporaryValidationRestrictions restrictions) {
        System.out.println("*********** filter *********** ");
        transaccionRepository.enrichTransactions(restrictions.getTransactions());
        ValidInvalid validInvalid = new ValidInvalid(temporaryValidationRestrictionRepository.getAll(), transaccionRepository.getAll());
        return new ResponseEntity<>(validInvalid, HttpStatus.OK);
    }   

}
